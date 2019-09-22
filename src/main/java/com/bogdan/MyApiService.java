package com.bogdan;

import com.bogdan.model.*;
import com.bogdan.model.Users.Users;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;

public final class MyApiService {

    private static MyApiService instance;

    private MyApiService() {
    }

    public static MyApiService getInstance() {
        if (instance == null) {
            instance = new MyApiService();
        }
        return instance;
    }

    public List<Posts> getPosts() throws IOException {
        String json = Okhttp.sendRequest("https://jsonplaceholder.typicode.com/posts");
        ObjectMapper mapperRead = new ObjectMapper();
        return mapperRead.readValue(json, new TypeReference<List<Posts>>(){});
    }

    public List<Comments> getComments() throws IOException {
        String json = Okhttp.sendRequest("https://jsonplaceholder.typicode.com/comments");
        ObjectMapper mapperRead = new ObjectMapper();
        return mapperRead.readValue(json, new TypeReference<List<Comments>>(){});
    }

    public List<Albums> getAlbums() throws IOException {
        String json = Okhttp.sendRequest("https://jsonplaceholder.typicode.com/albums");
        ObjectMapper mapperRead = new ObjectMapper();
        return mapperRead.readValue(json, new TypeReference<List<Albums>>(){});
    }

    public List<Photos> getPhotos() throws IOException {
        String json = Okhttp.sendRequest("https://jsonplaceholder.typicode.com/photos");
        ObjectMapper mapperRead = new ObjectMapper();
        return mapperRead.readValue(json, new TypeReference<List<Photos>>(){});
    }

    public List<Todos> getTodos() throws IOException {
        String json = Okhttp.sendRequest("https://jsonplaceholder.typicode.com/todos");
        ObjectMapper mapperRead = new ObjectMapper();
        return mapperRead.readValue(json, new TypeReference<List<Todos>>(){});
    }

    public List<Users> getUsers() throws IOException {
        String json = Okhttp.sendRequest("https://jsonplaceholder.typicode.com/users");
        ObjectMapper mapperRead = new ObjectMapper();
        return mapperRead.readValue(json, new TypeReference<List<Users>>(){});
    }
}