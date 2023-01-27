package com.amazonaws.athena.connector.lambda;

import com.amazonaws.athena.connector.lambda.domain.predicate.Constraints;
import com.amazonaws.athena.connector.lambda.metadata.GetSplitsRequest;

import org.apache.avro.io.DatumReader;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumWriter;
import org.apache.avro.file.DataFileWriter;

import java.io.File;
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    Constraints constraints = Constraints.newBuilder()
      .setLimit(10L)
      .build();

    GetSplitsRequest getSplitsRequest = GetSplitsRequest.newBuilder()
      .setConstraints(constraints)
      .build();

    File file = new File("getSplitsRequests.avro");
    DatumWriter<GetSplitsRequest> getSplitsRequestDatumWriter = new SpecificDatumWriter<GetSplitsRequest>(GetSplitsRequest.class);
    DataFileWriter<GetSplitsRequest> getSplitsRequestFileWriter = new DataFileWriter<GetSplitsRequest>(getSplitsRequestDatumWriter);
    getSplitsRequestFileWriter.create(getSplitsRequest.getSchema(), file);
    getSplitsRequestFileWriter.append(getSplitsRequest);
    getSplitsRequestFileWriter.close();


    DatumReader<GetSplitsRequest> getSplitsDatumReader = new SpecificDatumReader<GetSplitsRequest>(GetSplitsRequest.class);
    DataFileReader<GetSplitsRequest> dataFileReader = new DataFileReader<GetSplitsRequest>(file, getSplitsDatumReader);
    GetSplitsRequest getSplitsRequestDeserialized = null;
    while (dataFileReader.hasNext()) {
      getSplitsRequestDeserialized = dataFileReader.next();
      System.out.println(getSplitsRequestDeserialized);
    }
  }
}
