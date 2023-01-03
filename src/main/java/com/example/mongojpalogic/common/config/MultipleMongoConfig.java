package com.example.mongojpalogic.common.config;

import org.springframework.boot.autoconfigure.mongo.MongoProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.mongodb.MongoDatabaseFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoClientDatabaseFactory;

@Configuration
public class MultipleMongoConfig {

    @Primary
    @Bean(name = "sessionProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.session")
    public MongoProperties getSessionDbProps() {
        return new MongoProperties();
    }

    @Bean(name = "mflixProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.mflix")
    public MongoProperties getNewDb1Props() {
        return new MongoProperties();
    }

    @Bean(name = "guidesProperties")
    @ConfigurationProperties(prefix = "spring.data.mongodb.guides")
    public MongoProperties getNewDb2Props() {
        return new MongoProperties();
    }

    @Primary
    @Bean(name = "sessionMongoTemplate")
    public MongoTemplate sessionMongoTemplate() {
        return new MongoTemplate(sessionMongoDatabaseFactory(getSessionDbProps()));
    }

    @Bean(name = "mflixMongoTemplate")
    public MongoTemplate mflixMongoTemplate() {
        return new MongoTemplate(mflixMongoDatabaseFactory(getNewDb1Props()));
    }

    @Bean(name ="guidesMongoTemplate")
    public MongoTemplate guidesMongoTemplate() {
        return new MongoTemplate(guidesMongoDatabaseFactory(getNewDb2Props()));
    }

    @Primary
    @Bean
    public MongoDatabaseFactory sessionMongoDatabaseFactory(MongoProperties mongo) {
        return new SimpleMongoClientDatabaseFactory(mongo.getUri());
    }

    @Bean
    public MongoDatabaseFactory mflixMongoDatabaseFactory(MongoProperties mongo) {
        return new SimpleMongoClientDatabaseFactory(mongo.getUri());
    }

    @Bean
    public MongoDatabaseFactory guidesMongoDatabaseFactory(MongoProperties mongo) {
        return new SimpleMongoClientDatabaseFactory(mongo.getUri());
    }

}
