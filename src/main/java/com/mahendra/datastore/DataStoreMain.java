package com.mahendra.datastore;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

import com.mahendra.datastore.file.FileStore;
import com.mahendra.datastore.s3.S3Store;

public class DataStoreMain {
    public static void main(String[] args) {
        DataStore ds = new FileStore("C:\\Mahendra\\Adobe\\Projects\\Personal\\Projects\\repo");
        try {
            ds.saveDocument("test.txt", new ByteArrayInputStream("Mahendra".getBytes(StandardCharsets.UTF_8)));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}