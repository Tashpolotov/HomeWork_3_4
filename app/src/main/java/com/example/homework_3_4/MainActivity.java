package com.example.homework_3_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnclickListener{

    RecyclerView namesRecyclerView;
    private ArrayList<String> names;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        namesRecyclerView = findViewById(R.id.club_rv);

        names = new ArrayList<String>();

        setNames();
        namesRecyclerView.setAdapter(new NameAdapter(names, this));
    }

    private void setNames(){
        names.add("Chelsea");
        names.add("Arsenal");
        names.add("Man city");
        names.add("Totenhem");
        names.add("Real");
        names.add("Barsa");
        names.add("Inter");
        names.add("Milan");
    }

    @Override
    public void onItemClickListener(String name) {

        Intent intent = new Intent(MainActivity.this, MainActivity2.class);
        intent.putExtra("club", name);
        startActivity(intent);
    }
}