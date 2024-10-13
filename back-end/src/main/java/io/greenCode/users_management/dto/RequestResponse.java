package io.greenCode.users_management.dto;

import java.util.List;

import io.greenCode.users_management.entity.OurUsers;
import lombok.Data;

@Data
public class RequestResponse {
    private int statusCode;
    private String error;
    private String message;
    private String token;
    private String refreshToken;
    private String expirationTime;
    private String name;
    private String city;
    private String role;
    private String email;
    private String password;
    private OurUsers ourUsers;
    private List<OurUsers> ourUsersList;
}
