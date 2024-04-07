package com.singhkamal.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );


        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                SharedPreferences preferences=getSharedPreferences( "login",MODE_PRIVATE );
                preferences.getBoolean( "flag",false );
                Boolean check=preferences.getBoolean( "flag",false );
                Intent iNext;
                if (check){ //for true (User is Logged In)
                    iNext=new Intent(MainActivity.this,HomeActivity.class );

                }
                else {  // For false (Either first time or logged Out
                    iNext=new Intent(MainActivity.this,LoginActivity.class);
                }

                startActivity(iNext);
                finish();

            }
        },4000);
    }
}
