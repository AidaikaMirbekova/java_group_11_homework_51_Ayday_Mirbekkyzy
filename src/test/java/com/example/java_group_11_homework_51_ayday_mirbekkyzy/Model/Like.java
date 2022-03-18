package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.Date;

@Data
@RequiredArgsConstructor
public class Like {
    private String id;
    private Post post;
    private UserModel user;
    private Date date;
}
