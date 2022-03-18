package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Repository;

import com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model.UserModel;

import java.util.List;
import java.util.Optional;

public interface UsersRepository {

   public  List<UserModel> findByNameAndEmail (String name, String email){
//    поиск юзера по имени и почте для поисковой строки
    }
    public Optional<UserModel> findByLogin(String login){
// поиск по логину для авторизации,удалении,и проверки
    }





}
