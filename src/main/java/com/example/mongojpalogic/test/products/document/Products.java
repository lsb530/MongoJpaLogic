package com.example.mongojpalogic.test.products.document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@ToString
@Document
public class Products {
    @Id
    private ObjectId id;

    private String title;

    private String category;
}
