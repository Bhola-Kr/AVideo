package com.videocall.avideochat.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.videocall.avideochat.R;
import com.videocall.avideochat.presenter.LoginPresenter;

public class LoginActivity extends AppCompatActivity {

    private LoginPresenter mPresenter;
    private RelativeLayout mMainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        mMainLayout=findViewById(R.id.main_layout);
        mPresenter = new LoginPresenter(this, mMainLayout);

        mPresenter.login("Avinash");
    }

    public void loginSuccess(String string) {
        Toast.makeText(getApplicationContext(), ""+string, Toast.LENGTH_SHORT).show();
    }
}