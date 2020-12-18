package com.example.provaexame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private RecyclerView lRecyclerView;
    private  RecyclerView.Adapter lAdapter;
    private RecyclerView.LayoutManager lLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lRecyclerView = findViewById(R.id.id_recyclerView);
    }
}