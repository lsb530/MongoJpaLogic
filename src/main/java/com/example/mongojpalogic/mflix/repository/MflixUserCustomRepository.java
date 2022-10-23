package com.example.mongojpalogic.mflix.repository;

import org.springframework.data.mongodb.core.aggregation.AggregationResults;

public interface MflixUserCustomRepository {
    AggregationResults<?> findTestAggregation(int age);

//    AggregationResults<?> findMoviesGroupBy
}
