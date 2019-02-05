// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/pubsub/v1/pubsub.proto

package com.google.pubsub.v1;

public interface StreamingPullResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.pubsub.v1.StreamingPullResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. This will not be empty.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  java.util.List<com.google.pubsub.v1.ReceivedMessage> getReceivedMessagesList();
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. This will not be empty.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  com.google.pubsub.v1.ReceivedMessage getReceivedMessages(int index);
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. This will not be empty.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  int getReceivedMessagesCount();
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. This will not be empty.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  java.util.List<? extends com.google.pubsub.v1.ReceivedMessageOrBuilder>
      getReceivedMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Received Pub/Sub messages. This will not be empty.
   * </pre>
   *
   * <code>repeated .google.pubsub.v1.ReceivedMessage received_messages = 1;</code>
   */
  com.google.pubsub.v1.ReceivedMessageOrBuilder getReceivedMessagesOrBuilder(int index);
}
