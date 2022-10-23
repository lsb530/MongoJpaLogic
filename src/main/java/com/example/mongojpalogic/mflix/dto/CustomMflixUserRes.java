package com.example.mongojpalogic.mflix.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(value = {"id"})
public class CustomMflixUserRes extends MflixUserRes {
    private int age;
    private String memo;
}
