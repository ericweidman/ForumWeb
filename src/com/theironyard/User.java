package com.theironyard;

/**
 * Created by zach on 2/24/16.
 */
public class User {
    int id;
    String name;
    String password;

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public User(String password, String name) {
        this.password = password;
        this.name = name;
    }
}
