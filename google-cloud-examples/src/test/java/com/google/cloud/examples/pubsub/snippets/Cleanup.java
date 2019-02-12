/*
 * Copyright 2017 Google LLC
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

package com.google.cloud.examples.pubsub.snippets;

import com.google.cloud.pubsub.v1.SubscriptionAdminClient;
import com.google.cloud.pubsub.v1.TopicAdminClient;
import com.google.pubsub.v1.ProjectSubscriptionName;
import com.google.pubsub.v1.ProjectTopicName;

class Cleanup {

  protected static void deleteTestTopicsAndSubscriptions(
      String projectId, String[] topics, String[] subscriptions) throws Exception {
    deleteTestTopics(projectId, topics);
    deleteTestSubscriptions(projectId, subscriptions);
  }

  private static void deleteTestTopics(String projectId, String[] testTopics) throws Exception {
    try (TopicAdminClient topicAdminClient = TopicAdminClient.create()) {
      for (String topicId : testTopics) {
        try {
          topicAdminClient.deleteTopic(ProjectTopicName.of(projectId, topicId));
          System.out.println("Topic deleted : " + topicId);
        } catch (Exception e) {
          // do nothing catch clause
        }
      }
    }
  }

  private static void deleteTestSubscriptions(String projectId, String[] subscriptions)
      throws Exception {
    try (SubscriptionAdminClient subscriptionAdminClient = SubscriptionAdminClient.create()) {
      for (String subscriptionId : subscriptions) {
        try {
          subscriptionAdminClient.deleteSubscription(
              ProjectSubscriptionName.of(projectId, subscriptionId));
          System.out.println("Subscription deleted : " + subscriptionId);
        } catch (Exception e) {
          // do nothing catch clause
        }
      }
    }
  }
}
