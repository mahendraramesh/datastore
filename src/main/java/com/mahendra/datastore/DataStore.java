package com.mahendra.datastore;

import java.io.IOException;
import java.io.InputStream;

public interface DataStore {

    /**
     *
     */
    public void saveDocument(String fileName, InputStream stream) throws IOException;

}