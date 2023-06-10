package com.example.fragmenttofragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class Fragment_Two extends Fragment {

    TextView textView;

    public Fragment_Two() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment__two, container, false);
        textView = v.findViewById(R.id.tv1);
        textView.setText(getArguments().getString("MSG".toString()));
        return  v;
    }
}