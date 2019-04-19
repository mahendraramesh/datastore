package com.mahendra.datastore.s3;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import com.amazonaws.auth.AWSCredentials;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.auth.DefaultAWSCredentialsProviderChain;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.mahendra.datastore.DataStore;

public class S3Store implements DataStore {
    private AmazonS3 s3Client;
    private String bucketName;

    public S3Store() {
    }

    public S3Store(String accessKey, String secretKey, String regionName, String bucketName) {
        this.bucketName = bucketName;

        initializeS3Client(accessKey, secretKey, regionName);
    }

    private void initializeS3Client(String regionName) {
        this.s3Client = AmazonS3ClientBuilder.standard()
                .withRegion(regionName)
                .withCredentials(new DefaultAWSCredentialsProviderChain()).build();
    }

    private void initializeS3Client(String accessKey, String secretKey, String regionName) {

        AWSCredentials credentials = new BasicAWSCredentials(accessKey, secretKey);

        AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
                .withRegion(regionName)
                .withCredentials(new AWSStaticCredentialsProvider(credentials)).build();
    }

    public S3Store(String regionName, String bucketName) {

    }

    @Override
    public void saveDocument(String fileName, InputStream stream) throws IOException {
        //this.s3Client.putObject(this.bucketName, fileName, );
    }
}
