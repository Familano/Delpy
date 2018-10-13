package com.example.maming.delpy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class ActSplashScreen extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_splashscreen);
        final int SPLASH_DISPLAY_LENGTH = 2000;
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(ActSplashScreen.this, ActLoginPasien.class);
                ActSplashScreen.this.startActivity(mainIntent);
                ActSplashScreen.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
