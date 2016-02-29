package com.charlesdrews.actorlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by charlie on 2/29/16.
 */
public class ActorArrayAdapter extends ArrayAdapter<Actor> {
    private List<Actor> mData;
    private Context mContext;
    private int mLayout;

    public ActorArrayAdapter(Context context, int resource, List<Actor> objects) {
        super(context, resource, objects);
        mData = objects;
        mContext = context;
        mLayout = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(mLayout, parent, false);
        }
        Actor actor = mData.get(position);

        ((TextView) convertView.findViewById(R.id.nameText)).setText("Name: " + actor.getName());
        ((TextView) convertView.findViewById(R.id.dobText)).setText("DOB: " + actor.getName());
        ((TextView) convertView.findViewById(R.id.oscarText)).setText("Oscars won: " + actor.getName());

        return convertView;
    }
}
