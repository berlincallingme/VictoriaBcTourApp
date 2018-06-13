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

public class RestaurantFragment extends Fragment {


    public RestaurantFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);



        final ArrayList<Attractions> words = new ArrayList<Attractions>();
        words.add(new Attractions(R.string.rebar, R.string.rebar_info,
                R.drawable.rebar));
        words.add(new Attractions(R.string.noodle_box, R.string.noodle_box_info,
                R.drawable.noodle_box));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), words, R.color.category_restaurants);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

