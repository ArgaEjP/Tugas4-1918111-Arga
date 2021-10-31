package com.example.tugasp4_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private barangAdapter adapter;
    private ArrayList<barang> barangArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();
        recyclerView =(RecyclerView)findViewById(R.id.recycleview);
        adapter = new barangAdapter(barangArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private void addData() {
        barangArrayList = new ArrayList<>();
        barangArrayList.add(new barang("Vespa Malang", "18-10-2021", "Hi, Terima kasih sudah menjadi pembeli",R.drawable.vespa));
        barangArrayList.add(new barang("DRP", "30-10-2021", "Hi, Terima kasih sudah menjadi pembeli",R.drawable.drp));
        barangArrayList.add(new barang("D&F", "31-10-2021", "Hi, Terima kasih sudah menjadi pembeli",R.drawable.dnf));
    }
}
