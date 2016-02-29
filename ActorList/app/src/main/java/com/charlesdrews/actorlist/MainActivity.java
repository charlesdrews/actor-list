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

        ArrayList<Actor> actors = new ArrayList<>();
        actors.add(new Actor("Leonardo DiCaprio", "whenever", 1));
        actors.add(new Actor("Matt Damon", "sometime", 1));
        actors.add(new Actor("J-Law", "more recent", 1));

        ActorArrayAdapter adapter = new ActorArrayAdapter(this, R.layout.custom_layout, actors);

        listView.setAdapter(adapter);
    }
}
