package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Comment {
    private String id;
    private UserModel user;
    private String text;
    private String date;

}
