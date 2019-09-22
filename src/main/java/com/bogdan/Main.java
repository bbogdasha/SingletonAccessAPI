package com.bogdan;

import com.bogdan.model.*;
import com.bogdan.model.Users.Users;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {

        MyApiService service = MyApiService.getInstance();

        Posts posts = new Posts();
        List<Posts> listPosts = service.getPosts();
        System.out.println(posts.prettyPrint(listPosts));

        TimeUnit.SECONDS.sleep(5);
        Comments comments = new Comments();
        List<Comments> listComments = service.getComments();
        System.out.println(comments.prettyPrint(listComments));

        TimeUnit.SECONDS.sleep(5);
        Albums albums = new Albums();
        List<Albums> listAlbums = service.getAlbums();
        System.out.println(albums.prettyPrint(listAlbums));

        TimeUnit.SECONDS.sleep(5);
        Photos photos = new Photos();
        List<Photos> listPhotos = service.getPhotos();
        System.out.println(photos.prettyPrint(listPhotos));

        TimeUnit.SECONDS.sleep(5);
        Todos todos = new Todos();
        List<Todos> listTodos = service.getTodos();
        System.out.println(todos.prettyPrint(listTodos));

        TimeUnit.SECONDS.sleep(5);
        Users users = new Users();
        List<Users> listUsers = service.getUsers();
        System.out.println(users.prettyPrint(listUsers));
    }
}
