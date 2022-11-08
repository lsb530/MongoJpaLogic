package com.example.mongojpalogic.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.mongojpalogic.mflix",
//@EnableMongoRepositories(
//@EnableMongoRepositories(basePackageClasses = com.example.mongojpalogic.mflix.repository.MflixUserUserRepository.class,
    mongoTemplateRef = mflixDbConfig.MONGO_TEMPLATE
)
public class mflixDbConfig {
    protected static final String MONGO_TEMPLATE = "mflixMongoTemplate";
}
