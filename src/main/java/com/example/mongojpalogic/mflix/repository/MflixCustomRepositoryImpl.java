package com.example.mongojpalogic.mflix.repository;

import org.springframework.context.annotation.Lazy;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.AddFieldsOperation;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.ProjectionOperation;

public class MflixCustomRepositoryImpl implements MflixCustomRepository {

    private final MongoTemplate mongoTemplate;

    @Lazy
    public MflixCustomRepositoryImpl(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public AggregationResults<?> findTestAggregation(int age) {

//        Criteria criteria = Criteria.where("email").regex("^jason");
//        MatchOperation matchStage = Aggregation.match(criteria);

        AddFieldsOperation addFieldStage = Aggregation.addFields()
                .addField("age").withValue(age).build();

        ProjectionOperation projectStage = Aggregation.project()
                .andExpression("$name").as("email");

//                .and("name").as("이메일")
//                .and("email").as("E-mail")
//                .and("password").as("pwd");

        Aggregation aggregation = Aggregation.newAggregation(
//                matchStage,
//                projectStage,
                addFieldStage
        );

//        var aggResult = mongoTemplate.aggregate(aggregation, "payee", Object.class);
        var aggResult = mongoTemplate.aggregate(aggregation, "users", Object.class);
        return aggResult;
    }
}
