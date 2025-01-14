package com.example.mongojpalogic.mflix.repository;

import com.example.mongojpalogic.mflix.document.Movies;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MflixMovieRepository extends MongoRepository<Movies, ObjectId> {

}
