package com.example.movilparaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_menu);

        Button btnAtractivos = findViewById(R.id.btn_gestAtrac);
        Button btnAgenda = findViewById(R.id.btn_gestAgenda);

        btnAtractivos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAtractivos();
            }
        });

        btnAgenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgenda();
            }
        });
    }

    public void openAtractivos() {
        Intent intent = new Intent(this, ListAtractivos.class);
        startActivity(intent);
    }

    public void openAgenda() {

    }
}
