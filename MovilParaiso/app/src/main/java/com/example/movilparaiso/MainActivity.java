package com.example.movilparaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide(); //this line hides titlebar
        setContentView(R.layout.activity_main);



        Button btn_login = findViewById(R.id.btnLogin);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openLoginScreen();
            }
        });
    }

    public void openLoginScreen() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }
}
