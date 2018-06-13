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



public class BeautyFragment extends Fragment {


    public BeautyFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.attractions_list, container, false);



        final ArrayList<Attractions> words = new ArrayList<Attractions>();
        words.add(new Attractions(R.string.beacon_hill_park, R.string.beacon_info,
                R.drawable.beacon_hill_park));
        words.add(new Attractions(R.string.dallas_road, R.string.dallas_road_info,
                R.drawable.dallas_road));


        AttractionsAdapter adapter = new AttractionsAdapter(getActivity(), words, R.color.category_beauty);


        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}

