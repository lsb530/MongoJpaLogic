package com.example.mongojpalogic.common.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "com.example.mongojpalogic.guide",
//@EnableMongoRepositories(
//@EnableMongoRepositories(basePackageClasses =
//    com.example.mongojpalogic.guide.repository.GuideRepository.class,
    mongoTemplateRef = guideDbConfig.MONGO_TEMPLATE
)
public class guideDbConfig {
    protected static final String MONGO_TEMPLATE = "guidesMongoTemplate";
}
