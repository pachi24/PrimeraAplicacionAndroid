package com.example.alejandro.act1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.ArrayList;

public class gridLayoutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        //Mostrar Conjunto de obejtos
        ArrayList<Clases> clases = new ArrayList<>();
        clases.add(new Clases("Samba", "09:00"));
        clases.add(new Clases("Crossfit", "11:00"));
        clases.add(new Clases("Pilates", "12:00"));
        clases.add(new Clases("Samba", "14:00"));
        clases.add(new Clases("Yoga", "15:00"));
        clases.add(new Clases("Crossfit", "20:00"));

        //recycleView Clases
        RecyclerView recyclerViewClases = findViewById(R.id.recyclerViewClases);

        //Organizacion
        RecyclerView.LayoutManager layoutManagerClases = new GridLayoutManager(this,2);
        recyclerViewClases.setLayoutManager(layoutManagerClases);

        // Conexion
        ClasesAdapter clasesAdapter = new ClasesAdapter(clases);
        recyclerViewClases.setAdapter(clasesAdapter);

    }

}
