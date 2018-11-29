package com.example.minne.arraylistapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    String [] juncFood = {"Гамбургер", "Пицца", "Картошка Фри", "Чизбургер", "Твистер", "Пепси"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.foodList);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.preference_category, juncFood);

        listView.setAdapter(adapter );
    }
}
