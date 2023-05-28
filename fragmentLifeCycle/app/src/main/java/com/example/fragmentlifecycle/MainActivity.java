package com.example.fragmentlifecycle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fn = getSupportFragmentManager();
        FragmentTransaction ft= fn.beginTransaction();
        ft.add(R.id.TextV,new FragmentFragOne(),"Fragone");
        ft.commit();


    }
}