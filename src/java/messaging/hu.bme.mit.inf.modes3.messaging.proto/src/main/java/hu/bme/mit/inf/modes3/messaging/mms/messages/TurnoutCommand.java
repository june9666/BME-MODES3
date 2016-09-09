// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TurnoutCommand.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

/**
 * Protobuf type {@code TurnoutCommand}
 */
public  final class TurnoutCommand extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:TurnoutCommand)
    TurnoutCommandOrBuilder {
  // Use TurnoutCommand.newBuilder() to construct.
  private TurnoutCommand(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TurnoutCommand() {
    turnoutID_ = 0;
    state_ = 0;
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private TurnoutCommand(
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

            turnoutID_ = input.readUInt32();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            state_ = rawValue;
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
    return hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommandOuterClass.internal_static_TurnoutCommand_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommandOuterClass.internal_static_TurnoutCommand_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand.class, hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand.Builder.class);
  }

  public static final int TURNOUTID_FIELD_NUMBER = 1;
  private int turnoutID_;
  /**
   * <code>optional uint32 turnoutID = 1;</code>
   */
  public int getTurnoutID() {
    return turnoutID_;
  }

  public static final int STATE_FIELD_NUMBER = 2;
  private int state_;
  /**
   * <code>optional .TurnoutStateValue state = 2;</code>
   */
  public int getStateValue() {
    return state_;
  }
  /**
   * <code>optional .TurnoutStateValue state = 2;</code>
   */
  public hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue getState() {
    hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue result = hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue.valueOf(state_);
    return result == null ? hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue.UNRECOGNIZED : result;
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
    if (turnoutID_ != 0) {
      output.writeUInt32(1, turnoutID_);
    }
    if (state_ != hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue.STRAIGHT.getNumber()) {
      output.writeEnum(2, state_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (turnoutID_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(1, turnoutID_);
    }
    if (state_ != hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue.STRAIGHT.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, state_);
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
    if (!(obj instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand)) {
      return super.equals(obj);
    }
    hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand other = (hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand) obj;

    boolean result = true;
    result = result && (getTurnoutID()
        == other.getTurnoutID());
    result = result && state_ == other.state_;
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptorForType().hashCode();
    hash = (37 * hash) + TURNOUTID_FIELD_NUMBER;
    hash = (53 * hash) + getTurnoutID();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parseFrom(
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
  public static Builder newBuilder(hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand prototype) {
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
   * Protobuf type {@code TurnoutCommand}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:TurnoutCommand)
      hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommandOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommandOuterClass.internal_static_TurnoutCommand_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommandOuterClass.internal_static_TurnoutCommand_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand.class, hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand.Builder.class);
    }

    // Construct using hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand.newBuilder()
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
      turnoutID_ = 0;

      state_ = 0;

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommandOuterClass.internal_static_TurnoutCommand_descriptor;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand getDefaultInstanceForType() {
      return hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand.getDefaultInstance();
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand build() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand buildPartial() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand result = new hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand(this);
      result.turnoutID_ = turnoutID_;
      result.state_ = state_;
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
      if (other instanceof hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand) {
        return mergeFrom((hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand other) {
      if (other == hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand.getDefaultInstance()) return this;
      if (other.getTurnoutID() != 0) {
        setTurnoutID(other.getTurnoutID());
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
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
      hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int turnoutID_ ;
    /**
     * <code>optional uint32 turnoutID = 1;</code>
     */
    public int getTurnoutID() {
      return turnoutID_;
    }
    /**
     * <code>optional uint32 turnoutID = 1;</code>
     */
    public Builder setTurnoutID(int value) {
      
      turnoutID_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional uint32 turnoutID = 1;</code>
     */
    public Builder clearTurnoutID() {
      
      turnoutID_ = 0;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     * <code>optional .TurnoutStateValue state = 2;</code>
     */
    public int getStateValue() {
      return state_;
    }
    /**
     * <code>optional .TurnoutStateValue state = 2;</code>
     */
    public Builder setStateValue(int value) {
      state_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional .TurnoutStateValue state = 2;</code>
     */
    public hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue getState() {
      hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue result = hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue.valueOf(state_);
      return result == null ? hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .TurnoutStateValue state = 2;</code>
     */
    public Builder setState(hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>optional .TurnoutStateValue state = 2;</code>
     */
    public Builder clearState() {
      
      state_ = 0;
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


    // @@protoc_insertion_point(builder_scope:TurnoutCommand)
  }

  // @@protoc_insertion_point(class_scope:TurnoutCommand)
  private static final hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand();
  }

  public static hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TurnoutCommand>
      PARSER = new com.google.protobuf.AbstractParser<TurnoutCommand>() {
    public TurnoutCommand parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new TurnoutCommand(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<TurnoutCommand> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TurnoutCommand> getParserForType() {
    return PARSER;
  }

  public hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutCommand getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

