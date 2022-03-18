package com.example.java_group_11_homework_51_ayday_mirbekkyzy.Model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
@Getter
public class Post {
    private String id;
    private String images;
    private String caption;
    private LocalDateTime date;
    private List<Comment> comment=new ArrayList<>();

    public Post(String id, String images, String caption, LocalDateTime date, List<Comment> comment) {
        this.id = id;
        this.images = images;
        this.caption = caption;
        this.date = LocalDateTime.now();
        this.comment = new ArrayList<>();
    }

    public List<Post> setComment(Comment comments) {
        comment.add(comments);
        return null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public void setComment(List<Comment> comment) {
        this.comment = comment;
    }
}
