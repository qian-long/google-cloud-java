// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/privacy/dlp/v2/dlp.proto

package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * Container for bytes to inspect or redact.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.ByteContentItem}
 */
public final class ByteContentItem extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.ByteContentItem)
    ByteContentItemOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ByteContentItem.newBuilder() to construct.
  private ByteContentItem(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ByteContentItem() {
    type_ = 0;
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ByteContentItem(
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
          case 8:
            {
              int rawValue = input.readEnum();

              type_ = rawValue;
              break;
            }
          case 18:
            {
              data_ = input.readBytes();
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
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ByteContentItem_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_ByteContentItem_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.ByteContentItem.class,
            com.google.privacy.dlp.v2.ByteContentItem.Builder.class);
  }

  /** Protobuf enum {@code google.privacy.dlp.v2.ByteContentItem.BytesType} */
  public enum BytesType implements com.google.protobuf.ProtocolMessageEnum {
    /** <code>BYTES_TYPE_UNSPECIFIED = 0;</code> */
    BYTES_TYPE_UNSPECIFIED(0),
    /** <code>IMAGE = 6;</code> */
    IMAGE(6),
    /** <code>IMAGE_JPEG = 1;</code> */
    IMAGE_JPEG(1),
    /** <code>IMAGE_BMP = 2;</code> */
    IMAGE_BMP(2),
    /** <code>IMAGE_PNG = 3;</code> */
    IMAGE_PNG(3),
    /** <code>IMAGE_SVG = 4;</code> */
    IMAGE_SVG(4),
    /** <code>TEXT_UTF8 = 5;</code> */
    TEXT_UTF8(5),
    UNRECOGNIZED(-1),
    ;

    /** <code>BYTES_TYPE_UNSPECIFIED = 0;</code> */
    public static final int BYTES_TYPE_UNSPECIFIED_VALUE = 0;
    /** <code>IMAGE = 6;</code> */
    public static final int IMAGE_VALUE = 6;
    /** <code>IMAGE_JPEG = 1;</code> */
    public static final int IMAGE_JPEG_VALUE = 1;
    /** <code>IMAGE_BMP = 2;</code> */
    public static final int IMAGE_BMP_VALUE = 2;
    /** <code>IMAGE_PNG = 3;</code> */
    public static final int IMAGE_PNG_VALUE = 3;
    /** <code>IMAGE_SVG = 4;</code> */
    public static final int IMAGE_SVG_VALUE = 4;
    /** <code>TEXT_UTF8 = 5;</code> */
    public static final int TEXT_UTF8_VALUE = 5;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /** @deprecated Use {@link #forNumber(int)} instead. */
    @java.lang.Deprecated
    public static BytesType valueOf(int value) {
      return forNumber(value);
    }

    public static BytesType forNumber(int value) {
      switch (value) {
        case 0:
          return BYTES_TYPE_UNSPECIFIED;
        case 6:
          return IMAGE;
        case 1:
          return IMAGE_JPEG;
        case 2:
          return IMAGE_BMP;
        case 3:
          return IMAGE_PNG;
        case 4:
          return IMAGE_SVG;
        case 5:
          return TEXT_UTF8;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<BytesType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<BytesType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<BytesType>() {
          public BytesType findValueByNumber(int number) {
            return BytesType.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.privacy.dlp.v2.ByteContentItem.getDescriptor().getEnumTypes().get(0);
    }

    private static final BytesType[] VALUES = values();

    public static BytesType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private BytesType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.privacy.dlp.v2.ByteContentItem.BytesType)
  }

  public static final int TYPE_FIELD_NUMBER = 1;
  private int type_;
  /**
   *
   *
   * <pre>
   * The type of data stored in the bytes string. Default will be TEXT_UTF8.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
   */
  public int getTypeValue() {
    return type_;
  }
  /**
   *
   *
   * <pre>
   * The type of data stored in the bytes string. Default will be TEXT_UTF8.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
   */
  public com.google.privacy.dlp.v2.ByteContentItem.BytesType getType() {
    @SuppressWarnings("deprecation")
    com.google.privacy.dlp.v2.ByteContentItem.BytesType result =
        com.google.privacy.dlp.v2.ByteContentItem.BytesType.valueOf(type_);
    return result == null
        ? com.google.privacy.dlp.v2.ByteContentItem.BytesType.UNRECOGNIZED
        : result;
  }

  public static final int DATA_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString data_;
  /**
   *
   *
   * <pre>
   * Content data to inspect or redact.
   * </pre>
   *
   * <code>bytes data = 2;</code>
   */
  public com.google.protobuf.ByteString getData() {
    return data_;
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
    if (type_
        != com.google.privacy.dlp.v2.ByteContentItem.BytesType.BYTES_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, type_);
    }
    if (!data_.isEmpty()) {
      output.writeBytes(2, data_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (type_
        != com.google.privacy.dlp.v2.ByteContentItem.BytesType.BYTES_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, type_);
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, data_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.ByteContentItem)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.ByteContentItem other =
        (com.google.privacy.dlp.v2.ByteContentItem) obj;

    boolean result = true;
    result = result && type_ == other.type_;
    result = result && getData().equals(other.getData());
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + type_;
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.ByteContentItem parseFrom(
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

  public static Builder newBuilder(com.google.privacy.dlp.v2.ByteContentItem prototype) {
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
   * Container for bytes to inspect or redact.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.ByteContentItem}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.ByteContentItem)
      com.google.privacy.dlp.v2.ByteContentItemOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ByteContentItem_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ByteContentItem_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.ByteContentItem.class,
              com.google.privacy.dlp.v2.ByteContentItem.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.ByteContentItem.newBuilder()
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
      type_ = 0;

      data_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_ByteContentItem_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ByteContentItem getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.ByteContentItem.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ByteContentItem build() {
      com.google.privacy.dlp.v2.ByteContentItem result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.ByteContentItem buildPartial() {
      com.google.privacy.dlp.v2.ByteContentItem result =
          new com.google.privacy.dlp.v2.ByteContentItem(this);
      result.type_ = type_;
      result.data_ = data_;
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
      if (other instanceof com.google.privacy.dlp.v2.ByteContentItem) {
        return mergeFrom((com.google.privacy.dlp.v2.ByteContentItem) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.ByteContentItem other) {
      if (other == com.google.privacy.dlp.v2.ByteContentItem.getDefaultInstance()) return this;
      if (other.type_ != 0) {
        setTypeValue(other.getTypeValue());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
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
      com.google.privacy.dlp.v2.ByteContentItem parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.privacy.dlp.v2.ByteContentItem) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int type_ = 0;
    /**
     *
     *
     * <pre>
     * The type of data stored in the bytes string. Default will be TEXT_UTF8.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     *
     *
     * <pre>
     * The type of data stored in the bytes string. Default will be TEXT_UTF8.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
     */
    public Builder setTypeValue(int value) {
      type_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of data stored in the bytes string. Default will be TEXT_UTF8.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
     */
    public com.google.privacy.dlp.v2.ByteContentItem.BytesType getType() {
      @SuppressWarnings("deprecation")
      com.google.privacy.dlp.v2.ByteContentItem.BytesType result =
          com.google.privacy.dlp.v2.ByteContentItem.BytesType.valueOf(type_);
      return result == null
          ? com.google.privacy.dlp.v2.ByteContentItem.BytesType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The type of data stored in the bytes string. Default will be TEXT_UTF8.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
     */
    public Builder setType(com.google.privacy.dlp.v2.ByteContentItem.BytesType value) {
      if (value == null) {
        throw new NullPointerException();
      }

      type_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of data stored in the bytes string. Default will be TEXT_UTF8.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.ByteContentItem.BytesType type = 1;</code>
     */
    public Builder clearType() {

      type_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Content data to inspect or redact.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     */
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     *
     *
     * <pre>
     * Content data to inspect or redact.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      data_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Content data to inspect or redact.
     * </pre>
     *
     * <code>bytes data = 2;</code>
     */
    public Builder clearData() {

      data_ = getDefaultInstance().getData();
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.ByteContentItem)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.ByteContentItem)
  private static final com.google.privacy.dlp.v2.ByteContentItem DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.ByteContentItem();
  }

  public static com.google.privacy.dlp.v2.ByteContentItem getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ByteContentItem> PARSER =
      new com.google.protobuf.AbstractParser<ByteContentItem>() {
        @java.lang.Override
        public ByteContentItem parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ByteContentItem(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ByteContentItem> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ByteContentItem> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.ByteContentItem getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
