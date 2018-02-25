package com.example.user_pc.namelistview;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.user_pc.namelistview.R.styleable.View;

public class MainActivity extends AppCompatActivity {

    ListView nameListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameListView = (ListView) findViewById(R.id.name_list_view);

        person person1 = new person("munia", "323232323");
        person person2 = new person("akter", "385697445");
        person person3 = new person("rispa", "3232325896");

        ArrayList<person> personList = new ArrayList<>();

        personList.add(person1);
        personList.add(person2);
        personList.add(person3);

        personAdapter adapter = new personAdapter(this, R.layout.list_item_layout,personList);

        nameListView.setAdapter(adapter);

        // String[] names = {"munia", "akter", "rispa"};

        // ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,names);

        //nameListView.setAdapter(adapter);



    }
}