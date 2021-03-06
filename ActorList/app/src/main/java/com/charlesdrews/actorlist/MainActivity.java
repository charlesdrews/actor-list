package com.charlesdrews.actorlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.listView);

        ArrayList<Actor> actorsArrayList = new ArrayList<>();
        actorsArrayList.add(new Actor("Leonardo DiCaprio", "1974", 1));
        actorsArrayList.add(new Actor("Matt Damon", "1970", 1));
        actorsArrayList.add(new Actor("J-Law", "1990", 1));

        ActorArrayAdapter adapter = new ActorArrayAdapter(this, R.layout.custom_layout, actorsArrayList);

        listView.setAdapter(adapter);
    }
}
