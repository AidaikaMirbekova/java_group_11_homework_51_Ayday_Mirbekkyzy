package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Repository;

public interface FollowingRepository {

    public void findFollowers(){
        поиск по id своих подписчиков
        для установления на поле подписчки всех фолловеров
    }

    public void findFollowing(){
        поиск по id своих подписок
        для установления на поле подписки своих подписок
        и для пометки как булево для избежания повторного подписки
    }
}
