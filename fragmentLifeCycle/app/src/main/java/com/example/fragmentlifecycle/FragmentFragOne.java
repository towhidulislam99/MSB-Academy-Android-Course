package com.example.fragmentlifecycle;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link FragmentFragOne#newInstance} factory method to
 * create an instance of this fragment.
 */
public class FragmentFragOne extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public FragmentFragOne() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment FragmentFragOne.
     */
    // TODO: Rename and change types and number of parameters
    public static FragmentFragOne newInstance(String param1, String param2) {
        FragmentFragOne fragment = new FragmentFragOne();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_frag_one, container, false);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.e("Fragment Life Cycle","OnAttach Method");
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.e("Fragment Life Cycle"," onActivityCreated Method");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.e("Fragment Life Cycle"," onStart Method");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.e("Fragment Life Cycle"," onPause Method");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.e("Fragment Life Cycle"," onStop Method");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.e("Fragment Life Cycle"," onResume Method");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.e("Fragment Life Cycle"," onDestroy Method");
    }
}