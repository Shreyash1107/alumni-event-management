package com.alumniEvent.management.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class RegisterDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String contact;
    private String password;
    private String confirmPassword;
    private int roleId;
}
