package com.example.minne.exam1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class cat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat);
    }
    public void goAct4(View view) {
        Intent intent = new Intent(this, TimerWatch.class);
        startActivity(intent);
    }
}
