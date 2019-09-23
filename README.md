# SingletonAccessAPI
Access API with Singleton and parse json


1) Написать класс MyApiService с использованием паттерна синглтон для доступа к API:

(предварительно создать все необходимые модели List, Post, User...)



Пример:

ApiService service = ApiService.getInstance();

List<Post> posts = service.getPosts();

List<User> users = service.getUses();



Для следующих запросов:

Posts https://jsonplaceholder.typicode.com/posts

Comments https://jsonplaceholder.typicode.com/comments

Albums https://jsonplaceholder.typicode.com/albums

Photos https://jsonplaceholder.typicode.com/photos

Users https://jsonplaceholder.typicode.com/users

Todos https://jsonplaceholder.typicode.com/todos
