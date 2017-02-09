/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package org.pbccrc.zsls.api.thrift.records;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2017-1-7")
public class TTaskInfo implements org.apache.thrift.TBase<TTaskInfo, TTaskInfo._Fields>, java.io.Serializable, Cloneable, Comparable<TTaskInfo> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTaskInfo");

  private static final org.apache.thrift.protocol.TField TASKID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskid", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DATA_FIELD_DESC = new org.apache.thrift.protocol.TField("data", org.apache.thrift.protocol.TType.MAP, (short)2);
  private static final org.apache.thrift.protocol.TField GENERATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("generateTime", org.apache.thrift.protocol.TType.I64, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTaskInfoStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTaskInfoTupleSchemeFactory());
  }

  public TTaskId taskid; // required
  public Map<String,String> data; // required
  public long generateTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TASKID((short)1, "taskid"),
    DATA((short)2, "data"),
    GENERATE_TIME((short)3, "generateTime");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // TASKID
          return TASKID;
        case 2: // DATA
          return DATA;
        case 3: // GENERATE_TIME
          return GENERATE_TIME;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final int __GENERATETIME_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.GENERATE_TIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TASKID, new org.apache.thrift.meta_data.FieldMetaData("taskid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTaskId.class)));
    tmpMap.put(_Fields.DATA, new org.apache.thrift.meta_data.FieldMetaData("data", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.GENERATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("generateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTaskInfo.class, metaDataMap);
  }

  public TTaskInfo() {
  }

  public TTaskInfo(
    TTaskId taskid,
    Map<String,String> data)
  {
    this();
    this.taskid = taskid;
    this.data = data;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTaskInfo(TTaskInfo other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetTaskid()) {
      this.taskid = new TTaskId(other.taskid);
    }
    if (other.isSetData()) {
      Map<String,String> __this__data = new HashMap<String,String>(other.data);
      this.data = __this__data;
    }
    this.generateTime = other.generateTime;
  }

  public TTaskInfo deepCopy() {
    return new TTaskInfo(this);
  }

  @Override
  public void clear() {
    this.taskid = null;
    this.data = null;
    setGenerateTimeIsSet(false);
    this.generateTime = 0;
  }

  public TTaskId getTaskid() {
    return this.taskid;
  }

  public TTaskInfo setTaskid(TTaskId taskid) {
    this.taskid = taskid;
    return this;
  }

  public void unsetTaskid() {
    this.taskid = null;
  }

  /** Returns true if field taskid is set (has been assigned a value) and false otherwise */
  public boolean isSetTaskid() {
    return this.taskid != null;
  }

  public void setTaskidIsSet(boolean value) {
    if (!value) {
      this.taskid = null;
    }
  }

  public int getDataSize() {
    return (this.data == null) ? 0 : this.data.size();
  }

  public void putToData(String key, String val) {
    if (this.data == null) {
      this.data = new HashMap<String,String>();
    }
    this.data.put(key, val);
  }

  public Map<String,String> getData() {
    return this.data;
  }

  public TTaskInfo setData(Map<String,String> data) {
    this.data = data;
    return this;
  }

  public void unsetData() {
    this.data = null;
  }

  /** Returns true if field data is set (has been assigned a value) and false otherwise */
  public boolean isSetData() {
    return this.data != null;
  }

  public void setDataIsSet(boolean value) {
    if (!value) {
      this.data = null;
    }
  }

  public long getGenerateTime() {
    return this.generateTime;
  }

  public TTaskInfo setGenerateTime(long generateTime) {
    this.generateTime = generateTime;
    setGenerateTimeIsSet(true);
    return this;
  }

  public void unsetGenerateTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __GENERATETIME_ISSET_ID);
  }

  /** Returns true if field generateTime is set (has been assigned a value) and false otherwise */
  public boolean isSetGenerateTime() {
    return EncodingUtils.testBit(__isset_bitfield, __GENERATETIME_ISSET_ID);
  }

  public void setGenerateTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __GENERATETIME_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TASKID:
      if (value == null) {
        unsetTaskid();
      } else {
        setTaskid((TTaskId)value);
      }
      break;

    case DATA:
      if (value == null) {
        unsetData();
      } else {
        setData((Map<String,String>)value);
      }
      break;

    case GENERATE_TIME:
      if (value == null) {
        unsetGenerateTime();
      } else {
        setGenerateTime((Long)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TASKID:
      return getTaskid();

    case DATA:
      return getData();

    case GENERATE_TIME:
      return Long.valueOf(getGenerateTime());

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TASKID:
      return isSetTaskid();
    case DATA:
      return isSetData();
    case GENERATE_TIME:
      return isSetGenerateTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTaskInfo)
      return this.equals((TTaskInfo)that);
    return false;
  }

  public boolean equals(TTaskInfo that) {
    if (that == null)
      return false;

    boolean this_present_taskid = true && this.isSetTaskid();
    boolean that_present_taskid = true && that.isSetTaskid();
    if (this_present_taskid || that_present_taskid) {
      if (!(this_present_taskid && that_present_taskid))
        return false;
      if (!this.taskid.equals(that.taskid))
        return false;
    }

    boolean this_present_data = true && this.isSetData();
    boolean that_present_data = true && that.isSetData();
    if (this_present_data || that_present_data) {
      if (!(this_present_data && that_present_data))
        return false;
      if (!this.data.equals(that.data))
        return false;
    }

    boolean this_present_generateTime = true && this.isSetGenerateTime();
    boolean that_present_generateTime = true && that.isSetGenerateTime();
    if (this_present_generateTime || that_present_generateTime) {
      if (!(this_present_generateTime && that_present_generateTime))
        return false;
      if (this.generateTime != that.generateTime)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_taskid = true && (isSetTaskid());
    list.add(present_taskid);
    if (present_taskid)
      list.add(taskid);

    boolean present_data = true && (isSetData());
    list.add(present_data);
    if (present_data)
      list.add(data);

    boolean present_generateTime = true && (isSetGenerateTime());
    list.add(present_generateTime);
    if (present_generateTime)
      list.add(generateTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTaskInfo other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTaskid()).compareTo(other.isSetTaskid());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTaskid()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.taskid, other.taskid);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetData()).compareTo(other.isSetData());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetData()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.data, other.data);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetGenerateTime()).compareTo(other.isSetGenerateTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetGenerateTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.generateTime, other.generateTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("TTaskInfo(");
    boolean first = true;

    sb.append("taskid:");
    if (this.taskid == null) {
      sb.append("null");
    } else {
      sb.append(this.taskid);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("data:");
    if (this.data == null) {
      sb.append("null");
    } else {
      sb.append(this.data);
    }
    first = false;
    if (isSetGenerateTime()) {
      if (!first) sb.append(", ");
      sb.append("generateTime:");
      sb.append(this.generateTime);
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    if (taskid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskid' was not present! Struct: " + toString());
    }
    if (data == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'data' was not present! Struct: " + toString());
    }
    // check for sub-struct validity
    if (taskid != null) {
      taskid.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class TTaskInfoStandardSchemeFactory implements SchemeFactory {
    public TTaskInfoStandardScheme getScheme() {
      return new TTaskInfoStandardScheme();
    }
  }

  private static class TTaskInfoStandardScheme extends StandardScheme<TTaskInfo> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTaskInfo struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TASKID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskid = new TTaskId();
              struct.taskid.read(iprot);
              struct.setTaskidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DATA
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map0 = iprot.readMapBegin();
                struct.data = new HashMap<String,String>(2*_map0.size);
                String _key1;
                String _val2;
                for (int _i3 = 0; _i3 < _map0.size; ++_i3)
                {
                  _key1 = iprot.readString();
                  _val2 = iprot.readString();
                  struct.data.put(_key1, _val2);
                }
                iprot.readMapEnd();
              }
              struct.setDataIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // GENERATE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.generateTime = iprot.readI64();
              struct.setGenerateTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTaskInfo struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.taskid != null) {
        oprot.writeFieldBegin(TASKID_FIELD_DESC);
        struct.taskid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.data != null) {
        oprot.writeFieldBegin(DATA_FIELD_DESC);
        {
          oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.data.size()));
          for (Map.Entry<String, String> _iter4 : struct.data.entrySet())
          {
            oprot.writeString(_iter4.getKey());
            oprot.writeString(_iter4.getValue());
          }
          oprot.writeMapEnd();
        }
        oprot.writeFieldEnd();
      }
      if (struct.isSetGenerateTime()) {
        oprot.writeFieldBegin(GENERATE_TIME_FIELD_DESC);
        oprot.writeI64(struct.generateTime);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TTaskInfoTupleSchemeFactory implements SchemeFactory {
    public TTaskInfoTupleScheme getScheme() {
      return new TTaskInfoTupleScheme();
    }
  }

  private static class TTaskInfoTupleScheme extends TupleScheme<TTaskInfo> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTaskInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      struct.taskid.write(oprot);
      {
        oprot.writeI32(struct.data.size());
        for (Map.Entry<String, String> _iter5 : struct.data.entrySet())
        {
          oprot.writeString(_iter5.getKey());
          oprot.writeString(_iter5.getValue());
        }
      }
      BitSet optionals = new BitSet();
      if (struct.isSetGenerateTime()) {
        optionals.set(0);
      }
      oprot.writeBitSet(optionals, 1);
      if (struct.isSetGenerateTime()) {
        oprot.writeI64(struct.generateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTaskInfo struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.taskid = new TTaskId();
      struct.taskid.read(iprot);
      struct.setTaskidIsSet(true);
      {
        org.apache.thrift.protocol.TMap _map6 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
        struct.data = new HashMap<String,String>(2*_map6.size);
        String _key7;
        String _val8;
        for (int _i9 = 0; _i9 < _map6.size; ++_i9)
        {
          _key7 = iprot.readString();
          _val8 = iprot.readString();
          struct.data.put(_key7, _val8);
        }
      }
      struct.setDataIsSet(true);
      BitSet incoming = iprot.readBitSet(1);
      if (incoming.get(0)) {
        struct.generateTime = iprot.readI64();
        struct.setGenerateTimeIsSet(true);
      }
    }
  }

}

