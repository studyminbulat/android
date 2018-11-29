package com.example.minne.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class FoodChoose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_choose);
    }

    public void goAct3(View view) {
        Intent intent = new Intent(this, cat.class);
        startActivity(intent);
    }
}
