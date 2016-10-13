// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: TrainFunctionCommand.proto

#ifndef PROTOBUF_TrainFunctionCommand_2eproto__INCLUDED
#define PROTOBUF_TrainFunctionCommand_2eproto__INCLUDED

#include <string>

#include <google/protobuf/stubs/common.h>

#if GOOGLE_PROTOBUF_VERSION < 3000000
#error This file was generated by a newer version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please update
#error your headers.
#endif
#if 3000000 < GOOGLE_PROTOBUF_MIN_PROTOC_VERSION
#error This file was generated by an older version of protoc which is
#error incompatible with your Protocol Buffer headers.  Please
#error regenerate this file with a newer version of protoc.
#endif

#include <google/protobuf/arena.h>
#include <google/protobuf/arenastring.h>
#include <google/protobuf/generated_message_util.h>
#include <google/protobuf/metadata.h>
#include <google/protobuf/message.h>
#include <google/protobuf/repeated_field.h>
#include <google/protobuf/extension_set.h>
#include <google/protobuf/unknown_field_set.h>
#include "Enums.pb.h"
// @@protoc_insertion_point(includes)

namespace modes3
{
namespace protobuf
{

    // Internal implementation detail -- do not call these.
    void protobuf_AddDesc_TrainFunctionCommand_2eproto();
    void protobuf_AssignDesc_TrainFunctionCommand_2eproto();
    void protobuf_ShutdownFile_TrainFunctionCommand_2eproto();

    class TrainFunctionCommand;

    // ===================================================================

    class TrainFunctionCommand
        : public ::google::protobuf::
              Message /* @@protoc_insertion_point(class_definition:modes3.protobuf.TrainFunctionCommand) */
    {
    public:
        TrainFunctionCommand();
        virtual ~TrainFunctionCommand();

        TrainFunctionCommand(const TrainFunctionCommand& from);

        inline TrainFunctionCommand& operator=(const TrainFunctionCommand& from)
        {
            CopyFrom(from);
            return *this;
        }

        static const ::google::protobuf::Descriptor* descriptor();
        static const TrainFunctionCommand& default_instance();

        void Swap(TrainFunctionCommand* other);

        // implements Message ----------------------------------------------

        inline TrainFunctionCommand* New() const
        {
            return New(NULL);
        }

        TrainFunctionCommand* New(::google::protobuf::Arena* arena) const;
        void CopyFrom(const ::google::protobuf::Message& from);
        void MergeFrom(const ::google::protobuf::Message& from);
        void CopyFrom(const TrainFunctionCommand& from);
        void MergeFrom(const TrainFunctionCommand& from);
        void Clear();
        bool IsInitialized() const;

        int ByteSize() const;
        bool MergePartialFromCodedStream(::google::protobuf::io::CodedInputStream* input);
        void SerializeWithCachedSizes(::google::protobuf::io::CodedOutputStream* output) const;
        ::google::protobuf::uint8* InternalSerializeWithCachedSizesToArray(bool deterministic,
            ::google::protobuf::uint8* output) const;
        ::google::protobuf::uint8* SerializeWithCachedSizesToArray(::google::protobuf::uint8* output) const
        {
            return InternalSerializeWithCachedSizesToArray(false, output);
        }
        int GetCachedSize() const
        {
            return _cached_size_;
        }

    private:
        void SharedCtor();
        void SharedDtor();
        void SetCachedSize(int size) const;
        void InternalSwap(TrainFunctionCommand* other);

    private:
        inline ::google::protobuf::Arena* GetArenaNoVirtual() const
        {
            return _internal_metadata_.arena();
        }
        inline void* MaybeArenaPtr() const
        {
            return _internal_metadata_.raw_arena_ptr();
        }

    public:
        ::google::protobuf::Metadata GetMetadata() const;

        // nested types ----------------------------------------------------

        // accessors -------------------------------------------------------

        // optional uint32 trainID = 1;
        void clear_trainid();
        static const int kTrainIDFieldNumber = 1;
        ::google::protobuf::uint32 trainid() const;
        void set_trainid(::google::protobuf::uint32 value);

        // optional uint32 functionID = 2;
        void clear_functionid();
        static const int kFunctionIDFieldNumber = 2;
        ::google::protobuf::uint32 functionid() const;
        void set_functionid(::google::protobuf::uint32 value);

        // optional .modes3.protobuf.TrainFunctionValue trainFunctionValue = 3;
        void clear_trainfunctionvalue();
        static const int kTrainFunctionValueFieldNumber = 3;
        ::modes3::protobuf::TrainFunctionValue trainfunctionvalue() const;
        void set_trainfunctionvalue(::modes3::protobuf::TrainFunctionValue value);

        // @@protoc_insertion_point(class_scope:modes3.protobuf.TrainFunctionCommand)
    private:
        ::google::protobuf::internal::InternalMetadataWithArena _internal_metadata_;
        bool _is_default_instance_;
        ::google::protobuf::uint32 trainid_;
        ::google::protobuf::uint32 functionid_;
        int trainfunctionvalue_;
        mutable int _cached_size_;
        friend void protobuf_AddDesc_TrainFunctionCommand_2eproto();
        friend void protobuf_AssignDesc_TrainFunctionCommand_2eproto();
        friend void protobuf_ShutdownFile_TrainFunctionCommand_2eproto();

        void InitAsDefaultInstance();
        static TrainFunctionCommand* default_instance_;
    };
// ===================================================================

// ===================================================================

#if !PROTOBUF_INLINE_NOT_IN_HEADERS
    // TrainFunctionCommand

