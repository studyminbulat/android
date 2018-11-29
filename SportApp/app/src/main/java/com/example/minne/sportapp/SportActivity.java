package com.example.minne.sportapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SportActivity extends AppCompatActivity {
    public static final String EXTRA_SPORT = "sportId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sport);

        int sportId = (Integer) getIntent().getExtras().get(EXTRA_SPORT);
        Sport sport = Sport.sports[sportId];

        ImageView imageView = findViewById(R.id.image);
        imageView.setImageResource(sport.getImageResourseId());
        imageView.setContentDescription(sport.getName());

        TextView textView = findViewById(R.id.name);
        textView.setText(sport.getName());

        TextView textView1 = findViewById(R.id.description);
        textView1.setText(sport.getDescription());

    }
}
