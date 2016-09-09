// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrainFunctionCommand.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

/**
 * Protobuf type {@code TrainFunctionCommand}
 */
public  final class TrainFunctionCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TrainFunctionCommand)
    TrainFunctionCommandOrBuilder {
  // Use TrainFunctionCommand.newBuilder() to construct.
  private TrainFunctionCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TrainFunctionCommand() {
    trainID_ = 0;
    registerField_ = 0;
    registerValue_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TrainFunctionCommand(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 8: {

            trainID_ = input.readUInt32();
            break;
          }
          case 16: {

            registerField_ = input.readUInt32();
            break;
          }
          case 24: {

            registerValue_ = input.readUInt32();
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommandOuterClass.internal_static_TrainFunctionCommand_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommandOuterClass.internal_static_TrainFunctionCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand.class, hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand.Builder.class);
  }

  public static final int TRAINID_FIELD_NUMBER = 1;
  private int trainID_;
  /**
   * <code>optional uint32 trainID = 1;</code>
   */
  public int getTrainID() {
    return trainID_;
  }

  public static final int REGISTERFIELD_FIELD_NUMBER = 2;
  private int registerField_;
  /**
   * <code>optional uint32 registerField = 2;</code>
   */
  public int getRegisterField() {
    return registerField_;
  }

  public static final int REGISTERVALUE_FIELD_NUMBER = 3;
  private int registerValue_;
  /**
   * <code>optional uint32 registerValue = 3;</code>
   */
  public int getRegisterValue() {
    return registerValue_;
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (trainID_ != 0) {
      output.writeUInt32(1, trainID_);
    }
    if (registerField_ != 0) {
      output.writeUInt32(2, registerField_);
    }
    if (registerValue_ != 0) {
      output.writeUInt32(3, registerValue_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (trainID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, trainID_);
    }
    if (registerField_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, registerField_);
    }
    if (registerValue_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, registerValue_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand)) {
      return super.equals(obj);
    }
    hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand other = (hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand) obj;

    boolean result = true;
    result = result && (getTrainID()
        == other.getTrainID());
    result = result && (getRegisterField()
        == other.getRegisterField());
    result = result && (getRegisterValue()
        == other.getRegisterValue());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TRAINID_FIELD_NUMBER;
    hash = (53 * hash) + getTrainID();
    hash = (37 * hash) + REGISTERFIELD_FIELD_NUMBER;
    hash = (53 * hash) + getRegisterField();
    hash = (37 * hash) + REGISTERVALUE_FIELD_NUMBER;
    hash = (53 * hash) + getRegisterValue();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code TrainFunctionCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TrainFunctionCommand)
      hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommandOuterClass.internal_static_TrainFunctionCommand_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommandOuterClass.internal_static_TrainFunctionCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand.class, hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand.Builder.class);
    }

    // Construct using hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      trainID_ = 0;

      registerField_ = 0;

      registerValue_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommandOuterClass.internal_static_TrainFunctionCommand_descriptor;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand getDefaultInstanceForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand.getDefaultInstance();
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand build() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand buildPartial() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand result = new hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand(this);
      result.trainID_ = trainID_;
      result.registerField_ = registerField_;
      result.registerValue_ = registerValue_;
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand) {
        return mergeFrom((hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand other) {
      if (other == hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand.getDefaultInstance()) return this;
      if (other.getTrainID() != 0) {
        setTrainID(other.getTrainID());
      }
      if (other.getRegisterField() != 0) {
        setRegisterField(other.getRegisterField());
      }
      if (other.getRegisterValue() != 0) {
        setRegisterValue(other.getRegisterValue());
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int trainID_ ;
    /**
     * <code>optional uint32 trainID = 1;</code>
     */
    public int getTrainID() {
      return trainID_;
    }
    /**
     * <code>optional uint32 trainID = 1;</code>
     */
    public Builder setTrainID(int value) {
      
      trainID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 trainID = 1;</code>
     */
    public Builder clearTrainID() {
      
      trainID_ = 0;
      onChanged();
      return this;
    }

    private int registerField_ ;
    /**
     * <code>optional uint32 registerField = 2;</code>
     */
    public int getRegisterField() {
      return registerField_;
    }
    /**
     * <code>optional uint32 registerField = 2;</code>
     */
    public Builder setRegisterField(int value) {
      
      registerField_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 registerField = 2;</code>
     */
    public Builder clearRegisterField() {
      
      registerField_ = 0;
      onChanged();
      return this;
    }

    private int registerValue_ ;
    /**
     * <code>optional uint32 registerValue = 3;</code>
     */
    public int getRegisterValue() {
      return registerValue_;
    }
    /**
     * <code>optional uint32 registerValue = 3;</code>
     */
    public Builder setRegisterValue(int value) {
      
      registerValue_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 registerValue = 3;</code>
     */
    public Builder clearRegisterValue() {
      
      registerValue_ = 0;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:TrainFunctionCommand)
  }

  // @@protoc_insertion_point(class_scope:TrainFunctionCommand)
  private static final hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand();
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TrainFunctionCommand>
      PARSER = new com.google.protobuf.AbstractParser<TrainFunctionCommand>() {
    public TrainFunctionCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TrainFunctionCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TrainFunctionCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TrainFunctionCommand> getParserForType() {
    return PARSER;
  }

  public hu.bme.mit.inf.modes3.messaging.mms.messages.TrainFunctionCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
