package com.thainaracarvalho.sistemasolarapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity implements
        AdapterView.OnItemClickListener {

    private ListView listViewPlanetas;
    private ArrayList<String> listaDados;
    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listViewPlanetas = findViewById(R.id.lista);
        preencherLista();
        preencherAdapter();
        listViewPlanetas.setOnItemClickListener(this);
    }


    private void preencherAdapter() {
        adapter = new ArrayAdapter(
                getApplicationContext(),
                R.layout.row, listaDados);
        listViewPlanetas.setAdapter(adapter);
    }

    private void preencherLista() {
        Resources resources = getResources();
        listaDados = new ArrayList<String>(Arrays.asList(resources.getStringArray(R.array.planetas)));
//        listaDados.add("Mercurio");
//        listaDados.add("Venus");
//        listaDados.add("Terra");
//        listaDados.add("Marte");
//        listaDados.add("Jupiter");
//        listaDados.add("Saturno");
//        listaDados.add("Urano");
//        listaDados.add("Netuno");
//        listaDados.add("Mas e Plutão?");

    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String item = (String) adapterView.getItemAtPosition(i);
        abrirTela(item);
    }

    private void abrirTela(String item){
        if(item.equals("Mercúrio")){
            Intent it = new Intent(getApplicationContext(),
                    Mercurio.class);
            startActivity(it);
        }
        if(item.equals("Vênus")){
            Intent it = new Intent(getApplicationContext(),
                    Venus.class);
            startActivity(it);
        }
        if(item.equals("Terra")){
            Intent it = new Intent(getApplicationContext(),
                    Terra.class);
            startActivity(it);
        }
        if(item.equals("Marte")){
            Intent it = new Intent(getApplicationContext(),
                    Marte.class);
            startActivity(it);
        }
        if(item.equals("Júpiter")){
            Intent it = new Intent(getApplicationContext(),
                    Jupiter.class);
            startActivity(it);
        }
        if(item.equals("Saturno")){
            Intent it = new Intent(getApplicationContext(),
                    Saturno.class);
            startActivity(it);
        }
        if(item.equals("Urano")){
            Intent it = new Intent(getApplicationContext(),
                    Urano.class);
            startActivity(it);
        }
        if(item.equals("Netuno")){
            Intent it = new Intent(getApplicationContext(),
                    Netuno.class);
            startActivity(it);
        }
        if(item.equals("Netuno")){
            Intent it = new Intent(getApplicationContext(),
                    Netuno.class);
            startActivity(it);
        }
        if(item.equals("Mas e Plutão?")){
            Intent it = new Intent(getApplicationContext(),
                    Plutao.class);
            startActivity(it);
        }
    }
}