package com.example.mongojpalogic.test.products.repository;

import com.example.mongojpalogic.test.products.document.Products;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductsRepository extends MongoRepository<Products, ObjectId> {

}
