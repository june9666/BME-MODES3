// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TurnoutCommand.proto

package hu.bme.mit.inf.modes3.messaging.mms.messages;

public interface TurnoutCommandOrBuilder extends
    // @@protoc_insertion_point(interface_extends:TurnoutCommand)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional uint32 turnoutID = 1;</code>
   */
  int getTurnoutID();

  /**
   * <code>optional .TurnoutStateValue state = 2;</code>
   */
  int getStateValue();
  /**
   * <code>optional .TurnoutStateValue state = 2;</code>
   */
  hu.bme.mit.inf.modes3.messaging.mms.messages.TurnoutStateValue getState();
}
