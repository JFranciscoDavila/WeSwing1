package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class Asistentes extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Data> dataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_asistentes);


        recyclerView = findViewById(R.id.recyclerProfessors);


        recyclerView.setLayoutManager(new LinearLayoutManager(this));


        dataList = new ArrayList<>();

        dataList.add(new Data(R.drawable.usuario, "Javier Rojas", "Dancer"));
        dataList.add(new Data(R.drawable.usuario, "Angela Mena Also", "Dancer"));
        dataList.add(new Data(R.drawable.usuario, "Jana Grulichova", "Professor"));
        dataList.add(new Data(R.drawable.usuario, "Jazmin Olave", "Dancer"));
        dataList.add(new Data(R.drawable.usuario, "Pere Guittart", "Professor"));


        adapter = new MyAdapter(dataList);

        recyclerView.setAdapter(adapter);
    }
}
