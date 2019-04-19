package com.mahendra.datastore.file;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Path;

import com.mahendra.datastore.DataStore;

public class FileStore implements DataStore {

    private File fileStore;
    private Path path;
    private String fileSeparator;

    public FileStore(String fileStorePath){
        getOrInitializeStorage(fileStorePath);
        this.fileSeparator = System.getProperty("file.separator", "");
    }

    private void getOrInitializeStorage(String fileStorePath) {
        if(null == fileStorePath) {
            throw new IllegalArgumentException("Invalid File Store Path Specified");
        }

        File file = new File(fileStorePath);

        if(file.exists() && file.isDirectory()) {
            this.fileStore = file;
            this.path = file.toPath();
        } else {
            throw new IllegalArgumentException("Path specified doesn't exist or is not a directory. Provide a valid one");
        }
    }

    @Override
    public void saveDocument(String fileName, InputStream stream) throws IOException {
        String newFilePath = path.toString() + this.fileSeparator + fileName;
        System.out.println(newFilePath);

    }

    public void shutdown() {

    }
}
