package com.example.weswing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Filtros extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filtros);

        TextView botonCole = findViewById(R.id.buttonAplicarFiltres);
        botonCole.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Filtros.this, Escuela.class);
                startActivity(intent);
            }
        });
    }
}