// Code generated by protoc-gen-go. DO NOT EDIT.
// versions:
// 	protoc-gen-go v1.25.0-devel
// 	protoc        v3.12.3
// source: fds/protobuf/stach/v2/table/MetadataItem.proto

package table

import (
	_struct "github.com/golang/protobuf/ptypes/struct"
	protoreflect "google.golang.org/protobuf/reflect/protoreflect"
	protoimpl "google.golang.org/protobuf/runtime/protoimpl"
	reflect "reflect"
	sync "sync"
)

const (
	// Verify that this generated code is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(20 - protoimpl.MinVersion)
	// Verify that runtime/protoimpl is sufficiently up-to-date.
	_ = protoimpl.EnforceVersion(protoimpl.MaxVersion - 20)
)

// A metadata item
//
// Represents data to describe the table or parts of the table
type MetadataItem struct {
	state         protoimpl.MessageState
	sizeCache     protoimpl.SizeCache
	unknownFields protoimpl.UnknownFields

	// Types that are assignable to Data:
	//	*MetadataItem_Value
	//	*MetadataItem_Reference
	Data isMetadataItem_Data `protobuf_oneof:"data"`
}

func (x *MetadataItem) Reset() {
	*x = MetadataItem{}
	if protoimpl.UnsafeEnabled {
		mi := &file_fds_protobuf_stach_v2_table_MetadataItem_proto_msgTypes[0]
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		ms.StoreMessageInfo(mi)
	}
}

func (x *MetadataItem) String() string {
	return protoimpl.X.MessageStringOf(x)
}

func (*MetadataItem) ProtoMessage() {}

func (x *MetadataItem) ProtoReflect() protoreflect.Message {
	mi := &file_fds_protobuf_stach_v2_table_MetadataItem_proto_msgTypes[0]
	if protoimpl.UnsafeEnabled && x != nil {
		ms := protoimpl.X.MessageStateOf(protoimpl.Pointer(x))
		if ms.LoadMessageInfo() == nil {
			ms.StoreMessageInfo(mi)
		}
		return ms
	}
	return mi.MessageOf(x)
}

// Deprecated: Use MetadataItem.ProtoReflect.Descriptor instead.
func (*MetadataItem) Descriptor() ([]byte, []int) {
	return file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescGZIP(), []int{0}
}

func (m *MetadataItem) GetData() isMetadataItem_Data {
	if m != nil {
		return m.Data
	}
	return nil
}

func (x *MetadataItem) GetValue() *_struct.Value {
	if x, ok := x.GetData().(*MetadataItem_Value); ok {
		return x.Value
	}
	return nil
}

func (x *MetadataItem) GetReference() *Reference {
	if x, ok := x.GetData().(*MetadataItem_Reference); ok {
		return x.Reference
	}
	return nil
}

type isMetadataItem_Data interface {
	isMetadataItem_Data()
}

type MetadataItem_Value struct {
	// The value
	Value *_struct.Value `protobuf:"bytes,1,opt,name=value,proto3,oneof"`
}

type MetadataItem_Reference struct {
	// The table reference
	Reference *Reference `protobuf:"bytes,2,opt,name=reference,proto3,oneof"`
}

func (*MetadataItem_Value) isMetadataItem_Data() {}

func (*MetadataItem_Reference) isMetadataItem_Data() {}

var File_fds_protobuf_stach_v2_table_MetadataItem_proto protoreflect.FileDescriptor

var file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDesc = []byte{
	0x0a, 0x2e, 0x66, 0x64, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x73,
	0x74, 0x61, 0x63, 0x68, 0x2f, 0x76, 0x32, 0x2f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x2f, 0x4d, 0x65,
	0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x49, 0x74, 0x65, 0x6d, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x12, 0x1f, 0x66, 0x61, 0x63, 0x74, 0x73, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2e, 0x73, 0x74, 0x61, 0x63, 0x68, 0x2e, 0x76, 0x32, 0x2e, 0x74, 0x61, 0x62, 0x6c,
	0x65, 0x1a, 0x1c, 0x67, 0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62,
	0x75, 0x66, 0x2f, 0x73, 0x74, 0x72, 0x75, 0x63, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x1a,
	0x2b, 0x66, 0x64, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2f, 0x73, 0x74,
	0x61, 0x63, 0x68, 0x2f, 0x76, 0x32, 0x2f, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x2f, 0x52, 0x65, 0x66,
	0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x22, 0x92, 0x01, 0x0a,
	0x0c, 0x4d, 0x65, 0x74, 0x61, 0x64, 0x61, 0x74, 0x61, 0x49, 0x74, 0x65, 0x6d, 0x12, 0x2e, 0x0a,
	0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x18, 0x01, 0x20, 0x01, 0x28, 0x0b, 0x32, 0x16, 0x2e, 0x67,
	0x6f, 0x6f, 0x67, 0x6c, 0x65, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x56,
	0x61, 0x6c, 0x75, 0x65, 0x48, 0x00, 0x52, 0x05, 0x76, 0x61, 0x6c, 0x75, 0x65, 0x12, 0x4a, 0x0a,
	0x09, 0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x18, 0x02, 0x20, 0x01, 0x28, 0x0b,
	0x32, 0x2a, 0x2e, 0x66, 0x61, 0x63, 0x74, 0x73, 0x65, 0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2e, 0x73, 0x74, 0x61, 0x63, 0x68, 0x2e, 0x76, 0x32, 0x2e, 0x74, 0x61, 0x62,
	0x6c, 0x65, 0x2e, 0x52, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x48, 0x00, 0x52, 0x09,
	0x72, 0x65, 0x66, 0x65, 0x72, 0x65, 0x6e, 0x63, 0x65, 0x42, 0x06, 0x0a, 0x04, 0x64, 0x61, 0x74,
	0x61, 0x42, 0x9e, 0x01, 0x0a, 0x23, 0x63, 0x6f, 0x6d, 0x2e, 0x66, 0x61, 0x63, 0x74, 0x73, 0x65,
	0x74, 0x2e, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75, 0x66, 0x2e, 0x73, 0x74, 0x61, 0x63, 0x68,
	0x2e, 0x76, 0x32, 0x2e, 0x74, 0x61, 0x62, 0x6c, 0x65, 0x42, 0x11, 0x4d, 0x65, 0x74, 0x61, 0x64,
	0x61, 0x74, 0x61, 0x49, 0x74, 0x65, 0x6d, 0x50, 0x72, 0x6f, 0x74, 0x6f, 0x5a, 0x42, 0x67, 0x69,
	0x74, 0x68, 0x75, 0x62, 0x2e, 0x63, 0x6f, 0x6d, 0x2f, 0x66, 0x61, 0x63, 0x74, 0x73, 0x65, 0x74,
	0x2f, 0x73, 0x74, 0x61, 0x63, 0x68, 0x73, 0x63, 0x68, 0x65, 0x6d, 0x61, 0x2d, 0x73, 0x64, 0x6b,
	0x73, 0x2f, 0x67, 0x6f, 0x2f, 0x66, 0x64, 0x73, 0x2f, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x62, 0x75,
	0x66, 0x2f, 0x73, 0x74, 0x61, 0x63, 0x68, 0x2f, 0x76, 0x32, 0x2f, 0x74, 0x61, 0x62, 0x6c, 0x65,
	0xaa, 0x02, 0x1f, 0x46, 0x61, 0x63, 0x74, 0x53, 0x65, 0x74, 0x2e, 0x50, 0x72, 0x6f, 0x74, 0x6f,
	0x62, 0x75, 0x66, 0x2e, 0x53, 0x74, 0x61, 0x63, 0x68, 0x2e, 0x56, 0x32, 0x2e, 0x54, 0x61, 0x62,
	0x6c, 0x65, 0x62, 0x06, 0x70, 0x72, 0x6f, 0x74, 0x6f, 0x33,
}

