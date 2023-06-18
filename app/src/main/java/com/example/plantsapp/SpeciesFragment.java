package com.example.plantsapp;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class SpeciesFragment extends Fragment {

    public SpeciesFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_species, container, false);

        // Ánh xạ các thành phần UI trong giao diện fragment_species.xml
        // và thực hiện các thao tác khác tại đây

        return view;
    }
}