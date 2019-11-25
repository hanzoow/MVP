package com.example.understandmvp.Model;

public class Entity {

    String username;
    String password;

    public String getUsermame() {
        return username;
    }

    public void setUsermame(String usermame) {
        this.username = usermame;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Entity(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
