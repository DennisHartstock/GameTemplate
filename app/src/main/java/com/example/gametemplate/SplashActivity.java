package com.example.gametemplate;

import android.content.Intent;
import android.os.Bundle;

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash);
        startActivity(new Intent(SplashActivity.this, MenuActivity.class));
        SplashActivity.this.finish();
    }


}