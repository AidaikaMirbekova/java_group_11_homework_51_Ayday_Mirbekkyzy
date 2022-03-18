package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Service;

import com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model.Post;
import com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model.UserModel;
import com.example.java_group_11_homework_51_ayday_mirbekkyzy.Repository.PostsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class PostService {

    private final PostsRepository postRepository;


    public List<Post> findByAllPost(UserModel users) {
        return this.postRepository.findByAllPost(users);
    }

    public List<Post> findPost(UserModel subscribe) {
        return this.postRepository.findPostByFollow(follow);
    }

    public Post addPost(Post post){
        return this.postRepository.save(post);
    }

    public void deletePost(Post post) {
       postRepository.delete(post);

    }
}
