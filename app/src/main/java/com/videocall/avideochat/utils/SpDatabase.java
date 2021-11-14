package com.videocall.avideochat.utils;

import static android.content.Context.MODE_PRIVATE;

import android.content.Context;
import android.content.SharedPreferences;

public class SpDatabase {

    public SharedPreferences sharedPreferences;

    public SpDatabase(Context context) {
        sharedPreferences = context.getSharedPreferences( "profile", MODE_PRIVATE );
    }

    public void putString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( key, value );
        editor.apply();
    }

    public String getString(String key) {
        return sharedPreferences.getString( key, null );
    }

    public void clearPreferences() {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.clear();
        editor.apply();
    }


    public void updateString(String key, String value) {
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString( key, value );
        editor.commit();
    }

}
