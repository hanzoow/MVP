package com.example.understandmvp.Model;

public class User {

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

    public User(String usermame, String password) {
        this.username = usermame;
        this.password = password;
    }
}
