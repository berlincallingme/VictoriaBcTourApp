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

    /** Resource ID for the background color for this list of words To DO still*/
    private int mColorResourceId;

    public AttractionsAdapter(Context context, ArrayList<Attractions> words, int colorResourceId) {
        super(context, 0, words);
        mColorResourceId = colorResourceId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        Attractions currentAttraction= getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView attractionNameTextView = (TextView) listItemView.findViewById(R.id.list_attraction_name);
        // Get the Miwok translation from the currentWord object and set this text on
        // the Miwok TextView.
        attractionNameTextView.setText(currentAttraction.getAttractionName());

        // Find the TextView in the list_item.xml layout with the ID default_text_view.
        TextView attractionInfoTextView = (TextView) listItemView.findViewById(R.id.list_attraction_info);
        // Get the default translation from the currentWord object and set this text on
        // the default TextView.
        attractionInfoTextView.setText(currentAttraction.getAttractionInfo());

        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.list_picture);

            imageView.setImageResource(currentAttraction.getImageResourceId());

        // Set the theme color for the list item
        View listContainer = listItemView.findViewById(R.id.list_container);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        listContainer.setBackgroundColor(color);

        // Return the whole list item layout (containing 2 TextViews) so that it can be shown in
        // the ListView.
        return listItemView;
    }
}
