package com.example.fragmenttest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout l1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        l1 = findViewById(R.id.l1);

        A a = new A();
        FragmentManager fn = getSupportFragmentManager();
         FragmentTransaction ft = fn.beginTransaction();
            ft.add(R.id.l1,a, "fragmentA");
            ft.commit();



    }

    public void ATest(View view) {

        A a = new A();
        FragmentManager fn = getSupportFragmentManager();
        FragmentTransaction ft = fn.beginTransaction();
        ft.add(R.id.l1,a, "fragmentA");
        ft.commit();

    }

    public void BTest(View view) {
        B b = new B();
        FragmentManager fn = getSupportFragmentManager();
        FragmentTransaction ft = fn.beginTransaction();
        ft.replace(R.id.l1,b, "fragmentB");
        ft.commit();

    }
}