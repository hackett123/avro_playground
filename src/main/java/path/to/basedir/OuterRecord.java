/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package path.to.basedir;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class OuterRecord extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = -6690203938192120746L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"OuterRecord\",\"namespace\":\"path.to.basedir\",\"fields\":[{\"name\":\"name\",\"type\":\"string\",\"default\":\"\"},{\"name\":\"intField\",\"type\":\"int\",\"default\":0}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<OuterRecord> ENCODER =
      new BinaryMessageEncoder<OuterRecord>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<OuterRecord> DECODER =
      new BinaryMessageDecoder<OuterRecord>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<OuterRecord> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<OuterRecord> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<OuterRecord> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<OuterRecord>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this OuterRecord to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a OuterRecord from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a OuterRecord instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static OuterRecord fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private java.lang.CharSequence name;
  private int intField;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public OuterRecord() {}

  /**
   * All-args constructor.
   * @param name The new value for name
   * @param intField The new value for intField
   */
  public OuterRecord(java.lang.CharSequence name, java.lang.Integer intField) {
    this.name = name;
    this.intField = intField;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return name;
    case 1: return intField;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: name = (java.lang.CharSequence)value$; break;
    case 1: intField = (java.lang.Integer)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'name' field.
   * @return The value of the 'name' field.
   */
  public java.lang.CharSequence getName() {
    return name;
  }


  /**
   * Sets the value of the 'name' field.
   * @param value the value to set.
   */
  public void setName(java.lang.CharSequence value) {
    this.name = value;
  }

  /**
   * Gets the value of the 'intField' field.
   * @return The value of the 'intField' field.
   */
  public int getIntField() {
    return intField;
  }


  /**
   * Sets the value of the 'intField' field.
   * @param value the value to set.
   */
  public void setIntField(int value) {
    this.intField = value;
  }

  /**
   * Creates a new OuterRecord RecordBuilder.
   * @return A new OuterRecord RecordBuilder
   */
  public static path.to.basedir.OuterRecord.Builder newBuilder() {
    return new path.to.basedir.OuterRecord.Builder();
  }

  /**
   * Creates a new OuterRecord RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new OuterRecord RecordBuilder
   */
  public static path.to.basedir.OuterRecord.Builder newBuilder(path.to.basedir.OuterRecord.Builder other) {
    if (other == null) {
      return new path.to.basedir.OuterRecord.Builder();
    } else {
      return new path.to.basedir.OuterRecord.Builder(other);
    }
  }

  /**
   * Creates a new OuterRecord RecordBuilder by copying an existing OuterRecord instance.
   * @param other The existing instance to copy.
   * @return A new OuterRecord RecordBuilder
   */
  public static path.to.basedir.OuterRecord.Builder newBuilder(path.to.basedir.OuterRecord other) {
    if (other == null) {
      return new path.to.basedir.OuterRecord.Builder();
    } else {
      return new path.to.basedir.OuterRecord.Builder(other);
    }
  }

  /**
   * RecordBuilder for OuterRecord instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<OuterRecord>
    implements org.apache.avro.data.RecordBuilder<OuterRecord> {

    private java.lang.CharSequence name;
    private int intField;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(path.to.basedir.OuterRecord.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (isValidValue(fields()[1], other.intField)) {
        this.intField = data().deepCopy(fields()[1].schema(), other.intField);
        fieldSetFlags()[1] = other.fieldSetFlags()[1];
      }
    }

    /**
     * Creates a Builder by copying an existing OuterRecord instance
     * @param other The existing instance to copy.
     */
    private Builder(path.to.basedir.OuterRecord other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.name)) {
        this.name = data().deepCopy(fields()[0].schema(), other.name);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.intField)) {
        this.intField = data().deepCopy(fields()[1].schema(), other.intField);
        fieldSetFlags()[1] = true;
      }
    }

    /**
      * Gets the value of the 'name' field.
      * @return The value.
      */
    public java.lang.CharSequence getName() {
      return name;
    }


    /**
      * Sets the value of the 'name' field.
      * @param value The value of 'name'.
      * @return This builder.
      */
    public path.to.basedir.OuterRecord.Builder setName(java.lang.CharSequence value) {
      validate(fields()[0], value);
      this.name = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'name' field has been set.
      * @return True if the 'name' field has been set, false otherwise.
      */
    public boolean hasName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'name' field.
      * @return This builder.
      */
    public path.to.basedir.OuterRecord.Builder clearName() {
      name = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'intField' field.
      * @return The value.
      */
    public int getIntField() {
      return intField;
    }


    /**
      * Sets the value of the 'intField' field.
      * @param value The value of 'intField'.
      * @return This builder.
      */
    public path.to.basedir.OuterRecord.Builder setIntField(int value) {
      validate(fields()[1], value);
      this.intField = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'intField' field has been set.
      * @return True if the 'intField' field has been set, false otherwise.
      */
    public boolean hasIntField() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'intField' field.
      * @return This builder.
      */
    public path.to.basedir.OuterRecord.Builder clearIntField() {
      fieldSetFlags()[1] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public OuterRecord build() {
      try {
        OuterRecord record = new OuterRecord();
        record.name = fieldSetFlags()[0] ? this.name : (java.lang.CharSequence) defaultValue(fields()[0]);
        record.intField = fieldSetFlags()[1] ? this.intField : (java.lang.Integer) defaultValue(fields()[1]);
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<OuterRecord>
    WRITER$ = (org.apache.avro.io.DatumWriter<OuterRecord>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<OuterRecord>
    READER$ = (org.apache.avro.io.DatumReader<OuterRecord>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    out.writeString(this.name);

    out.writeInt(this.intField);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);

      this.intField = in.readInt();

    } else {
      for (int i = 0; i < 2; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          this.name = in.readString(this.name instanceof Utf8 ? (Utf8)this.name : null);
          break;

        case 1:
          this.intField = in.readInt();
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}









