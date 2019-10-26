package com.example.movilparaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
