// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/videointelligence/v1p1beta1/video_intelligence.proto

package com.google.cloud.videointelligence.v1p1beta1;

public interface ExplicitContentFrameOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.videointelligence.v1p1beta1.ExplicitContentFrame)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   */
  boolean hasTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   */
  com.google.protobuf.Duration getTimeOffset();
  /**
   *
   *
   * <pre>
   * Time-offset, relative to the beginning of the video, corresponding to the
   * video frame for this location.
   * </pre>
   *
   * <code>.google.protobuf.Duration time_offset = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeOffsetOrBuilder();

  /**
   *
   *
   * <pre>
   * Likelihood of the pornography content..
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.Likelihood pornography_likelihood = 2;</code>
   */
  int getPornographyLikelihoodValue();
  /**
   *
   *
   * <pre>
   * Likelihood of the pornography content..
   * </pre>
   *
   * <code>.google.cloud.videointelligence.v1p1beta1.Likelihood pornography_likelihood = 2;</code>
   */
  com.google.cloud.videointelligence.v1p1beta1.Likelihood getPornographyLikelihood();
}
