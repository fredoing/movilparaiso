package com.example.movilparaiso;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class Agenda extends AppCompatActivity {

    ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_list_agenda);

        listView = (ListView)findViewById(R.id.listViewAgenda);
        final ArrayList<String> listaAgenda = new ArrayList<>();
        listaAgenda.add("Curso maquillaje");
        listaAgenda.add("Desfile");
        listaAgenda.add("Bingo");
        listaAgenda.add("Concierto");
        listaAgenda.add("Obra de teatro");
        listaAgenda.add("Curso de cocina");
        listaAgenda.add("Baile");
        listaAgenda.add("Concierto");
        listaAgenda.add("Curso de tejido");
        listaAgenda.add("Desfile");
    

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, listaAgenda);
        listView.setAdapter(arrayAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView <?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(Agenda.this , EditarAtractivo.class);
                intent.putExtra("nombre_evento",listaAgenda.get(i).toString() );
                startActivity(intent);
                Toast.makeText(Agenda.this, "click" +i+ " "+listaAgenda.get(i).toString(),Toast.LENGTH_SHORT).show();

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

        // Agregar evento

        Button btnAgregarAtractivo = findViewById(R.id.Agregarbutton);

        btnAgregarAtractivo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openAgregar();
            }
        });
    }
    public void openAgregar(){
        Intent intent = new Intent(this, AgregarEvento.class);
        startActivity(intent);
    }
}
