package com.videocall.avideochat.presenter;

import android.view.ViewGroup;

import com.videocall.avideochat.screens.LoginActivity;
import com.videocall.avideochat.screens.RegisterActivity;

public class RegisterPresenter {

    private RegisterActivity mActivity;
    private ViewGroup mMainLayout;

    public RegisterPresenter(RegisterActivity mActivity, ViewGroup mMainLayout) {
        this.mActivity = mActivity;
        this.mMainLayout = mMainLayout;
    }


}