    // optional uint32 trainID = 1;
    inline void TrainFunctionCommand::clear_trainid()
    {
        trainid_ = 0u;
    }
    inline ::google::protobuf::uint32 TrainFunctionCommand::trainid() const
    {
        // @@protoc_insertion_point(field_get:modes3.protobuf.TrainFunctionCommand.trainID)
        return trainid_;
    }
    inline void TrainFunctionCommand::set_trainid(::google::protobuf::uint32 value)
    {

        trainid_ = value;
        // @@protoc_insertion_point(field_set:modes3.protobuf.TrainFunctionCommand.trainID)
    }

    // optional uint32 functionID = 2;
    inline void TrainFunctionCommand::clear_functionid()
    {
        functionid_ = 0u;
    }
    inline ::google::protobuf::uint32 TrainFunctionCommand::functionid() const
    {
        // @@protoc_insertion_point(field_get:modes3.protobuf.TrainFunctionCommand.functionID)
        return functionid_;
    }
    inline void TrainFunctionCommand::set_functionid(::google::protobuf::uint32 value)
    {

        functionid_ = value;
        // @@protoc_insertion_point(field_set:modes3.protobuf.TrainFunctionCommand.functionID)
    }

    // optional .modes3.protobuf.TrainFunctionValue trainFunctionValue = 3;
    inline void TrainFunctionCommand::clear_trainfunctionvalue()
    {
        trainfunctionvalue_ = 0;
    }
    inline ::modes3::protobuf::TrainFunctionValue TrainFunctionCommand::trainfunctionvalue() const
    {
        // @@protoc_insertion_point(field_get:modes3.protobuf.TrainFunctionCommand.trainFunctionValue)
        return static_cast< ::modes3::protobuf::TrainFunctionValue>(trainfunctionvalue_);
    }
    inline void TrainFunctionCommand::set_trainfunctionvalue(::modes3::protobuf::TrainFunctionValue value)
    {

        trainfunctionvalue_ = value;
        // @@protoc_insertion_point(field_set:modes3.protobuf.TrainFunctionCommand.trainFunctionValue)
    }

#endif // !PROTOBUF_INLINE_NOT_IN_HEADERS

    // @@protoc_insertion_point(namespace_scope)

} // namespace protobuf
} // namespace modes3

// @@protoc_insertion_point(global_scope)

#endif // PROTOBUF_TrainFunctionCommand_2eproto__INCLUDED