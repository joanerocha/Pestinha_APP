package com.example.aluno.pestinha_app;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.aluno.pestinha_app.model.Propriedade;

import java.util.ArrayList;
import java.util.List;

public class PropriedadesActivity extends AppCompatActivity{


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_propriedades);

        int[] inf={1,2,3,5,7,8};
        int[] tra={1,2,3};

        List<Propriedade> lista = new ArrayList<Propriedade>();
        Propriedade p1 = new Propriedade("Cacau",25,inf,tra);       lista.add(p1);
        Propriedade p2 = new Propriedade("Algodão",64,inf,tra);    lista.add(p2);
        Propriedade p3 = new Propriedade("Carnauba",100,inf,tra);        lista.add(p3);
        Propriedade p4 = new Propriedade("Cajueiro",400,inf,tra);  lista.add(p4);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_propriedade);

        recyclerView.setAdapter(new PropriedadeAdapter(lista, this));

        RecyclerView.LayoutManager layout = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(layout);
    }
}
