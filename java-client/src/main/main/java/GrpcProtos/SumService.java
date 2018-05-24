// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SumService.proto

package GrpcProtos;

public final class SumService {
  private SumService() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PairOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GrpcProtos.Pair)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 number1 = 1;</code>
     */
    int getNumber1();

    /**
     * <code>int32 number2 = 2;</code>
     */
    int getNumber2();
  }
  /**
   * Protobuf type {@code GrpcProtos.Pair}
   */
  public  static final class Pair extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GrpcProtos.Pair)
      PairOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Pair.newBuilder() to construct.
    private Pair(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Pair() {
      number1_ = 0;
      number2_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Pair(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              number1_ = input.readInt32();
              break;
            }
            case 16: {

              number2_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GrpcProtos.SumService.internal_static_GrpcProtos_Pair_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GrpcProtos.SumService.internal_static_GrpcProtos_Pair_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GrpcProtos.SumService.Pair.class, GrpcProtos.SumService.Pair.Builder.class);
    }

    public static final int NUMBER1_FIELD_NUMBER = 1;
    private int number1_;
    /**
     * <code>int32 number1 = 1;</code>
     */
    public int getNumber1() {
      return number1_;
    }

    public static final int NUMBER2_FIELD_NUMBER = 2;
    private int number2_;
    /**
     * <code>int32 number2 = 2;</code>
     */
    public int getNumber2() {
      return number2_;
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
      if (number1_ != 0) {
        output.writeInt32(1, number1_);
      }
      if (number2_ != 0) {
        output.writeInt32(2, number2_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (number1_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, number1_);
      }
      if (number2_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(2, number2_);
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
      if (!(obj instanceof GrpcProtos.SumService.Pair)) {
        return super.equals(obj);
      }
      GrpcProtos.SumService.Pair other = (GrpcProtos.SumService.Pair) obj;

      boolean result = true;
      result = result && (getNumber1()
          == other.getNumber1());
      result = result && (getNumber2()
          == other.getNumber2());
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
      hash = (37 * hash) + NUMBER1_FIELD_NUMBER;
      hash = (53 * hash) + getNumber1();
      hash = (37 * hash) + NUMBER2_FIELD_NUMBER;
      hash = (53 * hash) + getNumber2();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GrpcProtos.SumService.Pair parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GrpcProtos.SumService.Pair parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GrpcProtos.SumService.Pair parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GrpcProtos.SumService.Pair parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GrpcProtos.SumService.Pair parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GrpcProtos.SumService.Pair parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GrpcProtos.SumService.Pair parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GrpcProtos.SumService.Pair parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GrpcProtos.SumService.Pair parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GrpcProtos.SumService.Pair parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GrpcProtos.SumService.Pair parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GrpcProtos.SumService.Pair parseFrom(
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
    public static Builder newBuilder(GrpcProtos.SumService.Pair prototype) {
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
     * Protobuf type {@code GrpcProtos.Pair}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GrpcProtos.Pair)
        GrpcProtos.SumService.PairOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GrpcProtos.SumService.internal_static_GrpcProtos_Pair_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GrpcProtos.SumService.internal_static_GrpcProtos_Pair_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GrpcProtos.SumService.Pair.class, GrpcProtos.SumService.Pair.Builder.class);
      }

      // Construct using GrpcProtos.SumService.Pair.newBuilder()
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
        number1_ = 0;

        number2_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GrpcProtos.SumService.internal_static_GrpcProtos_Pair_descriptor;
      }

      public GrpcProtos.SumService.Pair getDefaultInstanceForType() {
        return GrpcProtos.SumService.Pair.getDefaultInstance();
      }

      public GrpcProtos.SumService.Pair build() {
        GrpcProtos.SumService.Pair result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public GrpcProtos.SumService.Pair buildPartial() {
        GrpcProtos.SumService.Pair result = new GrpcProtos.SumService.Pair(this);
        result.number1_ = number1_;
        result.number2_ = number2_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GrpcProtos.SumService.Pair) {
          return mergeFrom((GrpcProtos.SumService.Pair)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GrpcProtos.SumService.Pair other) {
        if (other == GrpcProtos.SumService.Pair.getDefaultInstance()) return this;
        if (other.getNumber1() != 0) {
          setNumber1(other.getNumber1());
        }
        if (other.getNumber2() != 0) {
          setNumber2(other.getNumber2());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        GrpcProtos.SumService.Pair parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GrpcProtos.SumService.Pair) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int number1_ ;
      /**
       * <code>int32 number1 = 1;</code>
       */
      public int getNumber1() {
        return number1_;
      }
      /**
       * <code>int32 number1 = 1;</code>
       */
      public Builder setNumber1(int value) {
        
        number1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 number1 = 1;</code>
       */
      public Builder clearNumber1() {
        
        number1_ = 0;
        onChanged();
        return this;
      }

      private int number2_ ;
      /**
       * <code>int32 number2 = 2;</code>
       */
      public int getNumber2() {
        return number2_;
      }
      /**
       * <code>int32 number2 = 2;</code>
       */
      public Builder setNumber2(int value) {
        
        number2_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 number2 = 2;</code>
       */
      public Builder clearNumber2() {
        
        number2_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GrpcProtos.Pair)
    }

    // @@protoc_insertion_point(class_scope:GrpcProtos.Pair)
    private static final GrpcProtos.SumService.Pair DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GrpcProtos.SumService.Pair();
    }

    public static GrpcProtos.SumService.Pair getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Pair>
        PARSER = new com.google.protobuf.AbstractParser<Pair>() {
      public Pair parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Pair(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Pair> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Pair> getParserForType() {
      return PARSER;
    }

    public GrpcProtos.SumService.Pair getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  public interface ResultOrBuilder extends
      // @@protoc_insertion_point(interface_extends:GrpcProtos.Result)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 value = 1;</code>
     */
    int getValue();
  }
  /**
   * Protobuf type {@code GrpcProtos.Result}
   */
  public  static final class Result extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:GrpcProtos.Result)
      ResultOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Result.newBuilder() to construct.
    private Result(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Result() {
      value_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Result(
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
            default: {
              if (!parseUnknownFieldProto3(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {

              value_ = input.readInt32();
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
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return GrpcProtos.SumService.internal_static_GrpcProtos_Result_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return GrpcProtos.SumService.internal_static_GrpcProtos_Result_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              GrpcProtos.SumService.Result.class, GrpcProtos.SumService.Result.Builder.class);
    }

    public static final int VALUE_FIELD_NUMBER = 1;
    private int value_;
    /**
     * <code>int32 value = 1;</code>
     */
    public int getValue() {
      return value_;
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
      if (value_ != 0) {
        output.writeInt32(1, value_);
      }
      unknownFields.writeTo(output);
    }

    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (value_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, value_);
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
      if (!(obj instanceof GrpcProtos.SumService.Result)) {
        return super.equals(obj);
      }
      GrpcProtos.SumService.Result other = (GrpcProtos.SumService.Result) obj;

      boolean result = true;
      result = result && (getValue()
          == other.getValue());
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
      hash = (37 * hash) + VALUE_FIELD_NUMBER;
      hash = (53 * hash) + getValue();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static GrpcProtos.SumService.Result parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GrpcProtos.SumService.Result parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GrpcProtos.SumService.Result parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GrpcProtos.SumService.Result parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GrpcProtos.SumService.Result parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static GrpcProtos.SumService.Result parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static GrpcProtos.SumService.Result parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GrpcProtos.SumService.Result parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static GrpcProtos.SumService.Result parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static GrpcProtos.SumService.Result parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static GrpcProtos.SumService.Result parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static GrpcProtos.SumService.Result parseFrom(
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
    public static Builder newBuilder(GrpcProtos.SumService.Result prototype) {
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
     * Protobuf type {@code GrpcProtos.Result}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:GrpcProtos.Result)
        GrpcProtos.SumService.ResultOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return GrpcProtos.SumService.internal_static_GrpcProtos_Result_descriptor;
      }

      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return GrpcProtos.SumService.internal_static_GrpcProtos_Result_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                GrpcProtos.SumService.Result.class, GrpcProtos.SumService.Result.Builder.class);
      }

      // Construct using GrpcProtos.SumService.Result.newBuilder()
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
        value_ = 0;

        return this;
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return GrpcProtos.SumService.internal_static_GrpcProtos_Result_descriptor;
      }

      public GrpcProtos.SumService.Result getDefaultInstanceForType() {
        return GrpcProtos.SumService.Result.getDefaultInstance();
      }

      public GrpcProtos.SumService.Result build() {
        GrpcProtos.SumService.Result result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public GrpcProtos.SumService.Result buildPartial() {
        GrpcProtos.SumService.Result result = new GrpcProtos.SumService.Result(this);
        result.value_ = value_;
        onBuilt();
        return result;
      }

      public Builder clone() {
        return (Builder) super.clone();
      }
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
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
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof GrpcProtos.SumService.Result) {
          return mergeFrom((GrpcProtos.SumService.Result)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(GrpcProtos.SumService.Result other) {
        if (other == GrpcProtos.SumService.Result.getDefaultInstance()) return this;
        if (other.getValue() != 0) {
          setValue(other.getValue());
        }
        this.mergeUnknownFields(other.unknownFields);
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
        GrpcProtos.SumService.Result parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (GrpcProtos.SumService.Result) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int value_ ;
      /**
       * <code>int32 value = 1;</code>
       */
      public int getValue() {
        return value_;
      }
      /**
       * <code>int32 value = 1;</code>
       */
      public Builder setValue(int value) {
        
        value_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 value = 1;</code>
       */
      public Builder clearValue() {
        
        value_ = 0;
        onChanged();
        return this;
      }
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:GrpcProtos.Result)
    }

    // @@protoc_insertion_point(class_scope:GrpcProtos.Result)
    private static final GrpcProtos.SumService.Result DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GrpcProtos.SumService.Result();
    }

    public static GrpcProtos.SumService.Result getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Result>
        PARSER = new com.google.protobuf.AbstractParser<Result>() {
      public Result parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Result(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Result> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Result> getParserForType() {
      return PARSER;
    }

    public GrpcProtos.SumService.Result getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcProtos_Pair_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcProtos_Pair_fieldAccessorTable;
  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_GrpcProtos_Result_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_GrpcProtos_Result_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\020SumService.proto\022\nGrpcProtos\"(\n\004Pair\022\017" +
      "\n\007number1\030\001 \001(\005\022\017\n\007number2\030\002 \001(\005\"\027\n\006Resu" +
      "lt\022\r\n\005value\030\001 \001(\0052;\n\nCalculator\022-\n\003Sum\022\020" +
      ".GrpcProtos.Pair\032\022.GrpcProtos.Result\"\000b\006" +
      "proto3"
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
        }, assigner);
    internal_static_GrpcProtos_Pair_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_GrpcProtos_Pair_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcProtos_Pair_descriptor,
        new java.lang.String[] { "Number1", "Number2", });
    internal_static_GrpcProtos_Result_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_GrpcProtos_Result_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_GrpcProtos_Result_descriptor,
        new java.lang.String[] { "Value", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}