package com.example.user_pc.namelistview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by USER-pC on 01/09/17.
 */

public class personAdapter extends ArrayAdapter<person> {

    public personAdapter(Context context, int resource, ArrayList<person> personList) {
        super(context, 0, personList);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;

        if (listItemView == null){
          listItemView =  LayoutInflater.from(getContext()).inflate(R.layout.list_item_layout,parent, false);
        }

        person currentperson = getItem(position);

        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name_list_view);
        TextView cellTextView = (TextView) listItemView.findViewById(R.id.cell_text_view);

        nameTextView.setText(currentperson.getmName());
        cellTextView.setText(currentperson.getmCell());

        return listItemView;
    }
}
