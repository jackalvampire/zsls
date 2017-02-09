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
public class TTaskResult implements org.apache.thrift.TBase<TTaskResult, TTaskResult._Fields>, java.io.Serializable, Cloneable, Comparable<TTaskResult> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TTaskResult");

  private static final org.apache.thrift.protocol.TField ACTION_FIELD_DESC = new org.apache.thrift.protocol.TField("action", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TASKID_FIELD_DESC = new org.apache.thrift.protocol.TField("taskid", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField EXECUTE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("executeTime", org.apache.thrift.protocol.TType.I64, (short)3);
  private static final org.apache.thrift.protocol.TField INFO_FIELD_DESC = new org.apache.thrift.protocol.TField("info", org.apache.thrift.protocol.TType.STRING, (short)4);
  private static final org.apache.thrift.protocol.TField KEY_MSG_FIELD_DESC = new org.apache.thrift.protocol.TField("keyMsg", org.apache.thrift.protocol.TType.STRING, (short)5);
  private static final org.apache.thrift.protocol.TField RUNTIME_PARAMS_FIELD_DESC = new org.apache.thrift.protocol.TField("runtimeParams", org.apache.thrift.protocol.TType.MAP, (short)6);
  private static final org.apache.thrift.protocol.TField GENERATE_TIME_FIELD_DESC = new org.apache.thrift.protocol.TField("generateTime", org.apache.thrift.protocol.TType.I64, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TTaskResultStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TTaskResultTupleSchemeFactory());
  }

  public TaskAction action; // required
  public TTaskId taskid; // required
  public long executeTime; // optional
  public String info; // optional
  public String keyMsg; // optional
  public Map<String,String> runtimeParams; // optional
  public long generateTime; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ACTION((short)1, "action"),
    TASKID((short)2, "taskid"),
    EXECUTE_TIME((short)3, "executeTime"),
    INFO((short)4, "info"),
    KEY_MSG((short)5, "keyMsg"),
    RUNTIME_PARAMS((short)6, "runtimeParams"),
    GENERATE_TIME((short)7, "generateTime");

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
        case 1: // ACTION
          return ACTION;
        case 2: // TASKID
          return TASKID;
        case 3: // EXECUTE_TIME
          return EXECUTE_TIME;
        case 4: // INFO
          return INFO;
        case 5: // KEY_MSG
          return KEY_MSG;
        case 6: // RUNTIME_PARAMS
          return RUNTIME_PARAMS;
        case 7: // GENERATE_TIME
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
  private static final int __EXECUTETIME_ISSET_ID = 0;
  private static final int __GENERATETIME_ISSET_ID = 1;
  private byte __isset_bitfield = 0;
  private static final _Fields optionals[] = {_Fields.EXECUTE_TIME,_Fields.INFO,_Fields.KEY_MSG,_Fields.RUNTIME_PARAMS,_Fields.GENERATE_TIME};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ACTION, new org.apache.thrift.meta_data.FieldMetaData("action", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.ENUM        , "TaskAction")));
    tmpMap.put(_Fields.TASKID, new org.apache.thrift.meta_data.FieldMetaData("taskid", org.apache.thrift.TFieldRequirementType.REQUIRED, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, TTaskId.class)));
    tmpMap.put(_Fields.EXECUTE_TIME, new org.apache.thrift.meta_data.FieldMetaData("executeTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.INFO, new org.apache.thrift.meta_data.FieldMetaData("info", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.KEY_MSG, new org.apache.thrift.meta_data.FieldMetaData("keyMsg", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.RUNTIME_PARAMS, new org.apache.thrift.meta_data.FieldMetaData("runtimeParams", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING))));
    tmpMap.put(_Fields.GENERATE_TIME, new org.apache.thrift.meta_data.FieldMetaData("generateTime", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TTaskResult.class, metaDataMap);
  }

  public TTaskResult() {
  }

  public TTaskResult(
    TaskAction action,
    TTaskId taskid)
  {
    this();
    this.action = action;
    this.taskid = taskid;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TTaskResult(TTaskResult other) {
    __isset_bitfield = other.__isset_bitfield;
    if (other.isSetAction()) {
      this.action = other.action;
    }
    if (other.isSetTaskid()) {
      this.taskid = new TTaskId(other.taskid);
    }
    this.executeTime = other.executeTime;
    if (other.isSetInfo()) {
      this.info = other.info;
    }
    if (other.isSetKeyMsg()) {
      this.keyMsg = other.keyMsg;
    }
    if (other.isSetRuntimeParams()) {
      Map<String,String> __this__runtimeParams = new HashMap<String,String>(other.runtimeParams);
      this.runtimeParams = __this__runtimeParams;
    }
    this.generateTime = other.generateTime;
  }

  public TTaskResult deepCopy() {
    return new TTaskResult(this);
  }

  @Override
  public void clear() {
    this.action = null;
    this.taskid = null;
    setExecuteTimeIsSet(false);
    this.executeTime = 0;
    this.info = null;
    this.keyMsg = null;
    this.runtimeParams = null;
    setGenerateTimeIsSet(false);
    this.generateTime = 0;
  }

  public TaskAction getAction() {
    return this.action;
  }

  public TTaskResult setAction(TaskAction action) {
    this.action = action;
    return this;
  }

  public void unsetAction() {
    this.action = null;
  }

  /** Returns true if field action is set (has been assigned a value) and false otherwise */
  public boolean isSetAction() {
    return this.action != null;
  }

  public void setActionIsSet(boolean value) {
    if (!value) {
      this.action = null;
    }
  }

  public TTaskId getTaskid() {
    return this.taskid;
  }

  public TTaskResult setTaskid(TTaskId taskid) {
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

  public long getExecuteTime() {
    return this.executeTime;
  }

  public TTaskResult setExecuteTime(long executeTime) {
    this.executeTime = executeTime;
    setExecuteTimeIsSet(true);
    return this;
  }

  public void unsetExecuteTime() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __EXECUTETIME_ISSET_ID);
  }

  /** Returns true if field executeTime is set (has been assigned a value) and false otherwise */
  public boolean isSetExecuteTime() {
    return EncodingUtils.testBit(__isset_bitfield, __EXECUTETIME_ISSET_ID);
  }

  public void setExecuteTimeIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __EXECUTETIME_ISSET_ID, value);
  }

  public String getInfo() {
    return this.info;
  }

  public TTaskResult setInfo(String info) {
    this.info = info;
    return this;
  }

  public void unsetInfo() {
    this.info = null;
  }

  /** Returns true if field info is set (has been assigned a value) and false otherwise */
  public boolean isSetInfo() {
    return this.info != null;
  }

  public void setInfoIsSet(boolean value) {
    if (!value) {
      this.info = null;
    }
  }

  public String getKeyMsg() {
    return this.keyMsg;
  }

  public TTaskResult setKeyMsg(String keyMsg) {
    this.keyMsg = keyMsg;
    return this;
  }

  public void unsetKeyMsg() {
    this.keyMsg = null;
  }

  /** Returns true if field keyMsg is set (has been assigned a value) and false otherwise */
  public boolean isSetKeyMsg() {
    return this.keyMsg != null;
  }

  public void setKeyMsgIsSet(boolean value) {
    if (!value) {
      this.keyMsg = null;
    }
  }

  public int getRuntimeParamsSize() {
    return (this.runtimeParams == null) ? 0 : this.runtimeParams.size();
  }

  public void putToRuntimeParams(String key, String val) {
    if (this.runtimeParams == null) {
      this.runtimeParams = new HashMap<String,String>();
    }
    this.runtimeParams.put(key, val);
  }

  public Map<String,String> getRuntimeParams() {
    return this.runtimeParams;
  }

  public TTaskResult setRuntimeParams(Map<String,String> runtimeParams) {
    this.runtimeParams = runtimeParams;
    return this;
  }

  public void unsetRuntimeParams() {
    this.runtimeParams = null;
  }

  /** Returns true if field runtimeParams is set (has been assigned a value) and false otherwise */
  public boolean isSetRuntimeParams() {
    return this.runtimeParams != null;
  }

  public void setRuntimeParamsIsSet(boolean value) {
    if (!value) {
      this.runtimeParams = null;
    }
  }

  public long getGenerateTime() {
    return this.generateTime;
  }

  public TTaskResult setGenerateTime(long generateTime) {
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
    case ACTION:
      if (value == null) {
        unsetAction();
      } else {
        setAction((TaskAction)value);
      }
      break;

    case TASKID:
      if (value == null) {
        unsetTaskid();
      } else {
        setTaskid((TTaskId)value);
      }
      break;

    case EXECUTE_TIME:
      if (value == null) {
        unsetExecuteTime();
      } else {
        setExecuteTime((Long)value);
      }
      break;

    case INFO:
      if (value == null) {
        unsetInfo();
      } else {
        setInfo((String)value);
      }
      break;

    case KEY_MSG:
      if (value == null) {
        unsetKeyMsg();
      } else {
        setKeyMsg((String)value);
      }
      break;

    case RUNTIME_PARAMS:
      if (value == null) {
        unsetRuntimeParams();
      } else {
        setRuntimeParams((Map<String,String>)value);
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
    case ACTION:
      return getAction();

    case TASKID:
      return getTaskid();

    case EXECUTE_TIME:
      return Long.valueOf(getExecuteTime());

    case INFO:
      return getInfo();

    case KEY_MSG:
      return getKeyMsg();

    case RUNTIME_PARAMS:
      return getRuntimeParams();

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
    case ACTION:
      return isSetAction();
    case TASKID:
      return isSetTaskid();
    case EXECUTE_TIME:
      return isSetExecuteTime();
    case INFO:
      return isSetInfo();
    case KEY_MSG:
      return isSetKeyMsg();
    case RUNTIME_PARAMS:
      return isSetRuntimeParams();
    case GENERATE_TIME:
      return isSetGenerateTime();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TTaskResult)
      return this.equals((TTaskResult)that);
    return false;
  }

  public boolean equals(TTaskResult that) {
    if (that == null)
      return false;

    boolean this_present_action = true && this.isSetAction();
    boolean that_present_action = true && that.isSetAction();
    if (this_present_action || that_present_action) {
      if (!(this_present_action && that_present_action))
        return false;
      if (!this.action.equals(that.action))
        return false;
    }

    boolean this_present_taskid = true && this.isSetTaskid();
    boolean that_present_taskid = true && that.isSetTaskid();
    if (this_present_taskid || that_present_taskid) {
      if (!(this_present_taskid && that_present_taskid))
        return false;
      if (!this.taskid.equals(that.taskid))
        return false;
    }

    boolean this_present_executeTime = true && this.isSetExecuteTime();
    boolean that_present_executeTime = true && that.isSetExecuteTime();
    if (this_present_executeTime || that_present_executeTime) {
      if (!(this_present_executeTime && that_present_executeTime))
        return false;
      if (this.executeTime != that.executeTime)
        return false;
    }

    boolean this_present_info = true && this.isSetInfo();
    boolean that_present_info = true && that.isSetInfo();
    if (this_present_info || that_present_info) {
      if (!(this_present_info && that_present_info))
        return false;
      if (!this.info.equals(that.info))
        return false;
    }

    boolean this_present_keyMsg = true && this.isSetKeyMsg();
    boolean that_present_keyMsg = true && that.isSetKeyMsg();
    if (this_present_keyMsg || that_present_keyMsg) {
      if (!(this_present_keyMsg && that_present_keyMsg))
        return false;
      if (!this.keyMsg.equals(that.keyMsg))
        return false;
    }

    boolean this_present_runtimeParams = true && this.isSetRuntimeParams();
    boolean that_present_runtimeParams = true && that.isSetRuntimeParams();
    if (this_present_runtimeParams || that_present_runtimeParams) {
      if (!(this_present_runtimeParams && that_present_runtimeParams))
        return false;
      if (!this.runtimeParams.equals(that.runtimeParams))
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

    boolean present_action = true && (isSetAction());
    list.add(present_action);
    if (present_action)
      list.add(action.getValue());

    boolean present_taskid = true && (isSetTaskid());
    list.add(present_taskid);
    if (present_taskid)
      list.add(taskid);

    boolean present_executeTime = true && (isSetExecuteTime());
    list.add(present_executeTime);
    if (present_executeTime)
      list.add(executeTime);

    boolean present_info = true && (isSetInfo());
    list.add(present_info);
    if (present_info)
      list.add(info);

    boolean present_keyMsg = true && (isSetKeyMsg());
    list.add(present_keyMsg);
    if (present_keyMsg)
      list.add(keyMsg);

    boolean present_runtimeParams = true && (isSetRuntimeParams());
    list.add(present_runtimeParams);
    if (present_runtimeParams)
      list.add(runtimeParams);

    boolean present_generateTime = true && (isSetGenerateTime());
    list.add(present_generateTime);
    if (present_generateTime)
      list.add(generateTime);

    return list.hashCode();
  }

  @Override
  public int compareTo(TTaskResult other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAction()).compareTo(other.isSetAction());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAction()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.action, other.action);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
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
    lastComparison = Boolean.valueOf(isSetExecuteTime()).compareTo(other.isSetExecuteTime());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetExecuteTime()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.executeTime, other.executeTime);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetInfo()).compareTo(other.isSetInfo());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetInfo()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.info, other.info);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetKeyMsg()).compareTo(other.isSetKeyMsg());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetKeyMsg()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.keyMsg, other.keyMsg);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetRuntimeParams()).compareTo(other.isSetRuntimeParams());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetRuntimeParams()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.runtimeParams, other.runtimeParams);
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
    StringBuilder sb = new StringBuilder("TTaskResult(");
    boolean first = true;

    sb.append("action:");
    if (this.action == null) {
      sb.append("null");
    } else {
      sb.append(this.action);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("taskid:");
    if (this.taskid == null) {
      sb.append("null");
    } else {
      sb.append(this.taskid);
    }
    first = false;
    if (isSetExecuteTime()) {
      if (!first) sb.append(", ");
      sb.append("executeTime:");
      sb.append(this.executeTime);
      first = false;
    }
    if (isSetInfo()) {
      if (!first) sb.append(", ");
      sb.append("info:");
      if (this.info == null) {
        sb.append("null");
      } else {
        sb.append(this.info);
      }
      first = false;
    }
    if (isSetKeyMsg()) {
      if (!first) sb.append(", ");
      sb.append("keyMsg:");
      if (this.keyMsg == null) {
        sb.append("null");
      } else {
        sb.append(this.keyMsg);
      }
      first = false;
    }
    if (isSetRuntimeParams()) {
      if (!first) sb.append(", ");
      sb.append("runtimeParams:");
      if (this.runtimeParams == null) {
        sb.append("null");
      } else {
        sb.append(this.runtimeParams);
      }
      first = false;
    }
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
    if (action == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'action' was not present! Struct: " + toString());
    }
    if (taskid == null) {
      throw new org.apache.thrift.protocol.TProtocolException("Required field 'taskid' was not present! Struct: " + toString());
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

  private static class TTaskResultStandardSchemeFactory implements SchemeFactory {
    public TTaskResultStandardScheme getScheme() {
      return new TTaskResultStandardScheme();
    }
  }

  private static class TTaskResultStandardScheme extends StandardScheme<TTaskResult> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TTaskResult struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ACTION
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.action = org.pbccrc.zsls.api.thrift.records.TaskAction.findByValue(iprot.readI32());
              struct.setActionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TASKID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.taskid = new TTaskId();
              struct.taskid.read(iprot);
              struct.setTaskidIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // EXECUTE_TIME
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.executeTime = iprot.readI64();
              struct.setExecuteTimeIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // INFO
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.info = iprot.readString();
              struct.setInfoIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // KEY_MSG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.keyMsg = iprot.readString();
              struct.setKeyMsgIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // RUNTIME_PARAMS
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map10 = iprot.readMapBegin();
                struct.runtimeParams = new HashMap<String,String>(2*_map10.size);
                String _key11;
                String _val12;
                for (int _i13 = 0; _i13 < _map10.size; ++_i13)
                {
                  _key11 = iprot.readString();
                  _val12 = iprot.readString();
                  struct.runtimeParams.put(_key11, _val12);
                }
                iprot.readMapEnd();
              }
              struct.setRuntimeParamsIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // GENERATE_TIME
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, TTaskResult struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.action != null) {
        oprot.writeFieldBegin(ACTION_FIELD_DESC);
        oprot.writeI32(struct.action.getValue());
        oprot.writeFieldEnd();
      }
      if (struct.taskid != null) {
        oprot.writeFieldBegin(TASKID_FIELD_DESC);
        struct.taskid.write(oprot);
        oprot.writeFieldEnd();
      }
      if (struct.isSetExecuteTime()) {
        oprot.writeFieldBegin(EXECUTE_TIME_FIELD_DESC);
        oprot.writeI64(struct.executeTime);
        oprot.writeFieldEnd();
      }
      if (struct.info != null) {
        if (struct.isSetInfo()) {
          oprot.writeFieldBegin(INFO_FIELD_DESC);
          oprot.writeString(struct.info);
          oprot.writeFieldEnd();
        }
      }
      if (struct.keyMsg != null) {
        if (struct.isSetKeyMsg()) {
          oprot.writeFieldBegin(KEY_MSG_FIELD_DESC);
          oprot.writeString(struct.keyMsg);
          oprot.writeFieldEnd();
        }
      }
      if (struct.runtimeParams != null) {
        if (struct.isSetRuntimeParams()) {
          oprot.writeFieldBegin(RUNTIME_PARAMS_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, struct.runtimeParams.size()));
            for (Map.Entry<String, String> _iter14 : struct.runtimeParams.entrySet())
            {
              oprot.writeString(_iter14.getKey());
              oprot.writeString(_iter14.getValue());
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
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

  private static class TTaskResultTupleSchemeFactory implements SchemeFactory {
    public TTaskResultTupleScheme getScheme() {
      return new TTaskResultTupleScheme();
    }
  }

  private static class TTaskResultTupleScheme extends TupleScheme<TTaskResult> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TTaskResult struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      oprot.writeI32(struct.action.getValue());
      struct.taskid.write(oprot);
      BitSet optionals = new BitSet();
      if (struct.isSetExecuteTime()) {
        optionals.set(0);
      }
      if (struct.isSetInfo()) {
        optionals.set(1);
      }
      if (struct.isSetKeyMsg()) {
        optionals.set(2);
      }
      if (struct.isSetRuntimeParams()) {
        optionals.set(3);
      }
      if (struct.isSetGenerateTime()) {
        optionals.set(4);
      }
      oprot.writeBitSet(optionals, 5);
      if (struct.isSetExecuteTime()) {
        oprot.writeI64(struct.executeTime);
      }
      if (struct.isSetInfo()) {
        oprot.writeString(struct.info);
      }
      if (struct.isSetKeyMsg()) {
        oprot.writeString(struct.keyMsg);
      }
      if (struct.isSetRuntimeParams()) {
        {
          oprot.writeI32(struct.runtimeParams.size());
          for (Map.Entry<String, String> _iter15 : struct.runtimeParams.entrySet())
          {
            oprot.writeString(_iter15.getKey());
            oprot.writeString(_iter15.getValue());
          }
        }
      }
      if (struct.isSetGenerateTime()) {
        oprot.writeI64(struct.generateTime);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TTaskResult struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      struct.action = org.pbccrc.zsls.api.thrift.records.TaskAction.findByValue(iprot.readI32());
      struct.setActionIsSet(true);
      struct.taskid = new TTaskId();
      struct.taskid.read(iprot);
      struct.setTaskidIsSet(true);
      BitSet incoming = iprot.readBitSet(5);
      if (incoming.get(0)) {
        struct.executeTime = iprot.readI64();
        struct.setExecuteTimeIsSet(true);
      }
      if (incoming.get(1)) {
        struct.info = iprot.readString();
        struct.setInfoIsSet(true);
      }
      if (incoming.get(2)) {
        struct.keyMsg = iprot.readString();
        struct.setKeyMsgIsSet(true);
      }
      if (incoming.get(3)) {
        {
          org.apache.thrift.protocol.TMap _map16 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRING, iprot.readI32());
          struct.runtimeParams = new HashMap<String,String>(2*_map16.size);
          String _key17;
          String _val18;
          for (int _i19 = 0; _i19 < _map16.size; ++_i19)
          {
            _key17 = iprot.readString();
            _val18 = iprot.readString();
            struct.runtimeParams.put(_key17, _val18);
          }
        }
        struct.setRuntimeParamsIsSet(true);
      }
      if (incoming.get(4)) {
        struct.generateTime = iprot.readI64();
        struct.setGenerateTimeIsSet(true);
      }
    }
  }

}

