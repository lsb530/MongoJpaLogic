package com.example.mongojpalogic.mflix.repository;

import com.example.mongojpalogic.mflix.document.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MflixRepository extends MongoRepository<Users, ObjectId>, MflixCustomRepository {

}
