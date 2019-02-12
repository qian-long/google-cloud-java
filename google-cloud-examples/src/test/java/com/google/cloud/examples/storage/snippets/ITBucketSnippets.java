/*
 * Copyright 2016 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.examples.storage.snippets;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import com.google.cloud.Identity;
import com.google.cloud.Policy;
import com.google.cloud.storage.Acl;
import com.google.cloud.storage.Acl.Role;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;
import com.google.cloud.storage.BucketInfo;
import com.google.cloud.storage.Storage;
import com.google.cloud.storage.StorageException;
import com.google.cloud.storage.StorageRoles;
import com.google.cloud.storage.testing.RemoteStorageHelper;
import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.rules.Timeout;

public class ITBucketSnippets {

  private static final Logger log = Logger.getLogger(ITBucketSnippets.class.getName());
  private static final String BUCKET = RemoteStorageHelper.generateBucketName();
  private static final String USER_EMAIL = "test@test.com";
  private static final String BLOB1 = "blob1";
  private static final String BLOB2 = "blob2";
  private static final String BLOB3 = "blob3";
  private static final String BLOB4 = "blob4";

  private static Storage storage;
  private static BucketSnippets bucketSnippets;
  private static BucketIamSnippets bucketIamSnippets;

  @Rule public ExpectedException thrown = ExpectedException.none();

  @Rule public Timeout globalTimeout = Timeout.seconds(300);

  @BeforeClass
  public static void beforeClass() {
    RemoteStorageHelper helper = RemoteStorageHelper.create();
    storage = helper.getOptions().getService();
    bucketSnippets = new BucketSnippets(storage.create(BucketInfo.of(BUCKET)));
    bucketIamSnippets = new BucketIamSnippets();
  }

  @AfterClass
  public static void afterClass() throws ExecutionException, InterruptedException {
    if (storage != null) {
      boolean wasDeleted = RemoteStorageHelper.forceDelete(storage, BUCKET, 5, TimeUnit.SECONDS);
      if (!wasDeleted && log.isLoggable(Level.WARNING)) {
        log.log(Level.WARNING, "Deletion of bucket {0} timed out, bucket is not empty", BUCKET);
      }
    }
  }

  @Test
  public void testBucket() throws InterruptedException {
    assertTrue(bucketSnippets.exists());
    Bucket bucket = bucketSnippets.reload();
    assertNotNull(bucket);
    Bucket updatedBucket = bucketSnippets.update();
    assertTrue(updatedBucket.versioningEnabled());
    Blob blob1 = bucketSnippets.createBlobFromByteArray(BLOB1);
    assertNotNull(blob1);
    Blob blob2 = bucketSnippets.createBlobFromByteArrayWithContentType(BLOB2);
    assertNotNull(blob2);
    Blob blob3 = bucketSnippets.createBlobFromInputStream(BLOB3);
    assertNotNull(blob3);
    Blob blob4 = bucketSnippets.createBlobFromInputStreamWithContentType(BLOB4);
    assertNotNull(blob4);
    Set<Blob> blobSet = Sets.newHashSet(bucketSnippets.listBlobs().iterateAll());
    while (blobSet.size() < 4) {
      Thread.sleep(500);
      blobSet = Sets.newHashSet(bucketSnippets.listBlobs().iterateAll());
    }
    assertTrue(blobSet.contains(blob1));
    assertTrue(blobSet.contains(blob2));
    assertTrue(blobSet.contains(blob3));
    assertTrue(blobSet.contains(blob4));
    blob1 = bucketSnippets.getBlob(BLOB1, blob1.getGeneration());
    assertEquals(BLOB1, blob1.getName());
    List<Blob> blobs = bucketSnippets.getBlobFromStrings(BLOB2, BLOB3);
    assertEquals(BLOB2, blobs.get(0).getName());
    assertEquals(BLOB3, blobs.get(1).getName());
    blobs = bucketSnippets.getBlobFromStringIterable(BLOB3, BLOB4);
    assertEquals(BLOB3, blobs.get(0).getName());
    assertEquals(BLOB4, blobs.get(1).getName());
    // test ACLs
    assertNull(bucketSnippets.getAcl());
    assertNotNull(bucketSnippets.createAcl());
    Acl updatedAcl = bucketSnippets.updateAcl();
    assertEquals(Role.OWNER, updatedAcl.getRole());
    Set<Acl> acls = Sets.newHashSet(bucketSnippets.listAcls());
    assertTrue(acls.contains(updatedAcl));
    assertTrue(bucketSnippets.deleteAcl());
    assertNull(bucketSnippets.getAcl());
    // test default ACLs
    assertNull(bucketSnippets.getDefaultAcl());
    assertNotNull(bucketSnippets.createDefaultAcl());
    updatedAcl = bucketSnippets.updateDefaultAcl();
    assertEquals(Role.OWNER, updatedAcl.getRole());
    acls = Sets.newHashSet(bucketSnippets.listDefaultAcls());
    assertTrue(acls.contains(updatedAcl));
    assertTrue(bucketSnippets.deleteDefaultAcl());
    assertNull(bucketSnippets.getDefaultAcl());
    thrown.expect(StorageException.class);
    assertTrue(bucketSnippets.delete());
  }

  @Test
  public void testListBucketIamMembers() {
    // Test an added Bucket-level IAM member is listed
    Policy policy = storage.getIamPolicy(BUCKET);
    policy =
        storage.setIamPolicy(BUCKET, policy.toBuilder().removeRole(StorageRoles.admin()).build());
    assertNull(policy.getBindings().get(StorageRoles.admin()));
    policy =
        storage.setIamPolicy(
            BUCKET,
            policy
                .toBuilder()
                .addIdentity(StorageRoles.admin(), Identity.user(USER_EMAIL))
                .build());
    assertTrue(policy.getBindings().get(StorageRoles.admin()).contains(Identity.user(USER_EMAIL)));
    Policy snippetPolicy = bucketIamSnippets.listBucketIamMembers(BUCKET);
    assertTrue(
        snippetPolicy.getBindings().get(StorageRoles.admin()).contains(Identity.user(USER_EMAIL)));
  }

  @Test
  public void testAddBucketIamMemeber() {
    // Test a member is added to Bucket-level IAM
    Policy policy = storage.getIamPolicy(BUCKET);
    policy =
        storage.setIamPolicy(BUCKET, policy.toBuilder().removeRole(StorageRoles.admin()).build());
    assertNull(policy.getBindings().get(StorageRoles.admin()));
    Policy snippetPolicy =
        bucketIamSnippets.addBucketIamMember(
            BUCKET, StorageRoles.admin(), Identity.user(USER_EMAIL));
    assertTrue(
        snippetPolicy.getBindings().get(StorageRoles.admin()).contains(Identity.user(USER_EMAIL)));
  }

  @Test
  public void testRemoveBucketIamMember() {
    // Test a member is removed from Bucket-level IAM
    Policy policy = storage.getIamPolicy(BUCKET);
    policy =
        storage.setIamPolicy(BUCKET, policy.toBuilder().removeRole(StorageRoles.admin()).build());
    assertNull(policy.getBindings().get(StorageRoles.admin()));
    policy =
        storage.setIamPolicy(
            BUCKET,
            policy
                .toBuilder()
                .addIdentity(StorageRoles.admin(), Identity.user(USER_EMAIL))
                .build());
    assertTrue(policy.getBindings().get(StorageRoles.admin()).contains(Identity.user(USER_EMAIL)));
    Policy snippetPolicy =
        bucketIamSnippets.removeBucketIamMember(
            BUCKET, StorageRoles.admin(), Identity.user(USER_EMAIL));
    assertNull(snippetPolicy.getBindings().get(StorageRoles.admin()));
  }
}
