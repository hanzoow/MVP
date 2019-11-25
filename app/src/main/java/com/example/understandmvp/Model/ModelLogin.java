package com.example.understandmvp.Model;

public class ModelLogin {

    ModelResponse callback;

    public ModelLogin(ModelResponse response){
        this.callback = response;
    }

    public void handleLogin(String email,String password){
        if(email.equals("hoaivu@gmail.com") && password.equals("1234")){
            callback.onSuccess();
        }else{
            callback.onFailure();
        }
    }
}
