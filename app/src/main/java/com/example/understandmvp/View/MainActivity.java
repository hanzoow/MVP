package com.example.understandmvp.View;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.understandmvp.Presenter.PresenterLogin;
import com.example.understandmvp.R;

public class MainActivity extends AppCompatActivity implements ViewLoginListener{

    TextView tvUsername,tvPassword;
    EditText edtUsername,edtPassword;
    Button btnLogin;

    //tang presenter
    PresenterLogin presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = edtUsername.getText().toString();
                String password = edtPassword.getText().toString();
                presenter.receivedHandleLogin(email,password);
            }
        });
    }

    private void init() {
        tvUsername = findViewById(R.id.tvUsername);
        tvPassword = findViewById(R.id.tvPassword);
        edtUsername = findViewById(R.id.edtUsername);
        edtPassword = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        presenter = new PresenterLogin(this);
    }

    @Override
    public void onLoginSuccess() {
        Toast.makeText(this,"Success",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onLoginFailure() {
        Toast.makeText(this,"Fail",Toast.LENGTH_SHORT).show();
    }
}
