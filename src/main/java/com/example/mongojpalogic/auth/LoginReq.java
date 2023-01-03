package com.example.mongojpalogic.auth;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonSerialize
public class LoginReq {
    private String id;

    private String password;
}
