package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private List<List_Element> list_elements;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();
    }

    //Método para listar los elementos con el list_element
    public void init(){
        //Se crea la variable del tipo ArrayList y se agregan los elementos
        list_elements = new ArrayList<>();
        list_elements.add(new List_Element("#775447", "Pedro", "México", "Activo"));
        list_elements.add(new List_Element("#607d8b", "Julio", "Venezuela", "Apagado"));
        list_elements.add(new List_Element("#C7462A", "Pablo", "USA", "Inactivo"));
        list_elements.add(new List_Element("#936849", "Chepe", "México", "Expirado"));


        ListAdapter listAdapter = new ListAdapter(list_elements,this);
        RecyclerView view = findViewById(R.id.recycler);
        view.setHasFixedSize(true);
        view.setLayoutManager(new LinearLayoutManager(this));
        view.setAdapter(listAdapter);

    }
}