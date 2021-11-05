package com.ApiTest.ApiTest.Repository;

//*import jdk.vm.ci.meta.SerializableConstant;
import lombok.Data;
import org.apache.tomcat.util.http.fileupload.FileUtils;
import org.springframework.core.io.ResourceLoader;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DataHandler {
    //*private final Data data;

    //*public DataHandler(ResourceLoader loader) throws IOException {
    //*File file = loader.getResource("classpath:data.json").getFile();
    //* String data = FileUtils.readFileToString(file, "UTF-8");
    //*  this.data = JsonIterator.deserialize(data, Data.class);
    //*  }

    //* public Data getData() {
    //*  return data;
    //* }

    //* public void save() {
    //* String json = JsonStream.serialize(data);
    //*  BufferedWriter writer = null;
    //*  try {
    //*       writer = new BufferedWriter(new FileWriter("classpath:data.json"));
    //*      writer.write(json);
    //*      writer.close();
    //*  } catch (IOException e) {
    //*     e.printStackTrace();
    //*  }
    //* }
}
