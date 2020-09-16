# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: fds/protobuf/stach/table/MetadataItem.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from google.protobuf import struct_pb2 as google_dot_protobuf_dot_struct__pb2
from fds.protobuf.stach.table import Reference_pb2 as fds_dot_protobuf_dot_stach_dot_table_dot_Reference__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='fds/protobuf/stach/table/MetadataItem.proto',
  package='factset.protobuf.stach.table',
  syntax='proto3',
  serialized_options=b'\n com.factset.protobuf.stach.tableB\021MetadataItemProtoZ=github.com/factset/stachschema/go/v2/fds/protobuf/stach/table\252\002\034FactSet.Protobuf.Stach.Table',
  serialized_pb=b'\n+fds/protobuf/stach/table/MetadataItem.proto\x12\x1c\x66\x61\x63tset.protobuf.stach.table\x1a\x1cgoogle/protobuf/struct.proto\x1a(fds/protobuf/stach/table/Reference.proto\"}\n\x0cMetadataItem\x12\'\n\x05value\x18\x01 \x01(\x0b\x32\x16.google.protobuf.ValueH\x00\x12<\n\treference\x18\x02 \x01(\x0b\x32\'.factset.protobuf.stach.table.ReferenceH\x00\x42\x06\n\x04\x64\x61taB\x93\x01\n com.factset.protobuf.stach.tableB\x11MetadataItemProtoZ=github.com/factset/stachschema/go/v2/fds/protobuf/stach/table\xaa\x02\x1c\x46\x61\x63tSet.Protobuf.Stach.Tableb\x06proto3'
  ,
  dependencies=[google_dot_protobuf_dot_struct__pb2.DESCRIPTOR,fds_dot_protobuf_dot_stach_dot_table_dot_Reference__pb2.DESCRIPTOR,])




_METADATAITEM = _descriptor.Descriptor(
  name='MetadataItem',
  full_name='factset.protobuf.stach.table.MetadataItem',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  fields=[
    _descriptor.FieldDescriptor(
      name='value', full_name='factset.protobuf.stach.table.MetadataItem.value', index=0,
      number=1, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
    _descriptor.FieldDescriptor(
      name='reference', full_name='factset.protobuf.stach.table.MetadataItem.reference', index=1,
      number=2, type=11, cpp_type=10, label=1,
      has_default_value=False, default_value=None,
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR),
  ],
  extensions=[
  ],
  nested_types=[],
  enum_types=[
  ],
  serialized_options=None,
  is_extendable=False,
  syntax='proto3',
  extension_ranges=[],
  oneofs=[
    _descriptor.OneofDescriptor(
      name='data', full_name='factset.protobuf.stach.table.MetadataItem.data',
      index=0, containing_type=None, fields=[]),
  ],
  serialized_start=149,
  serialized_end=274,
)

_METADATAITEM.fields_by_name['value'].message_type = google_dot_protobuf_dot_struct__pb2._VALUE
_METADATAITEM.fields_by_name['reference'].message_type = fds_dot_protobuf_dot_stach_dot_table_dot_Reference__pb2._REFERENCE
_METADATAITEM.oneofs_by_name['data'].fields.append(
  _METADATAITEM.fields_by_name['value'])
_METADATAITEM.fields_by_name['value'].containing_oneof = _METADATAITEM.oneofs_by_name['data']
_METADATAITEM.oneofs_by_name['data'].fields.append(
  _METADATAITEM.fields_by_name['reference'])
_METADATAITEM.fields_by_name['reference'].containing_oneof = _METADATAITEM.oneofs_by_name['data']
DESCRIPTOR.message_types_by_name['MetadataItem'] = _METADATAITEM
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

MetadataItem = _reflection.GeneratedProtocolMessageType('MetadataItem', (_message.Message,), {
  'DESCRIPTOR' : _METADATAITEM,
  '__module__' : 'fds.protobuf.stach.table.MetadataItem_pb2'
  # @@protoc_insertion_point(class_scope:factset.protobuf.stach.table.MetadataItem)
  })
_sym_db.RegisterMessage(MetadataItem)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)