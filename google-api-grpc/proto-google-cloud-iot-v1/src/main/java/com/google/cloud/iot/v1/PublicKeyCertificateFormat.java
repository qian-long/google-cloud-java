// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/iot/v1/resources.proto

package com.google.cloud.iot.v1;

/**
 *
 *
 * <pre>
 * The supported formats for the public key.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.iot.v1.PublicKeyCertificateFormat}
 */
public enum PublicKeyCertificateFormat implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The format has not been specified. This is an invalid default value and
   * must not be used.
   * </pre>
   *
   * <code>UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT = 0;</code>
   */
  UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT(0),
  /**
   *
   *
   * <pre>
   * An X.509v3 certificate ([RFC5280](https://www.ietf.org/rfc/rfc5280.txt)),
   * encoded in base64, and wrapped by `-----BEGIN CERTIFICATE-----` and
   * `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>X509_CERTIFICATE_PEM = 1;</code>
   */
  X509_CERTIFICATE_PEM(1),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The format has not been specified. This is an invalid default value and
   * must not be used.
   * </pre>
   *
   * <code>UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT = 0;</code>
   */
  public static final int UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT_VALUE = 0;
  /**
   *
   *
   * <pre>
   * An X.509v3 certificate ([RFC5280](https://www.ietf.org/rfc/rfc5280.txt)),
   * encoded in base64, and wrapped by `-----BEGIN CERTIFICATE-----` and
   * `-----END CERTIFICATE-----`.
   * </pre>
   *
   * <code>X509_CERTIFICATE_PEM = 1;</code>
   */
  public static final int X509_CERTIFICATE_PEM_VALUE = 1;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /** @deprecated Use {@link #forNumber(int)} instead. */
  @java.lang.Deprecated
  public static PublicKeyCertificateFormat valueOf(int value) {
    return forNumber(value);
  }

  public static PublicKeyCertificateFormat forNumber(int value) {
    switch (value) {
      case 0:
        return UNSPECIFIED_PUBLIC_KEY_CERTIFICATE_FORMAT;
      case 1:
        return X509_CERTIFICATE_PEM;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PublicKeyCertificateFormat>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PublicKeyCertificateFormat>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PublicKeyCertificateFormat>() {
            public PublicKeyCertificateFormat findValueByNumber(int number) {
              return PublicKeyCertificateFormat.forNumber(number);
            }
          };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.iot.v1.ResourcesProto.getDescriptor().getEnumTypes().get(5);
  }

  private static final PublicKeyCertificateFormat[] VALUES = values();

  public static PublicKeyCertificateFormat valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PublicKeyCertificateFormat(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.iot.v1.PublicKeyCertificateFormat)
}
