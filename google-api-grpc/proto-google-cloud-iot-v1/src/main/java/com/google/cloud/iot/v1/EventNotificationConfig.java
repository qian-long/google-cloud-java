// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * The configuration for forwarding telemetry events.
 * </pre>
 *
 * Protobuf type {@code google.cloud.iot.v1.EventNotificationConfig}
 */
public final class EventNotificationConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.iot.v1.EventNotificationConfig)
    EventNotificationConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EventNotificationConfig.newBuilder() to construct.
  private EventNotificationConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EventNotificationConfig() {
    subfolderMatches_ = "";
    pubsubTopicName_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private EventNotificationConfig(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              java.lang.String s = input.readStringRequireUtf8();

              pubsubTopicName_ = s;
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              subfolderMatches_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownFieldProto3(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.iot.v1.ResourcesProto
        .internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.iot.v1.EventNotificationConfig.class,
            com.google.cloud.iot.v1.EventNotificationConfig.Builder.class);
  }

  public static final int SUBFOLDER_MATCHES_FIELD_NUMBER = 2;
  private volatile java.lang.Object subfolderMatches_;
  /**
   *
   *
   * <pre>
   * If the subfolder name matches this string exactly, this configuration will
   * be used. The string must not include the leading '/' character. If empty,
   * all strings are matched. This field is used only for telemetry events;
   * subfolders are not supported for state changes.
   * </pre>
   *
   * <code>string subfolder_matches = 2;</code>
   */
  public java.lang.String getSubfolderMatches() {
    java.lang.Object ref = subfolderMatches_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subfolderMatches_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * If the subfolder name matches this string exactly, this configuration will
   * be used. The string must not include the leading '/' character. If empty,
   * all strings are matched. This field is used only for telemetry events;
   * subfolders are not supported for state changes.
   * </pre>
   *
   * <code>string subfolder_matches = 2;</code>
   */
  public com.google.protobuf.ByteString getSubfolderMatchesBytes() {
    java.lang.Object ref = subfolderMatches_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subfolderMatches_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PUBSUB_TOPIC_NAME_FIELD_NUMBER = 1;
  private volatile java.lang.Object pubsubTopicName_;
  /**
   *
   *
   * <pre>
   * A Cloud Pub/Sub topic name. For example,
   * `projects/myProject/topics/deviceEvents`.
   * </pre>
   *
   * <code>string pubsub_topic_name = 1;</code>
   */
  public java.lang.String getPubsubTopicName() {
    java.lang.Object ref = pubsubTopicName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pubsubTopicName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A Cloud Pub/Sub topic name. For example,
   * `projects/myProject/topics/deviceEvents`.
   * </pre>
   *
   * <code>string pubsub_topic_name = 1;</code>
   */
  public com.google.protobuf.ByteString getPubsubTopicNameBytes() {
    java.lang.Object ref = pubsubTopicName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pubsubTopicName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (!getPubsubTopicNameBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, pubsubTopicName_);
    }
    if (!getSubfolderMatchesBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, subfolderMatches_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getPubsubTopicNameBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, pubsubTopicName_);
    }
    if (!getSubfolderMatchesBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, subfolderMatches_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.iot.v1.EventNotificationConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.iot.v1.EventNotificationConfig other =
        (com.google.cloud.iot.v1.EventNotificationConfig) obj;

    boolean result = true;
    result = result && getSubfolderMatches().equals(other.getSubfolderMatches());
    result = result && getPubsubTopicName().equals(other.getPubsubTopicName());
    result = result && unknownFields.equals(other.unknownFields);
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SUBFOLDER_MATCHES_FIELD_NUMBER;
    hash = (53 * hash) + getSubfolderMatches().hashCode();
    hash = (37 * hash) + PUBSUB_TOPIC_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getPubsubTopicName().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.iot.v1.EventNotificationConfig prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The configuration for forwarding telemetry events.
   * </pre>
   *
   * Protobuf type {@code google.cloud.iot.v1.EventNotificationConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.iot.v1.EventNotificationConfig)
      com.google.cloud.iot.v1.EventNotificationConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_EventNotificationConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.iot.v1.EventNotificationConfig.class,
              com.google.cloud.iot.v1.EventNotificationConfig.Builder.class);
    }

    // Construct using com.google.cloud.iot.v1.EventNotificationConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      subfolderMatches_ = "";

      pubsubTopicName_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.iot.v1.ResourcesProto
          .internal_static_google_cloud_iot_v1_EventNotificationConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.EventNotificationConfig getDefaultInstanceForType() {
      return com.google.cloud.iot.v1.EventNotificationConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.EventNotificationConfig build() {
      com.google.cloud.iot.v1.EventNotificationConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.iot.v1.EventNotificationConfig buildPartial() {
      com.google.cloud.iot.v1.EventNotificationConfig result =
          new com.google.cloud.iot.v1.EventNotificationConfig(this);
      result.subfolderMatches_ = subfolderMatches_;
      result.pubsubTopicName_ = pubsubTopicName_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return (Builder) super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.iot.v1.EventNotificationConfig) {
        return mergeFrom((com.google.cloud.iot.v1.EventNotificationConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.iot.v1.EventNotificationConfig other) {
      if (other == com.google.cloud.iot.v1.EventNotificationConfig.getDefaultInstance())
        return this;
      if (!other.getSubfolderMatches().isEmpty()) {
        subfolderMatches_ = other.subfolderMatches_;
        onChanged();
      }
      if (!other.getPubsubTopicName().isEmpty()) {
        pubsubTopicName_ = other.pubsubTopicName_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.cloud.iot.v1.EventNotificationConfig parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.cloud.iot.v1.EventNotificationConfig) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object subfolderMatches_ = "";
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     */
    public java.lang.String getSubfolderMatches() {
      java.lang.Object ref = subfolderMatches_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subfolderMatches_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     */
    public com.google.protobuf.ByteString getSubfolderMatchesBytes() {
      java.lang.Object ref = subfolderMatches_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subfolderMatches_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     */
    public Builder setSubfolderMatches(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      subfolderMatches_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     */
    public Builder clearSubfolderMatches() {

      subfolderMatches_ = getDefaultInstance().getSubfolderMatches();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * If the subfolder name matches this string exactly, this configuration will
     * be used. The string must not include the leading '/' character. If empty,
     * all strings are matched. This field is used only for telemetry events;
     * subfolders are not supported for state changes.
     * </pre>
     *
     * <code>string subfolder_matches = 2;</code>
     */
    public Builder setSubfolderMatchesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      subfolderMatches_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object pubsubTopicName_ = "";
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     */
    public java.lang.String getPubsubTopicName() {
      java.lang.Object ref = pubsubTopicName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pubsubTopicName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     */
    public com.google.protobuf.ByteString getPubsubTopicNameBytes() {
      java.lang.Object ref = pubsubTopicName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pubsubTopicName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     */
    public Builder setPubsubTopicName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      pubsubTopicName_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     */
    public Builder clearPubsubTopicName() {

      pubsubTopicName_ = getDefaultInstance().getPubsubTopicName();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A Cloud Pub/Sub topic name. For example,
     * `projects/myProject/topics/deviceEvents`.
     * </pre>
     *
     * <code>string pubsub_topic_name = 1;</code>
     */
    public Builder setPubsubTopicNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      pubsubTopicName_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFieldsProto3(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.iot.v1.EventNotificationConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.iot.v1.EventNotificationConfig)
  private static final com.google.cloud.iot.v1.EventNotificationConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.iot.v1.EventNotificationConfig();
  }

  public static com.google.cloud.iot.v1.EventNotificationConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventNotificationConfig> PARSER =
      new com.google.protobuf.AbstractParser<EventNotificationConfig>() {
        @java.lang.Override
        public EventNotificationConfig parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new EventNotificationConfig(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<EventNotificationConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventNotificationConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.iot.v1.EventNotificationConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
