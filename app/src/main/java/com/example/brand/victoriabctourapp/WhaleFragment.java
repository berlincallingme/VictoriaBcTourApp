package com.example.brand.victoriabctourapp;



import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;


public class WhaleFragment extends Fragment {


    public WhaleFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);


        // Create a list of words
        final ArrayList<Attractions> words = new ArrayList<Attractions>();
        words.add(new Attractions(R.string.bc_whale_tours, R.string.bc_whale_tours_info,
                R.drawable.bc_whale_tours));
        words.add(new Attractions(R.string.prince_of_whales, R.string.prince_of_whales_info,
                R.drawable.prince_of_whales));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), words, R.color.category_whale);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

