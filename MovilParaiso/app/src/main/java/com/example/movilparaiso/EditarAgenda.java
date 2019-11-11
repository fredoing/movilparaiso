package com.example.movilparaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class EditarAgenda extends AppCompatActivity {


    Bundle datos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_editar_agenda);

        //Obtener nombre atractivo
        datos = getIntent().getExtras();
        String obtenido= datos.getString("nombre_evento");

        //TextView NombreEvento = findViewById(R.id.nombreEvento);
        //NombreEvento.setText(obtenido);

        // set listener to backbutton image
        ImageView btn_back = findViewById(R.id.backbtn);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }

}