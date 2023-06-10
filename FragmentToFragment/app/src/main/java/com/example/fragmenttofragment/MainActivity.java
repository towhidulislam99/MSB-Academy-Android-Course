package com.example.fragmenttofragment;

import static com.example.fragmenttofragment.R.*;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements Fragment_One.sendcustomlisener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_main);
    }
    public void changeFragment(View view) {
        Fragment fragment = null;

        int v = view.getId();
        if(v==R.id.btn1)
        {
            fragment = new Fragment_One();
        }
        else if (v==R.id.btn2 ) {
            fragment = new Fragment_Two();
        }



      FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(id.l2,fragment);
        ft.commit();



    }

    @Override
    public void SendMessage(String text) {

        Bundle bundle = new Bundle();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        Fragment_Two fragment_two = new Fragment_Two();
        bundle.putString("MSG",text);
        fragment_two.setArguments(bundle);
        ft.replace(id.l2,fragment_two);
        ft.commit();




    }
}