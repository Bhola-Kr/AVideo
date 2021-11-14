package com.videocall.avideochat.screens;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.videocall.avideochat.R;

public class SplashActivity extends AppCompatActivity {

    private static int SPLASH_TIME_OUT = 1000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                //AppSignatureHelper appSignatureHelper=new AppSignatureHelper(SplashActivity.this);
//
//                if(token!=null && token.length()>0){
//                    Utility.setAuthToken(token);
//                    startActivity(new Intent(getApplicationContext(), AwsHomeActivity.class));
//                    finish();
//                }
//                else {
//                    Intent i = new Intent(SplashActivity.this, LoginActivity.class);
//                    startActivity(i);
//                    finish();
//                }


                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);
                finish();

            }
        }, SPLASH_TIME_OUT);

    }
}