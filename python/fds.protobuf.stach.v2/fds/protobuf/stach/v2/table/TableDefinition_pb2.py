# -*- coding: utf-8 -*-
# Generated by the protocol buffer compiler.  DO NOT EDIT!
# source: fds/protobuf/stach/v2/table/TableDefinition.proto

from google.protobuf import descriptor as _descriptor
from google.protobuf import message as _message
from google.protobuf import reflection as _reflection
from google.protobuf import symbol_database as _symbol_database
# @@protoc_insertion_point(imports)

_sym_db = _symbol_database.Default()


from fds.protobuf.stach.v2.table import ColumnDefinition_pb2 as fds_dot_protobuf_dot_stach_dot_v2_dot_table_dot_ColumnDefinition__pb2


DESCRIPTOR = _descriptor.FileDescriptor(
  name='fds/protobuf/stach/v2/table/TableDefinition.proto',
  package='factset.protobuf.stach.v2.table',
  syntax='proto3',
  serialized_options=b'\n#com.factset.protobuf.stach.v2.tableB\024TableDefinitionProtoZBgithub.com/factset/stachschema-sdks/go/fds/protobuf/stach/v2/table\252\002\037FactSet.Protobuf.Stach.V2.Table',
  create_key=_descriptor._internal_create_key,
  serialized_pb=b'\n1fds/protobuf/stach/v2/table/TableDefinition.proto\x12\x1f\x66\x61\x63tset.protobuf.stach.v2.table\x1a\x32\x66\x64s/protobuf/stach/v2/table/ColumnDefinition.proto\"n\n\x0fTableDefinition\x12\x17\n\x0fheader_table_id\x18\x01 \x01(\t\x12\x42\n\x07\x63olumns\x18\x02 \x03(\x0b\x32\x31.factset.protobuf.stach.v2.table.ColumnDefinitionB\xa1\x01\n#com.factset.protobuf.stach.v2.tableB\x14TableDefinitionProtoZBgithub.com/factset/stachschema-sdks/go/fds/protobuf/stach/v2/table\xaa\x02\x1f\x46\x61\x63tSet.Protobuf.Stach.V2.Tableb\x06proto3'
  ,
  dependencies=[fds_dot_protobuf_dot_stach_dot_v2_dot_table_dot_ColumnDefinition__pb2.DESCRIPTOR,])




_TABLEDEFINITION = _descriptor.Descriptor(
  name='TableDefinition',
  full_name='factset.protobuf.stach.v2.table.TableDefinition',
  filename=None,
  file=DESCRIPTOR,
  containing_type=None,
  create_key=_descriptor._internal_create_key,
  fields=[
    _descriptor.FieldDescriptor(
      name='header_table_id', full_name='factset.protobuf.stach.v2.table.TableDefinition.header_table_id', index=0,
      number=1, type=9, cpp_type=9, label=1,
      has_default_value=False, default_value=b"".decode('utf-8'),
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
    _descriptor.FieldDescriptor(
      name='columns', full_name='factset.protobuf.stach.v2.table.TableDefinition.columns', index=1,
      number=2, type=11, cpp_type=10, label=3,
      has_default_value=False, default_value=[],
      message_type=None, enum_type=None, containing_type=None,
      is_extension=False, extension_scope=None,
      serialized_options=None, file=DESCRIPTOR,  create_key=_descriptor._internal_create_key),
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
  ],
  serialized_start=138,
  serialized_end=248,
)

_TABLEDEFINITION.fields_by_name['columns'].message_type = fds_dot_protobuf_dot_stach_dot_v2_dot_table_dot_ColumnDefinition__pb2._COLUMNDEFINITION
DESCRIPTOR.message_types_by_name['TableDefinition'] = _TABLEDEFINITION
_sym_db.RegisterFileDescriptor(DESCRIPTOR)

TableDefinition = _reflection.GeneratedProtocolMessageType('TableDefinition', (_message.Message,), {
  'DESCRIPTOR' : _TABLEDEFINITION,
  '__module__' : 'fds.protobuf.stach.v2.table.TableDefinition_pb2'
  # @@protoc_insertion_point(class_scope:factset.protobuf.stach.v2.table.TableDefinition)
  })
_sym_db.RegisterMessage(TableDefinition)


DESCRIPTOR._options = None
# @@protoc_insertion_point(module_scope)
