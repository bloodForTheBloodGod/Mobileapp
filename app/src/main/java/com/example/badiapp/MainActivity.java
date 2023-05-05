package com.example.badiapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.badiapp.dal.BadiDao;
import com.example.badiapp.model.Badi;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle(" Übersicht");
        addBadisToClickableList();
    }

    @Override
    protected void onStart() {
        super.onStart();
        start();
    }

    private void start() {
        setContentView(R.layout.activity_main);
        setTitle("Übersicht");
        addBadisToClickableList();
    }

    private void addBadisToClickableList() {
        ListView badis =  findViewById(R.id.badiliste);
        ArrayAdapter<Badi> badiAdapter =
                new ArrayAdapter<>(getApplicationContext(), android.R.layout.simple_list_item_1);
        badiAdapter.addAll(BadiDao.getAll());
        badis.setAdapter(badiAdapter);
        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener()
        {
            public void onItemClick(AdapterView parent, View v, int position, long id)
            {
                Intent intent = new Intent(getApplicationContext(), BadiDetailsActivity.class);
                Badi selected = (Badi)parent.getItemAtPosition(position);

                intent.putExtra("badiId", selected.getId());
                intent.putExtra("badiName", selected.getName());
                startActivity(intent);
            }
        };

        badis.setOnItemClickListener(onItemClickListener);


    }



}