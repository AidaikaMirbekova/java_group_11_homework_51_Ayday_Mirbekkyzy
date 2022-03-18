package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@Data
@RequiredArgsConstructor
public class UserModel{
    private String id;
    private String email;
    private String password;
    private Map<String,Post> post;
    private Map<String,Following> followers;
    private Map<String,Following> following;

}
