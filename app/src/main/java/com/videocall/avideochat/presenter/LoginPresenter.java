package com.videocall.avideochat.presenter;

import android.view.ViewGroup;

import com.videocall.avideochat.screens.LoginActivity;

public class LoginPresenter {

    private LoginActivity mActivity;
    private ViewGroup mMainLayout;

    public LoginPresenter(LoginActivity frag, ViewGroup mainLayout) {
        mActivity = frag;
        mMainLayout = mainLayout;
    }


    public void login(String name) {
        mActivity.loginSuccess(name);
    }
}
