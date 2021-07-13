package com.example.stagepeoplin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView clients_recyclerView;
    List<Integer> recyclerViewList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addDemoData();
        clients_recyclerView = (RecyclerView) findViewById(R.id.clients_recyclerView);
        ClientsAdapter adapter = new ClientsAdapter(recyclerViewList);
        clients_recyclerView.setAdapter(adapter);
        clients_recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void addDemoData() {
        recyclerViewList = new ArrayList<Integer>();
        for (int i = 0; i < 10 ; i ++){
            recyclerViewList.add(i);
        }
    }
}