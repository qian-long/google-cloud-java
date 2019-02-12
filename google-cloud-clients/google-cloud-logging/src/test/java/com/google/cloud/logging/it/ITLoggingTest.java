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

package com.google.cloud.logging.it;

import com.google.cloud.logging.BaseSystemTest;
import com.google.cloud.logging.Logging;
import com.google.cloud.logging.testing.RemoteLoggingHelper;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.rules.Timeout;

public class ITLoggingTest extends BaseSystemTest {

  @Rule public Timeout globalTimeout = Timeout.seconds(300);

  private static Logging logging;

  @BeforeClass
  public static void beforeClass() {
    RemoteLoggingHelper helper = RemoteLoggingHelper.create();
    logging = helper.getOptions().getService();
  }

  @AfterClass
  public static void afterClass() throws Exception {
    logging.close();
  }

  @Override
  protected Logging logging() {
    return logging;
  }

  @Override
  protected String formatForTest(String resourceName) {
    return RemoteLoggingHelper.formatForTest(resourceName);
  }
}
