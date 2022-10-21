package com.example.mongojpalogic.mflix.repository;

import org.springframework.data.mongodb.core.aggregation.AggregationResults;

public interface MflixCustomRepository {
    AggregationResults<?> findTestAggregation(int age);
}
