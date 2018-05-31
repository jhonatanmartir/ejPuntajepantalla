package com.dev.jhonyrg.ejpuntaje_pantalla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import myclass.User;
import myclass.ViewAdapter;

public class MainActivity extends AppCompatActivity {
    private List<User> usuarios;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adatador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.FillList();
        this.recyclerView = findViewById(R.id.rviewUsers);
        this.adatador = new ViewAdapter(this.usuarios, R.layout.item_view);
        this.recyclerView.setAdapter(this.adatador);
        this.recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void FillList()
    {
        //Agregar usuarios que se mostraran en el RecyclerView
        this.usuarios = new ArrayList<>();
        this.usuarios.add(new User("Janet Perkins", "1000 Pts", "F1", R.drawable.imagenes27));
        this.usuarios.add(new User("Mary Johnson", "800 Pts", "Nascar", R.drawable.imagenes28));
        this.usuarios.add(new User("Abbey Christensen", "300 Pts", "Racing", R.drawable.imagenes29));
        this.usuarios.add(new User("Janet Perkins", "1000 Pts", "F1", R.drawable.imagenes27));
        this.usuarios.add(new User("Mary Johnson", "800 Pts", "Nascar", R.drawable.imagenes28));
        this.usuarios.add(new User("Abbey Christensen", "300 Pts", "Racing", R.drawable.imagenes29));
        this.usuarios.add(new User("Janet Perkins", "1000 Pts", "F1", R.drawable.imagenes27));
        this.usuarios.add(new User("Mary Johnson", "800 Pts", "Nascar", R.drawable.imagenes28));
        this.usuarios.add(new User("Abbey Christensen", "300 Pts", "Racing", R.drawable.imagenes29));
    }
}
