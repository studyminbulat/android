package com.example.minne.grumpycat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initRecyclerView();
    }

    private void initRecyclerView() {
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        RecyclerView.Adapter adapter = new GrumpyCatAdapter(generateCats());
        recyclerView.setAdapter(adapter);
    }

    private static List<GrumpyCat> generateCats() {
        List<GrumpyCat> grumpyCats = new ArrayList<>();
        grumpyCats.add(new GrumpyCat("Grumpy_cat_1", "https://i.imgur.com/1mV14xZ.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_2", "https://i.imgur.com/QXPRUD2.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_3", "https://i.imgur.com/Gvy36sZ.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_4", "https://i.imgur.com/7D3gkYo.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_5", "https://i.imgur.com/5z0CRK8.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_6", "https://i.imgur.com/QCoL78q.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_7", "https://i.imgur.com/1mV14xZ.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_8", "https://i.imgur.com/QXPRUD2.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_9", "https://i.imgur.com/Gvy36sZ.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_10", "https://i.imgur.com/7D3gkYo.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_11", "https://i.imgur.com/5z0CRK8.jpg"));
        grumpyCats.add(new GrumpyCat("Grumpy_cat_12", "https://i.imgur.com/QCoL78q.jpg"));
        return grumpyCats;
    }

}
