// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/dialogflow/v2beta1/agent.proto

package com.google.cloud.dialogflow.v2beta1;

public final class AgentProto {
  private AgentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n+google/cloud/dialogflow/v2beta1/agent."
          + "proto\022\037google.cloud.dialogflow.v2beta1\032\034"
          + "google/api/annotations.proto\032#google/lon"
          + "grunning/operations.proto\032\033google/protob"
          + "uf/empty.proto\032 google/protobuf/field_ma"
          + "sk.proto\032\034google/protobuf/struct.proto\"\202"
          + "\003\n\005Agent\022\016\n\006parent\030\001 \001(\t\022\024\n\014display_name"
          + "\030\002 \001(\t\022\035\n\025default_language_code\030\003 \001(\t\022 \n"
          + "\030supported_language_codes\030\004 \003(\t\022\021\n\ttime_"
          + "zone\030\005 \001(\t\022\023\n\013description\030\006 \001(\t\022\022\n\navata"
          + "r_uri\030\007 \001(\t\022\026\n\016enable_logging\030\010 \001(\010\022D\n\nm"
          + "atch_mode\030\t \001(\01620.google.cloud.dialogflo"
          + "w.v2beta1.Agent.MatchMode\022 \n\030classificat"
          + "ion_threshold\030\n \001(\002\"V\n\tMatchMode\022\032\n\026MATC"
          + "H_MODE_UNSPECIFIED\020\000\022\025\n\021MATCH_MODE_HYBRI"
          + "D\020\001\022\026\n\022MATCH_MODE_ML_ONLY\020\002\"!\n\017GetAgentR"
          + "equest\022\016\n\006parent\030\001 \001(\t\"L\n\023SearchAgentsRe"
          + "quest\022\016\n\006parent\030\001 \001(\t\022\021\n\tpage_size\030\002 \001(\005"
          + "\022\022\n\npage_token\030\003 \001(\t\"g\n\024SearchAgentsResp"
          + "onse\0226\n\006agents\030\001 \003(\0132&.google.cloud.dial"
          + "ogflow.v2beta1.Agent\022\027\n\017next_page_token\030"
          + "\002 \001(\t\"#\n\021TrainAgentRequest\022\016\n\006parent\030\001 \001"
          + "(\t\"7\n\022ExportAgentRequest\022\016\n\006parent\030\001 \001(\t"
          + "\022\021\n\tagent_uri\030\002 \001(\t\"L\n\023ExportAgentRespon"
          + "se\022\023\n\tagent_uri\030\001 \001(\tH\000\022\027\n\ragent_content"
          + "\030\002 \001(\014H\000B\007\n\005agent\"[\n\022ImportAgentRequest\022"
          + "\016\n\006parent\030\001 \001(\t\022\023\n\tagent_uri\030\002 \001(\tH\000\022\027\n\r"
          + "agent_content\030\003 \001(\014H\000B\007\n\005agent\"\\\n\023Restor"
          + "eAgentRequest\022\016\n\006parent\030\001 \001(\t\022\023\n\tagent_u"
          + "ri\030\002 \001(\tH\000\022\027\n\ragent_content\030\003 \001(\014H\000B\007\n\005a"
          + "gent2\264\007\n\006Agents\022\220\001\n\010GetAgent\0220.google.cl"
          + "oud.dialogflow.v2beta1.GetAgentRequest\032&"
          + ".google.cloud.dialogflow.v2beta1.Agent\"*"
          + "\202\323\344\223\002$\022\"/v2beta1/{parent=projects/*}/age"
          + "nt\022\256\001\n\014SearchAgents\0224.google.cloud.dialo"
          + "gflow.v2beta1.SearchAgentsRequest\0325.goog"
          + "le.cloud.dialogflow.v2beta1.SearchAgents"
          + "Response\"1\202\323\344\223\002+\022)/v2beta1/{parent=proje"
          + "cts/*}/agent:search\022\224\001\n\nTrainAgent\0222.goo"
          + "gle.cloud.dialogflow.v2beta1.TrainAgentR"
          + "equest\032\035.google.longrunning.Operation\"3\202"
          + "\323\344\223\002-\"(/v2beta1/{parent=projects/*}/agen"
          + "t:train:\001*\022\227\001\n\013ExportAgent\0223.google.clou"
          + "d.dialogflow.v2beta1.ExportAgentRequest\032"
          + "\035.google.longrunning.Operation\"4\202\323\344\223\002.\")"
          + "/v2beta1/{parent=projects/*}/agent:expor"
          + "t:\001*\022\227\001\n\013ImportAgent\0223.google.cloud.dial"
          + "ogflow.v2beta1.ImportAgentRequest\032\035.goog"
          + "le.longrunning.Operation\"4\202\323\344\223\002.\")/v2bet"
          + "a1/{parent=projects/*}/agent:import:\001*\022\232"
          + "\001\n\014RestoreAgent\0224.google.cloud.dialogflo"
          + "w.v2beta1.RestoreAgentRequest\032\035.google.l"
          + "ongrunning.Operation\"5\202\323\344\223\002/\"*/v2beta1/{"
          + "parent=projects/*}/agent:restore:\001*B\250\001\n#"
          + "com.google.cloud.dialogflow.v2beta1B\nAge"
          + "ntProtoP\001ZIgoogle.golang.org/genproto/go"
          + "ogleapis/cloud/dialogflow/v2beta1;dialog"
          + "flow\370\001\001\242\002\002DF\252\002\037Google.Cloud.Dialogflow.V"
          + "2beta1b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
        descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.google.api.AnnotationsProto.getDescriptor(),
          com.google.longrunning.OperationsProto.getDescriptor(),
          com.google.protobuf.EmptyProto.getDescriptor(),
          com.google.protobuf.FieldMaskProto.getDescriptor(),
          com.google.protobuf.StructProto.getDescriptor(),
        },
        assigner);
    internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_dialogflow_v2beta1_Agent_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_Agent_descriptor,
            new java.lang.String[] {
              "Parent",
              "DisplayName",
              "DefaultLanguageCode",
              "SupportedLanguageCodes",
              "TimeZone",
              "Description",
              "AvatarUri",
              "EnableLogging",
              "MatchMode",
              "ClassificationThreshold",
            });
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_GetAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_SearchAgentsResponse_descriptor,
            new java.lang.String[] {
              "Agents", "NextPageToken",
            });
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_TrainAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ExportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ExportAgentResponse_descriptor,
            new java.lang.String[] {
              "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_ImportAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_dialogflow_v2beta1_RestoreAgentRequest_descriptor,
            new java.lang.String[] {
              "Parent", "AgentUri", "AgentContent", "Agent",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.AnnotationsProto.http);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
