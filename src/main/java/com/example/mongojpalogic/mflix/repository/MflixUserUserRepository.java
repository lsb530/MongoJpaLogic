package com.example.mongojpalogic.mflix.repository;

import com.example.mongojpalogic.mflix.document.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface MflixUserUserRepository extends MongoRepository<Users, ObjectId>,
    MflixUserCustomRepository {
    Optional<Users> findUsersByNameContainingIgnoreCase(String name);
}
