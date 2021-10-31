package com.msotor.listview02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Usuario[] usuarios;
    ArrayAdapter<Usuario> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);

        Usuario pepito = new Usuario("pepito","user", true);
        Usuario carlo = new Usuario("carlo","user", true);
        Usuario roberto = new Usuario("roberto","user", false);

        usuarios = new Usuario[]{pepito,carlo,roberto};
        arrayAdapter = new ArrayAdapter<Usuario>(this, android.R.layout.simple_list_item_1, usuarios);
        listView.setAdapter(arrayAdapter);

    }


}