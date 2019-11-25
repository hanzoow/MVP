package com.example.understandmvp.Presenter;

import com.example.understandmvp.Model.ModelLogin;
import com.example.understandmvp.Model.ModelResponse;
import com.example.understandmvp.View.ViewLoginListener;

public class PresenterLogin implements ModelResponse {

    private ModelLogin modelLogin;
    private ViewLoginListener callback;

    public PresenterLogin(ViewLoginListener view){
        this.callback = view;

    }

    public void receivedHandleLogin(String email,String password){
        modelLogin = new ModelLogin(this);
        modelLogin.handleLogin(email,password);
    }

    @Override
    public void onSuccess() {
        callback.onLoginSuccess();
    }

    @Override
    public void onFailure() {
        callback.onLoginFailure();
    }
}
