/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.amazonaws.athena.connector.lambda.metadata;

import org.apache.avro.generic.GenericArray;
import org.apache.avro.specific.SpecificData;
import org.apache.avro.util.Utf8;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@org.apache.avro.specific.AvroGenerated
public class GetSplitsRequest extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 2513947597936587897L;


  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"GetSplitsRequest\",\"namespace\":\"com.amazonaws.athena.connector.lambda.metadata\",\"fields\":[{\"name\":\"constraints\",\"type\":{\"type\":\"record\",\"name\":\"Constraints\",\"namespace\":\"com.amazonaws.athena.connector.lambda.domain.predicate\",\"fields\":[{\"name\":\"limit\",\"type\":\"long\",\"default\":-1}]}}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static final SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<GetSplitsRequest> ENCODER =
      new BinaryMessageEncoder<GetSplitsRequest>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<GetSplitsRequest> DECODER =
      new BinaryMessageDecoder<GetSplitsRequest>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageEncoder instance used by this class.
   * @return the message encoder used by this class
   */
  public static BinaryMessageEncoder<GetSplitsRequest> getEncoder() {
    return ENCODER;
  }

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   * @return the message decoder used by this class
   */
  public static BinaryMessageDecoder<GetSplitsRequest> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   * @return a BinaryMessageDecoder instance for this class backed by the given SchemaStore
   */
  public static BinaryMessageDecoder<GetSplitsRequest> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<GetSplitsRequest>(MODEL$, SCHEMA$, resolver);
  }

  /**
   * Serializes this GetSplitsRequest to a ByteBuffer.
   * @return a buffer holding the serialized data for this instance
   * @throws java.io.IOException if this instance could not be serialized
   */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /**
   * Deserializes a GetSplitsRequest from a ByteBuffer.
   * @param b a byte buffer holding serialized data for an instance of this class
   * @return a GetSplitsRequest instance decoded from the given buffer
   * @throws java.io.IOException if the given bytes could not be deserialized into an instance of this class
   */
  public static GetSplitsRequest fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  private com.amazonaws.athena.connector.lambda.domain.predicate.Constraints constraints;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public GetSplitsRequest() {}

  /**
   * All-args constructor.
   * @param constraints The new value for constraints
   */
  public GetSplitsRequest(com.amazonaws.athena.connector.lambda.domain.predicate.Constraints constraints) {
    this.constraints = constraints;
  }

  public org.apache.avro.specific.SpecificData getSpecificData() { return MODEL$; }
  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return constraints;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: constraints = (com.amazonaws.athena.connector.lambda.domain.predicate.Constraints)value$; break;
    default: throw new IndexOutOfBoundsException("Invalid index: " + field$);
    }
  }

  /**
   * Gets the value of the 'constraints' field.
   * @return The value of the 'constraints' field.
   */
  public com.amazonaws.athena.connector.lambda.domain.predicate.Constraints getConstraints() {
    return constraints;
  }


  /**
   * Sets the value of the 'constraints' field.
   * @param value the value to set.
   */
  public void setConstraints(com.amazonaws.athena.connector.lambda.domain.predicate.Constraints value) {
    this.constraints = value;
  }

  /**
   * Creates a new GetSplitsRequest RecordBuilder.
   * @return A new GetSplitsRequest RecordBuilder
   */
  public static com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder newBuilder() {
    return new com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder();
  }

  /**
   * Creates a new GetSplitsRequest RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new GetSplitsRequest RecordBuilder
   */
  public static com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder newBuilder(com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder other) {
    if (other == null) {
      return new com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder();
    } else {
      return new com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder(other);
    }
  }

  /**
   * Creates a new GetSplitsRequest RecordBuilder by copying an existing GetSplitsRequest instance.
   * @param other The existing instance to copy.
   * @return A new GetSplitsRequest RecordBuilder
   */
  public static com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder newBuilder(com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest other) {
    if (other == null) {
      return new com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder();
    } else {
      return new com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder(other);
    }
  }

  /**
   * RecordBuilder for GetSplitsRequest instances.
   */
  @org.apache.avro.specific.AvroGenerated
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<GetSplitsRequest>
    implements org.apache.avro.data.RecordBuilder<GetSplitsRequest> {

    private com.amazonaws.athena.connector.lambda.domain.predicate.Constraints constraints;
    private com.amazonaws.athena.connector.lambda.domain.predicate.Constraints.Builder constraintsBuilder;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$, MODEL$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.constraints)) {
        this.constraints = data().deepCopy(fields()[0].schema(), other.constraints);
        fieldSetFlags()[0] = other.fieldSetFlags()[0];
      }
      if (other.hasConstraintsBuilder()) {
        this.constraintsBuilder = com.amazonaws.athena.connector.lambda.domain.predicate.Constraints.newBuilder(other.getConstraintsBuilder());
      }
    }

    /**
     * Creates a Builder by copying an existing GetSplitsRequest instance
     * @param other The existing instance to copy.
     */
    private Builder(com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest other) {
      super(SCHEMA$, MODEL$);
      if (isValidValue(fields()[0], other.constraints)) {
        this.constraints = data().deepCopy(fields()[0].schema(), other.constraints);
        fieldSetFlags()[0] = true;
      }
      this.constraintsBuilder = null;
    }

    /**
      * Gets the value of the 'constraints' field.
      * @return The value.
      */
    public com.amazonaws.athena.connector.lambda.domain.predicate.Constraints getConstraints() {
      return constraints;
    }


    /**
      * Sets the value of the 'constraints' field.
      * @param value The value of 'constraints'.
      * @return This builder.
      */
    public com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder setConstraints(com.amazonaws.athena.connector.lambda.domain.predicate.Constraints value) {
      validate(fields()[0], value);
      this.constraintsBuilder = null;
      this.constraints = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'constraints' field has been set.
      * @return True if the 'constraints' field has been set, false otherwise.
      */
    public boolean hasConstraints() {
      return fieldSetFlags()[0];
    }

    /**
     * Gets the Builder instance for the 'constraints' field and creates one if it doesn't exist yet.
     * @return This builder.
     */
    public com.amazonaws.athena.connector.lambda.domain.predicate.Constraints.Builder getConstraintsBuilder() {
      if (constraintsBuilder == null) {
        if (hasConstraints()) {
          setConstraintsBuilder(com.amazonaws.athena.connector.lambda.domain.predicate.Constraints.newBuilder(constraints));
        } else {
          setConstraintsBuilder(com.amazonaws.athena.connector.lambda.domain.predicate.Constraints.newBuilder());
        }
      }
      return constraintsBuilder;
    }

    /**
     * Sets the Builder instance for the 'constraints' field
     * @param value The builder instance that must be set.
     * @return This builder.
     */

    public com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder setConstraintsBuilder(com.amazonaws.athena.connector.lambda.domain.predicate.Constraints.Builder value) {
      clearConstraints();
      constraintsBuilder = value;
      return this;
    }

    /**
     * Checks whether the 'constraints' field has an active Builder instance
     * @return True if the 'constraints' field has an active Builder instance
     */
    public boolean hasConstraintsBuilder() {
      return constraintsBuilder != null;
    }

    /**
      * Clears the value of the 'constraints' field.
      * @return This builder.
      */
    public com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest.Builder clearConstraints() {
      constraints = null;
      constraintsBuilder = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public GetSplitsRequest build() {
      try {
        GetSplitsRequest record = new GetSplitsRequest();
        if (constraintsBuilder != null) {
          try {
            record.constraints = this.constraintsBuilder.build();
          } catch (org.apache.avro.AvroMissingFieldException e) {
            e.addParentField(record.getSchema().getField("constraints"));
            throw e;
          }
        } else {
          record.constraints = fieldSetFlags()[0] ? this.constraints : (com.amazonaws.athena.connector.lambda.domain.predicate.Constraints) defaultValue(fields()[0]);
        }
        return record;
      } catch (org.apache.avro.AvroMissingFieldException e) {
        throw e;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<GetSplitsRequest>
    WRITER$ = (org.apache.avro.io.DatumWriter<GetSplitsRequest>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<GetSplitsRequest>
    READER$ = (org.apache.avro.io.DatumReader<GetSplitsRequest>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

  @Override protected boolean hasCustomCoders() { return true; }

  @Override public void customEncode(org.apache.avro.io.Encoder out)
    throws java.io.IOException
  {
    this.constraints.customEncode(out);

  }

  @Override public void customDecode(org.apache.avro.io.ResolvingDecoder in)
    throws java.io.IOException
  {
    org.apache.avro.Schema.Field[] fieldOrder = in.readFieldOrderIfDiff();
    if (fieldOrder == null) {
      if (this.constraints == null) {
        this.constraints = new com.amazonaws.athena.connector.lambda.domain.predicate.Constraints();
      }
      this.constraints.customDecode(in);

    } else {
      for (int i = 0; i < 1; i++) {
        switch (fieldOrder[i].pos()) {
        case 0:
          if (this.constraints == null) {
            this.constraints = new com.amazonaws.athena.connector.lambda.domain.predicate.Constraints();
          }
          this.constraints.customDecode(in);
          break;

        default:
          throw new java.io.IOException("Corrupt ResolvingDecoder.");
        }
      }
    }
  }
}










