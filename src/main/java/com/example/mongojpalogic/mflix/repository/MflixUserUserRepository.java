package com.example.mongojpalogic.mflix.repository;

import com.example.mongojpalogic.mflix.document.Users;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;
import org.springframework.stereotype.Repository;

@Repository
public interface MflixUserUserRepository extends MongoRepository<Users, ObjectId>,
    MflixUserCustomRepository {
    Optional<Users> findUsersByNameContainingIgnoreCase(String name);
}
