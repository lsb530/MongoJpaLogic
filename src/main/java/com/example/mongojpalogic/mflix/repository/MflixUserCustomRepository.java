package com.example.mongojpalogic.mflix.repository;

import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.stereotype.Repository;

@Repository
public interface MflixUserCustomRepository {
    AggregationResults<?> findTestAggregation(int age);

//    AggregationResults<?> findMoviesGroupBy
}
