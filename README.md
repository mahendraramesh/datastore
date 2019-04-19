# Library for an Abstract Document/Data Store

### Implementations
* S3
* File

### Usage

File Store

```java
String fileStorePath = "";
DataStore ds = new FileStore(fileStorePath);

// perform various operations using ds
ds.saveDocument();
```

S3 Store

```java
DataStore ds = new S3Store("accessKey", "secretKey", "regionName", "bucketName");

or

// if access key and secret key are not specified, default credentials provider is used.
// https://docs.aws.amazon.com/AWSJavaSDK/latest/javadoc/index.html?com/amazonaws/auth/DefaultAWSCredentialsProviderChain.html

DataStore ds = new S3Store("", "", "regionName", "bucketName");

```
