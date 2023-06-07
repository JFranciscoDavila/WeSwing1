package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Calendario extends AppCompatActivity {
    private RecyclerView recyclerView;
    private MyAdapter3 adapter;
    private List<Data3> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendario);

        TextView botonFiltros = findViewById(R.id.filtres);
        botonFiltros.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Calendario.this, Filtros.class);
                startActivity(intent);
            }
        });

        recyclerView = findViewById(R.id.recyclerMogudes);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        dataList = new ArrayList<>();
        dataList.add(new Data3(R.drawable.usuario, "17 de abril de 2017", "I'm beggining to see the light","Organitzat per Big Mama","17/04/2017-17/04/2017 | 2horas","Madrid, Spain"));
        dataList.add(new Data3(R.drawable.usuario, "18 de abril de 2017", "Big Martes","Organitzat per Big Mama","18/04/2017-18/04/2017 | 2horas","Madrid, Spain"));
        dataList.add(new Data3(R.drawable.usuario, "19 de abril de 2017", "I'm beggining to see the light","Organitzat per Big Mama","19/04/2017-19/04/2017 | 2horas","Madrid, Spain"));

        adapter = new MyAdapter3(dataList);

        recyclerView.setAdapter(adapter);
    }
}