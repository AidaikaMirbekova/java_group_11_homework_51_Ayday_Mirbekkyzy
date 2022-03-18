package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Service;
import com.example.java_group_11_homework_51_ayday_mirbekkyzy.Repository.LikesRepository;

public class LikeService {

    private final LikesRepository likeRepository;

    public LikeService(LikesRepository likeRepository) {
        this.likeRepository = likeRepository;
    }

    public Boolean setLike(String userId, String postId) {
        return this.likeRepository.existsByLike(userId,postId);
//        данные из репозитория могли бы показать в данном случае был ли отлайкан данный пост , метод для избежания повторного лайка
    }
}
