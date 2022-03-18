package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Following {
    private String id;
    private UserModel follower;
    private UserModel followingTo;
    private String date;

}
