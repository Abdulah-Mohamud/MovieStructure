//package com.MovieStructure;
//
//import org.springframework.context.annotation.Configuration;
//import com.amazonaws.services.secretsmanager.AWSSecretsManager;
//import com.amazonaws.services.secretsmanager.AWSSecretsManagerClientBuilder;
//import com.amazonaws.services.secretsmanager.model.GetSecretValueRequest;
//import com.amazonaws.services.secretsmanager.model.GetSecretValueResult;
//import com.google.gson.Gson;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.jdbc.DataSourceBuilder;
//import org.springframework.context.annotation.Bean;
//import com.amazonaws.auth.AWSStaticCredentialsProvider;
//import com.amazonaws.auth.BasicAWSCredentials;
//import javax.sql.DataSource;
//
//@Configuration
//public class AppConfig {
//    @Value("${cloud.aws.credentials.access-key}")
//    private String accessKey;
//    @Value("${cloud.aws.credentials.secret-key}")
//    private String secretKey;
//
//        private Gson gson = new Gson();
//
//        @Bean
//        public DataSource dataSource() {
//            AwsSecrets secrets = getSecret();
//            return DataSourceBuilder
//                    .create()
//                    .driverClassName("com.mysql.cj.jdbc.Driver")
//                    //.url("jdbc:mysql://127.0.0.1:3306/sakila?useSSL=false&serverTimezone=UTC")
//                    .url("jdbc:" + secrets.getEngine() + "://" + secrets.getHost() + ":" + secrets.getPort() + "/sakila")
//                    .username(secrets.getUsername())
//                    .password(secrets.getPassword())
//                    .build();
//        }
//
//        private AwsSecrets getSecret() {
//
//            String secretName = "arn:aws:secretsmanager:us-east-2:589732147131:secret:MovieSecret2-qc1FPN";
//            String region = "us-east-2";
//
//
//            AWSSecretsManager client  = AWSSecretsManagerClientBuilder.standard()
//                    .withRegion(region)
//                    .build();
//
//            String secret, decodedBinarySecret;
//            GetSecretValueRequest getSecretValueRequest = new GetSecretValueRequest()
//                    .withSecretId(secretName);
//            GetSecretValueResult getSecretValueResult = null;
//
//            try {
//                getSecretValueResult = client.getSecretValue(getSecretValueRequest);
//            } catch (Exception e) {
//                throw e;
//            }
//
//            if (getSecretValueResult.getSecretString() != null) {
//                secret = getSecretValueResult.getSecretString();
//                return gson.fromJson(secret, AwsSecrets.class);
//            }
//
//            return null;
//        }
//    }
//
//
