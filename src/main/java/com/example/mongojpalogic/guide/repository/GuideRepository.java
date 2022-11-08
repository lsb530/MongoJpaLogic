package com.example.mongojpalogic.guide.repository;

import com.example.mongojpalogic.guide.document.Planet;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuideRepository extends MongoRepository<Planet, ObjectId> {

}
