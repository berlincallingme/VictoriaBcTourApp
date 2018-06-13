package com.example.brand.victoriabctourapp;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class AttractionsAdapter extends ArrayAdapter<Attractions>{

    private int mColorResourceId;

    public AttractionsAdapter(Context context, ArrayList<Attractions> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Attractions currentAttraction= getItem(position);

        TextView attractionNameTextView = (TextView) listItemView.findViewById(R.id.list_attraction_name);

        attractionNameTextView.setText(currentAttraction.getAttractionName());

        TextView attractionInfoTextView = (TextView) listItemView.findViewById(R.id.list_attraction_info);

        attractionInfoTextView.setText(currentAttraction.getAttractionInfo());


        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_picture);

            imageView.setImageResource(currentAttraction.getImageResourceId());


        View listContainer = listItemView.findViewById(R.id.list_container);

        int color = ContextCompat.getColor(getContext(), mColorResourceId);

        listContainer.setBackgroundColor(color);

        return listItemView;
    }
}
