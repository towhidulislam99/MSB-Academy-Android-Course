package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rcv);


        ArrayList<FoodModel> arrayList = new ArrayList<>();

        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.food1 ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.food1 ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.food1 ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.food1 ));
        arrayList.add(new FoodModel("Pizza","This is ecious Food Yammee",R.drawable.pizza ));



    }
}