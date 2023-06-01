package com.muflihundev.tspppb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        List<Wisata> wisataList = new ArrayList<>();
        // Isi data wisataList dengan data wisata yang Anda miliki

        WisataAdapter adapter = new WisataAdapter(wisataList);
        recyclerView.setAdapter(adapter);

    }
}