// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TurnoutCommand.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public final class TurnoutCommandOuterClass {
  private TurnoutCommandOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_TurnoutCommand_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_TurnoutCommand_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\024TurnoutCommand.proto\032\013Enums.proto\"F\n\016T" +
      "urnoutCommand\022\021\n\tturnoutID\030\001 \001(\r\022!\n\005stat" +
      "e\030\002 \001(\0162\022.TurnoutStateValueB0\n,hu.bme.mi" +
      "t.inf.modes3.messaging.mms.messagesP\001b\006p" +
      "roto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor(),
        }, assigner);
    internal_static_TurnoutCommand_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_TurnoutCommand_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_TurnoutCommand_descriptor,
        new java.lang.String[] { "TurnoutID", "State", });
    hu.bme.mit.inf.modes3.messaging.mms.messages.Enums.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
