package com.bogdan.model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.List;

public class Comments {

    private int postId;
    private int id;
    private String name;
    private String email;
    private String body;

    public Comments() {
    }

    public Comments(int postId, int id, String name, String email, String body) {
        this.postId = postId;
        this.id = id;
        this.name = name;
        this.email = email;
        this.body = body;
    }

    public int getPostId() {
        return postId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getBody() {
        return body;
    }

    public String prettyPrint(List<Comments> comments) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(comments);
    }
}