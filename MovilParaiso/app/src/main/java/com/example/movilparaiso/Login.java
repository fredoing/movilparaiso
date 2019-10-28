package com.example.movilparaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_login);

        // set listener to login button redirects to authenticate
        Button btn_login = findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                authenticate();
            }
        });

        // set listener to backbutton image
        ImageView btn_back = findViewById(R.id.backbtn);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

    public void authenticate() {
        EditText editUser = findViewById(R.id.username);
        EditText editpass = findViewById(R.id.password);
        String user = editUser.getText().toString();
        String pass = editpass.getText().toString();
        // do authentication

        openMenu(); // if authentication is successful

        // if not
        //Toast toast = Toast.makeText(this, "Usuario o contrasena incorrecto", Toast.LENGTH_SHORT);
        //toast.show();
    }

    public void openMenu() {
        Intent intent = new Intent(this, Menu.class);
        startActivity(intent);
    }
}