var (
	file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescOnce sync.Once
	file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescData = file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDesc
)

func file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescGZIP() []byte {
	file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescOnce.Do(func() {
		file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescData = protoimpl.X.CompressGZIP(file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescData)
	})
	return file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDescData
}

var file_fds_protobuf_stach_v2_table_MetadataItem_proto_msgTypes = make([]protoimpl.MessageInfo, 1)
var file_fds_protobuf_stach_v2_table_MetadataItem_proto_goTypes = []interface{}{
	(*MetadataItem)(nil),  // 0: factset.protobuf.stach.v2.table.MetadataItem
	(*_struct.Value)(nil), // 1: google.protobuf.Value
	(*Reference)(nil),     // 2: factset.protobuf.stach.v2.table.Reference
}
var file_fds_protobuf_stach_v2_table_MetadataItem_proto_depIdxs = []int32{
	1, // 0: factset.protobuf.stach.v2.table.MetadataItem.value:type_name -> google.protobuf.Value
	2, // 1: factset.protobuf.stach.v2.table.MetadataItem.reference:type_name -> factset.protobuf.stach.v2.table.Reference
	2, // [2:2] is the sub-list for method output_type
	2, // [2:2] is the sub-list for method input_type
	2, // [2:2] is the sub-list for extension type_name
	2, // [2:2] is the sub-list for extension extendee
	0, // [0:2] is the sub-list for field type_name
}

func init() { file_fds_protobuf_stach_v2_table_MetadataItem_proto_init() }
func file_fds_protobuf_stach_v2_table_MetadataItem_proto_init() {
	if File_fds_protobuf_stach_v2_table_MetadataItem_proto != nil {
		return
	}
	file_fds_protobuf_stach_v2_table_Reference_proto_init()
	if !protoimpl.UnsafeEnabled {
		file_fds_protobuf_stach_v2_table_MetadataItem_proto_msgTypes[0].Exporter = func(v interface{}, i int) interface{} {
			switch v := v.(*MetadataItem); i {
			case 0:
				return &v.state
			case 1:
				return &v.sizeCache
			case 2:
				return &v.unknownFields
			default:
				return nil
			}
		}
	}
	file_fds_protobuf_stach_v2_table_MetadataItem_proto_msgTypes[0].OneofWrappers = []interface{}{
		(*MetadataItem_Value)(nil),
		(*MetadataItem_Reference)(nil),
	}
	type x struct{}
	out := protoimpl.TypeBuilder{
		File: protoimpl.DescBuilder{
			GoPackagePath: reflect.TypeOf(x{}).PkgPath(),
			RawDescriptor: file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDesc,
			NumEnums:      0,
			NumMessages:   1,
			NumExtensions: 0,
			NumServices:   0,
		},
		GoTypes:           file_fds_protobuf_stach_v2_table_MetadataItem_proto_goTypes,
		DependencyIndexes: file_fds_protobuf_stach_v2_table_MetadataItem_proto_depIdxs,
		MessageInfos:      file_fds_protobuf_stach_v2_table_MetadataItem_proto_msgTypes,
	}.Build()
	File_fds_protobuf_stach_v2_table_MetadataItem_proto = out.File
	file_fds_protobuf_stach_v2_table_MetadataItem_proto_rawDesc = nil
	file_fds_protobuf_stach_v2_table_MetadataItem_proto_goTypes = nil
	file_fds_protobuf_stach_v2_table_MetadataItem_proto_depIdxs = nil
}