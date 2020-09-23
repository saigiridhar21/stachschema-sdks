// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: fds/protobuf/stach/table/CellDefinition.proto

package com.factset.protobuf.stach.table;

public final class CellDefinitionProto {
  private CellDefinitionProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface CellDefinitionOrBuilder extends
      // @@protoc_insertion_point(interface_extends:factset.protobuf.stach.table.CellDefinition)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    java.lang.String getType();
    /**
     * <pre>
     * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    com.google.protobuf.ByteString
        getTypeBytes();

    /**
     * <pre>
     * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
     * </pre>
     *
     * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
     * @return Whether the format field is set.
     */
    boolean hasFormat();
    /**
     * <pre>
     * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
     * </pre>
     *
     * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
     * @return The format.
     */
    com.factset.protobuf.stach.table.DataFormatProto.DataFormat getFormat();
    /**
     * <pre>
     * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
     * </pre>
     *
     * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
     */
    com.factset.protobuf.stach.table.DataFormatProto.DataFormatOrBuilder getFormatOrBuilder();
  }
  /**
   * <pre>
   * A cell definition
   * Overrides the column and row definition
   * </pre>
   *
   * Protobuf type {@code factset.protobuf.stach.table.CellDefinition}
   */
  public static final class CellDefinition extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:factset.protobuf.stach.table.CellDefinition)
      CellDefinitionOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use CellDefinition.newBuilder() to construct.
    private CellDefinition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private CellDefinition() {
      type_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new CellDefinition();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private CellDefinition(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
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
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              type_ = s;
              break;
            }
            case 18: {
              com.factset.protobuf.stach.table.DataFormatProto.DataFormat.Builder subBuilder = null;
              if (format_ != null) {
                subBuilder = format_.toBuilder();
              }
              format_ = input.readMessage(com.factset.protobuf.stach.table.DataFormatProto.DataFormat.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(format_);
                format_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
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
      return com.factset.protobuf.stach.table.CellDefinitionProto.internal_static_factset_protobuf_stach_table_CellDefinition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.factset.protobuf.stach.table.CellDefinitionProto.internal_static_factset_protobuf_stach_table_CellDefinition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition.class, com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition.Builder.class);
    }

    public static final int TYPE_FIELD_NUMBER = 1;
    private volatile java.lang.Object type_;
    /**
     * <pre>
     * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The type.
     */
    @java.lang.Override
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      }
    }
    /**
     * <pre>
     * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
     * </pre>
     *
     * <code>string type = 1;</code>
     * @return The bytes for type.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int FORMAT_FIELD_NUMBER = 2;
    private com.factset.protobuf.stach.table.DataFormatProto.DataFormat format_;
    /**
     * <pre>
     * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
     * </pre>
     *
     * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
     * @return Whether the format field is set.
     */
    @java.lang.Override
    public boolean hasFormat() {
      return format_ != null;
    }
    /**
     * <pre>
     * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
     * </pre>
     *
     * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
     * @return The format.
     */
    @java.lang.Override
    public com.factset.protobuf.stach.table.DataFormatProto.DataFormat getFormat() {
      return format_ == null ? com.factset.protobuf.stach.table.DataFormatProto.DataFormat.getDefaultInstance() : format_;
    }
    /**
     * <pre>
     * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
     * </pre>
     *
     * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
     */
    @java.lang.Override
    public com.factset.protobuf.stach.table.DataFormatProto.DataFormatOrBuilder getFormatOrBuilder() {
      return getFormat();
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
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!getTypeBytes().isEmpty()) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
      }
      if (format_ != null) {
        output.writeMessage(2, getFormat());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!getTypeBytes().isEmpty()) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
      }
      if (format_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getFormat());
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
      if (!(obj instanceof com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition)) {
        return super.equals(obj);
      }
      com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition other = (com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition) obj;

      if (!getType()
          .equals(other.getType())) return false;
      if (hasFormat() != other.hasFormat()) return false;
      if (hasFormat()) {
        if (!getFormat()
            .equals(other.getFormat())) return false;
      }
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getType().hashCode();
      if (hasFormat()) {
        hash = (37 * hash) + FORMAT_FIELD_NUMBER;
        hash = (53 * hash) + getFormat().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
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
     * <pre>
     * A cell definition
     * Overrides the column and row definition
     * </pre>
     *
     * Protobuf type {@code factset.protobuf.stach.table.CellDefinition}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:factset.protobuf.stach.table.CellDefinition)
        com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinitionOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.factset.protobuf.stach.table.CellDefinitionProto.internal_static_factset_protobuf_stach_table_CellDefinition_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.factset.protobuf.stach.table.CellDefinitionProto.internal_static_factset_protobuf_stach_table_CellDefinition_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition.class, com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition.Builder.class);
      }

      // Construct using com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition.newBuilder()
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
      @java.lang.Override
      public Builder clear() {
        super.clear();
        type_ = "";

        if (formatBuilder_ == null) {
          format_ = null;
        } else {
          format_ = null;
          formatBuilder_ = null;
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.factset.protobuf.stach.table.CellDefinitionProto.internal_static_factset_protobuf_stach_table_CellDefinition_descriptor;
      }

      @java.lang.Override
      public com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition getDefaultInstanceForType() {
        return com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition.getDefaultInstance();
      }

      @java.lang.Override
      public com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition build() {
        com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition buildPartial() {
        com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition result = new com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition(this);
        result.type_ = type_;
        if (formatBuilder_ == null) {
          result.format_ = format_;
        } else {
          result.format_ = formatBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition) {
          return mergeFrom((com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition other) {
        if (other == com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition.getDefaultInstance()) return this;
        if (!other.getType().isEmpty()) {
          type_ = other.type_;
          onChanged();
        }
        if (other.hasFormat()) {
          mergeFormat(other.getFormat());
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
        com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object type_ = "";
      /**
       * <pre>
       * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return The type.
       */
      public java.lang.String getType() {
        java.lang.Object ref = type_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          type_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return The bytes for type.
       */
      public com.google.protobuf.ByteString
          getTypeBytes() {
        java.lang.Object ref = type_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          type_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
       * </pre>
       *
       * <code>string type = 1;</code>
       * @param value The type to set.
       * @return This builder for chaining.
       */
      public Builder setType(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
       * </pre>
       *
       * <code>string type = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearType() {
        
        type_ = getDefaultInstance().getType();
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The data type; correlates with the chosen property for `ColumnData.data`; overrides the `ColumnDefinition.type`
       * </pre>
       *
       * <code>string type = 1;</code>
       * @param value The bytes for type to set.
       * @return This builder for chaining.
       */
      public Builder setTypeBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        type_ = value;
        onChanged();
        return this;
      }

      private com.factset.protobuf.stach.table.DataFormatProto.DataFormat format_;
      private com.google.protobuf.SingleFieldBuilderV3<
          com.factset.protobuf.stach.table.DataFormatProto.DataFormat, com.factset.protobuf.stach.table.DataFormatProto.DataFormat.Builder, com.factset.protobuf.stach.table.DataFormatProto.DataFormatOrBuilder> formatBuilder_;
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       * @return Whether the format field is set.
       */
      public boolean hasFormat() {
        return formatBuilder_ != null || format_ != null;
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       * @return The format.
       */
      public com.factset.protobuf.stach.table.DataFormatProto.DataFormat getFormat() {
        if (formatBuilder_ == null) {
          return format_ == null ? com.factset.protobuf.stach.table.DataFormatProto.DataFormat.getDefaultInstance() : format_;
        } else {
          return formatBuilder_.getMessage();
        }
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       */
      public Builder setFormat(com.factset.protobuf.stach.table.DataFormatProto.DataFormat value) {
        if (formatBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          format_ = value;
          onChanged();
        } else {
          formatBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       */
      public Builder setFormat(
          com.factset.protobuf.stach.table.DataFormatProto.DataFormat.Builder builderForValue) {
        if (formatBuilder_ == null) {
          format_ = builderForValue.build();
          onChanged();
        } else {
          formatBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       */
      public Builder mergeFormat(com.factset.protobuf.stach.table.DataFormatProto.DataFormat value) {
        if (formatBuilder_ == null) {
          if (format_ != null) {
            format_ =
              com.factset.protobuf.stach.table.DataFormatProto.DataFormat.newBuilder(format_).mergeFrom(value).buildPartial();
          } else {
            format_ = value;
          }
          onChanged();
        } else {
          formatBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       */
      public Builder clearFormat() {
        if (formatBuilder_ == null) {
          format_ = null;
          onChanged();
        } else {
          format_ = null;
          formatBuilder_ = null;
        }

        return this;
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       */
      public com.factset.protobuf.stach.table.DataFormatProto.DataFormat.Builder getFormatBuilder() {
        
        onChanged();
        return getFormatFieldBuilder().getBuilder();
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       */
      public com.factset.protobuf.stach.table.DataFormatProto.DataFormatOrBuilder getFormatOrBuilder() {
        if (formatBuilder_ != null) {
          return formatBuilder_.getMessageOrBuilder();
        } else {
          return format_ == null ?
              com.factset.protobuf.stach.table.DataFormatProto.DataFormat.getDefaultInstance() : format_;
        }
      }
      /**
       * <pre>
       * The data format; overrides the `RowDefinition.format` and the `ColumnDefinition.format`
       * </pre>
       *
       * <code>.factset.protobuf.stach.table.DataFormat format = 2;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          com.factset.protobuf.stach.table.DataFormatProto.DataFormat, com.factset.protobuf.stach.table.DataFormatProto.DataFormat.Builder, com.factset.protobuf.stach.table.DataFormatProto.DataFormatOrBuilder> 
          getFormatFieldBuilder() {
        if (formatBuilder_ == null) {
          formatBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              com.factset.protobuf.stach.table.DataFormatProto.DataFormat, com.factset.protobuf.stach.table.DataFormatProto.DataFormat.Builder, com.factset.protobuf.stach.table.DataFormatProto.DataFormatOrBuilder>(
                  getFormat(),
                  getParentForChildren(),
                  isClean());
          format_ = null;
        }
        return formatBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:factset.protobuf.stach.table.CellDefinition)
    }

    // @@protoc_insertion_point(class_scope:factset.protobuf.stach.table.CellDefinition)
    private static final com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition();
    }

    public static com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<CellDefinition>
        PARSER = new com.google.protobuf.AbstractParser<CellDefinition>() {
      @java.lang.Override
      public CellDefinition parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new CellDefinition(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<CellDefinition> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<CellDefinition> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.factset.protobuf.stach.table.CellDefinitionProto.CellDefinition getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_factset_protobuf_stach_table_CellDefinition_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_factset_protobuf_stach_table_CellDefinition_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n-fds/protobuf/stach/table/CellDefinitio" +
      "n.proto\022\034factset.protobuf.stach.table\032)f" +
      "ds/protobuf/stach/table/DataFormat.proto" +
      "\"X\n\016CellDefinition\022\014\n\004type\030\001 \001(\t\0228\n\006form" +
      "at\030\002 \001(\0132(.factset.protobuf.stach.table." +
      "DataFormatB\225\001\n com.factset.protobuf.stac" +
      "h.tableB\023CellDefinitionProtoZ=github.com" +
      "/factset/stachschema/go/v2/fds/protobuf/" +
      "stach/table\252\002\034FactSet.Protobuf.Stach.Tab" +
      "leb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.factset.protobuf.stach.table.DataFormatProto.getDescriptor(),
        });
    internal_static_factset_protobuf_stach_table_CellDefinition_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_factset_protobuf_stach_table_CellDefinition_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_factset_protobuf_stach_table_CellDefinition_descriptor,
        new java.lang.String[] { "Type", "Format", });
    com.factset.protobuf.stach.table.DataFormatProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
