/**
 * Autogenerated by Thrift Compiler (0.9.2)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package am.ik.categolj2.thrift;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.2)", date = "2015-5-14")
public class TEntry implements org.apache.thrift.TBase<TEntry, TEntry._Fields>, java.io.Serializable, Cloneable, Comparable<TEntry> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("TEntry");

  private static final org.apache.thrift.protocol.TField ENTRY_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("entryId", org.apache.thrift.protocol.TType.I32, (short)1);
  private static final org.apache.thrift.protocol.TField TITLE_FIELD_DESC = new org.apache.thrift.protocol.TField("title", org.apache.thrift.protocol.TType.STRING, (short)2);
  private static final org.apache.thrift.protocol.TField CONTENTS_FIELD_DESC = new org.apache.thrift.protocol.TField("contents", org.apache.thrift.protocol.TType.STRING, (short)3);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new TEntryStandardSchemeFactory());
    schemes.put(TupleScheme.class, new TEntryTupleSchemeFactory());
  }

  private int entryId; // required
  private String title; // required
  private String contents; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    ENTRY_ID((short)1, "entryId"),
    TITLE((short)2, "title"),
    CONTENTS((short)3, "contents");

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
        case 1: // ENTRY_ID
          return ENTRY_ID;
        case 2: // TITLE
          return TITLE;
        case 3: // CONTENTS
          return CONTENTS;
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
  private static final int __ENTRYID_ISSET_ID = 0;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.ENTRY_ID, new org.apache.thrift.meta_data.FieldMetaData("entryId", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I32)));
    tmpMap.put(_Fields.TITLE, new org.apache.thrift.meta_data.FieldMetaData("title", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    tmpMap.put(_Fields.CONTENTS, new org.apache.thrift.meta_data.FieldMetaData("contents", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(TEntry.class, metaDataMap);
  }

  public TEntry() {
  }

  public TEntry(
    int entryId,
    String title,
    String contents)
  {
    this();
    this.entryId = entryId;
    setEntryIdIsSet(true);
    this.title = title;
    this.contents = contents;
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public TEntry(TEntry other) {
    __isset_bitfield = other.__isset_bitfield;
    this.entryId = other.entryId;
    if (other.isSetTitle()) {
      this.title = other.title;
    }
    if (other.isSetContents()) {
      this.contents = other.contents;
    }
  }

  public TEntry deepCopy() {
    return new TEntry(this);
  }

  @Override
  public void clear() {
    setEntryIdIsSet(false);
    this.entryId = 0;
    this.title = null;
    this.contents = null;
  }

  public int getEntryId() {
    return this.entryId;
  }

  public void setEntryId(int entryId) {
    this.entryId = entryId;
    setEntryIdIsSet(true);
  }

  public void unsetEntryId() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ENTRYID_ISSET_ID);
  }

  /** Returns true if field entryId is set (has been assigned a value) and false otherwise */
  public boolean isSetEntryId() {
    return EncodingUtils.testBit(__isset_bitfield, __ENTRYID_ISSET_ID);
  }

  public void setEntryIdIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ENTRYID_ISSET_ID, value);
  }

  public String getTitle() {
    return this.title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void unsetTitle() {
    this.title = null;
  }

  /** Returns true if field title is set (has been assigned a value) and false otherwise */
  public boolean isSetTitle() {
    return this.title != null;
  }

  public void setTitleIsSet(boolean value) {
    if (!value) {
      this.title = null;
    }
  }

  public String getContents() {
    return this.contents;
  }

  public void setContents(String contents) {
    this.contents = contents;
  }

  public void unsetContents() {
    this.contents = null;
  }

  /** Returns true if field contents is set (has been assigned a value) and false otherwise */
  public boolean isSetContents() {
    return this.contents != null;
  }

  public void setContentsIsSet(boolean value) {
    if (!value) {
      this.contents = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case ENTRY_ID:
      if (value == null) {
        unsetEntryId();
      } else {
        setEntryId((Integer)value);
      }
      break;

    case TITLE:
      if (value == null) {
        unsetTitle();
      } else {
        setTitle((String)value);
      }
      break;

    case CONTENTS:
      if (value == null) {
        unsetContents();
      } else {
        setContents((String)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case ENTRY_ID:
      return Integer.valueOf(getEntryId());

    case TITLE:
      return getTitle();

    case CONTENTS:
      return getContents();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case ENTRY_ID:
      return isSetEntryId();
    case TITLE:
      return isSetTitle();
    case CONTENTS:
      return isSetContents();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof TEntry)
      return this.equals((TEntry)that);
    return false;
  }

  public boolean equals(TEntry that) {
    if (that == null)
      return false;

    boolean this_present_entryId = true;
    boolean that_present_entryId = true;
    if (this_present_entryId || that_present_entryId) {
      if (!(this_present_entryId && that_present_entryId))
        return false;
      if (this.entryId != that.entryId)
        return false;
    }

    boolean this_present_title = true && this.isSetTitle();
    boolean that_present_title = true && that.isSetTitle();
    if (this_present_title || that_present_title) {
      if (!(this_present_title && that_present_title))
        return false;
      if (!this.title.equals(that.title))
        return false;
    }

    boolean this_present_contents = true && this.isSetContents();
    boolean that_present_contents = true && that.isSetContents();
    if (this_present_contents || that_present_contents) {
      if (!(this_present_contents && that_present_contents))
        return false;
      if (!this.contents.equals(that.contents))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_entryId = true;
    list.add(present_entryId);
    if (present_entryId)
      list.add(entryId);

    boolean present_title = true && (isSetTitle());
    list.add(present_title);
    if (present_title)
      list.add(title);

    boolean present_contents = true && (isSetContents());
    list.add(present_contents);
    if (present_contents)
      list.add(contents);

    return list.hashCode();
  }

  @Override
  public int compareTo(TEntry other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetEntryId()).compareTo(other.isSetEntryId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetEntryId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.entryId, other.entryId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTitle()).compareTo(other.isSetTitle());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTitle()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.title, other.title);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetContents()).compareTo(other.isSetContents());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetContents()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.contents, other.contents);
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
    StringBuilder sb = new StringBuilder("TEntry(");
    boolean first = true;

    sb.append("entryId:");
    sb.append(this.entryId);
    first = false;
    if (!first) sb.append(", ");
    sb.append("title:");
    if (this.title == null) {
      sb.append("null");
    } else {
      sb.append(this.title);
    }
    first = false;
    if (!first) sb.append(", ");
    sb.append("contents:");
    if (this.contents == null) {
      sb.append("null");
    } else {
      sb.append(this.contents);
    }
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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

  private static class TEntryStandardSchemeFactory implements SchemeFactory {
    public TEntryStandardScheme getScheme() {
      return new TEntryStandardScheme();
    }
  }

  private static class TEntryStandardScheme extends StandardScheme<TEntry> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, TEntry struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // ENTRY_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.entryId = iprot.readI32();
              struct.setEntryIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // TITLE
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.title = iprot.readString();
              struct.setTitleIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // CONTENTS
            if (schemeField.type == org.apache.thrift.protocol.TType.STRING) {
              struct.contents = iprot.readString();
              struct.setContentsIsSet(true);
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
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, TEntry struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(ENTRY_ID_FIELD_DESC);
      oprot.writeI32(struct.entryId);
      oprot.writeFieldEnd();
      if (struct.title != null) {
        oprot.writeFieldBegin(TITLE_FIELD_DESC);
        oprot.writeString(struct.title);
        oprot.writeFieldEnd();
      }
      if (struct.contents != null) {
        oprot.writeFieldBegin(CONTENTS_FIELD_DESC);
        oprot.writeString(struct.contents);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class TEntryTupleSchemeFactory implements SchemeFactory {
    public TEntryTupleScheme getScheme() {
      return new TEntryTupleScheme();
    }
  }

  private static class TEntryTupleScheme extends TupleScheme<TEntry> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, TEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetEntryId()) {
        optionals.set(0);
      }
      if (struct.isSetTitle()) {
        optionals.set(1);
      }
      if (struct.isSetContents()) {
        optionals.set(2);
      }
      oprot.writeBitSet(optionals, 3);
      if (struct.isSetEntryId()) {
        oprot.writeI32(struct.entryId);
      }
      if (struct.isSetTitle()) {
        oprot.writeString(struct.title);
      }
      if (struct.isSetContents()) {
        oprot.writeString(struct.contents);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, TEntry struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(3);
      if (incoming.get(0)) {
        struct.entryId = iprot.readI32();
        struct.setEntryIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.title = iprot.readString();
        struct.setTitleIsSet(true);
      }
      if (incoming.get(2)) {
        struct.contents = iprot.readString();
        struct.setContentsIsSet(true);
      }
    }
  }

}

