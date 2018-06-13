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

public class AttractionFragment extends Fragment {


    public AttractionFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);


        final ArrayList<Attractions> words = new ArrayList<Attractions>();
        words.add(new Attractions(R.string.bc_museum, R.string.bc_museum_info,
                R.drawable.royal_bc_museum));
        words.add(new Attractions(R.string.inner_harbour, R.string.inner_harbour_info,
                R.drawable.inner_harbour));

        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), words, R.color.category_attractions);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

