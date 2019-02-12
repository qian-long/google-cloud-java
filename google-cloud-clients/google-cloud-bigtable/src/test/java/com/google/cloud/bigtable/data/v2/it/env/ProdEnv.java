/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.google.cloud.bigtable.data.v2.it.env;

import com.google.api.core.ApiFuture;
import com.google.api.core.ApiFutures;
import com.google.api.gax.rpc.ServerStream;
import com.google.cloud.bigtable.data.v2.BigtableDataClient;
import com.google.cloud.bigtable.data.v2.models.Query;
import com.google.cloud.bigtable.data.v2.models.Row;
import com.google.cloud.bigtable.data.v2.models.RowMutation;
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/**
 * Test environment that uses an existing bigtable table. The table must have a pre-existing family
 * {@code cf}. The target table is configured via the system properties:
 *
 * <ul>
 *   <li>{@code bigtable.project}
 *   <li>{@code bigtable.instance}
 *   <li>{@code bigtable.table}
 * </ul>
 */
public class ProdEnv implements TestEnv {
  private static final String PROJECT_PROPERTY_NAME = "bigtable.project";
  private static final String INSTANCE_PROPERTY_NAME = "bigtable.instance";
  private static final String TABLE_PROPERTY_NAME = "bigtable.table";

  private final String projectId;
  private final String instanceId;
  private final String tableId;
  private static final String FAMILY_ID = "cf";
  private String rowPrefix;

  private BigtableDataClient dataClient;

  static ProdEnv fromSystemProperties() {
    return new ProdEnv(
        getRequiredProperty(PROJECT_PROPERTY_NAME),
        getRequiredProperty(INSTANCE_PROPERTY_NAME),
        getRequiredProperty(TABLE_PROPERTY_NAME));
  }

  public ProdEnv(String projectId, String instanceId, String tableId) {
    this.projectId = projectId;
    this.instanceId = instanceId;
    this.tableId = tableId;
    this.rowPrefix = UUID.randomUUID() + "-";
  }

  @Override
  public void start() throws IOException {
    dataClient = BigtableDataClient.create(projectId, instanceId);
  }

  @Override
  public void stop() throws Exception {
    deleteRows();
    dataClient.close();
  }

  @Override
  public BigtableDataClient getDataClient() {
    return dataClient;
  }

  @Override
  public String getProjectId() {
    return projectId;
  }

  @Override
  public String getInstanceId() {
    return instanceId;
  }

  @Override
  public String getTableId() {
    return tableId;
  }

  @Override
  public String getFamilyId() {
    return FAMILY_ID;
  }

  @Override
  public String getRowPrefix() {
    return rowPrefix;
  }

  private void deleteRows() throws InterruptedException, ExecutionException, TimeoutException {
    Query query = Query.create(tableId).prefix(rowPrefix);

    List<ApiFuture<Void>> futures = Lists.newArrayList();
    ServerStream<Row> rows = dataClient.readRows(query);
    for (Row row : rows) {
      ApiFuture<Void> future =
          dataClient.mutateRowAsync(RowMutation.create(tableId, row.getKey()).deleteRow());
      futures.add(future);
    }

    ApiFutures.allAsList(futures).get(10, TimeUnit.MINUTES);
  }

  private static String getRequiredProperty(String prop) {
    String value = System.getProperty(prop);
    if (value == null || value.isEmpty()) {
      throw new RuntimeException("Missing system property: " + prop);
    }
    return value;
  }
}
