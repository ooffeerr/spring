package com.example;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories
public class MongoConfiguration extends AbstractMongoConfiguration {

    @Override
    protected String getDatabaseName() {
        System.out.println("getDatabaseName");
        return "dataBaseName";
    }

    @Override
    public Mongo mongo() throws Exception {
        System.out.println("mongo");
        return new MongoClient("127.0.0.1", 27017);
    }

    @Override
    protected String getMappingBasePackage() {
        System.out.println("getMapping");
        return "foo.bar.domain";
    }
}