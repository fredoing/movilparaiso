package com.example.movilparaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ArrayAdapter;import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListAtractivos extends AppCompatActivity {


    ListView listView;
    Bundle datos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_list_atractivos);




        listView = (ListView)findViewById(R.id.simpleListViewAtractivos);
        final ArrayList <String> listaAtractivos = new ArrayList<>();
        listaAtractivos.add("Mirador Orosi");
        listaAtractivos.add("Mirador Ujarras");
        listaAtractivos.add("Jardín Lankaster");
        listaAtractivos.add("Restaurante");
        listaAtractivos.add("Río");
        listaAtractivos.add("Aguas termales");
        listaAtractivos.add("Tienda");
        listaAtractivos.add("Puesto");
        listaAtractivos.add("Restaurante");
        listaAtractivos.add("Aguas termales");
        listaAtractivos.add("Catarata");


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaAtractivos);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView <?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ListAtractivos.this , EditarAtractivo.class);
                intent.putExtra("nombre_atractivo",listaAtractivos.get(i).toString() );
                startActivity(intent);
                Toast.makeText(ListAtractivos.this, "click" +i+ " "+listaAtractivos.get(i).toString(),Toast.LENGTH_SHORT).show();

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

        // Agregar atractivo

        Button btnAgregarAtractivo = findViewById(R.id.Agregarbutton);

        btnAgregarAtractivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgregar();
            }
        });
    }

    public void openAgregar(){
        Intent intent = new Intent(this, AgregarAtractivo.class);
        startActivity(intent);
    }

}
