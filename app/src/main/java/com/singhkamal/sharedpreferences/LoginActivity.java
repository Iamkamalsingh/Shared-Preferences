package com.singhkamal.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_login );
        button=findViewById( R.id.login );

        button.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences preferences=getSharedPreferences("login",MODE_PRIVATE);
                SharedPreferences.Editor editor=preferences.edit();


                editor.putBoolean("flag",true);
                editor.apply();

                Intent iHome= new Intent(LoginActivity.this,HomeActivity.class);
                startActivity( iHome );

            }
        } );
    }
}