package com.example.activitytofragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et;
    String input;
    Bundle bundle;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et = findViewById(R.id.et1);
        bundle = new Bundle();

    }
    public void SendMsg(View view) {
       input = et.getText().toString();

        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        FragmentOne fragmentOne = new FragmentOne();
        bundle.putString("MSG", input);
        fragmentOne.setArguments(bundle);
        ft.add(R.id.l1,fragmentOne);
        ft.commit();



    }
}

