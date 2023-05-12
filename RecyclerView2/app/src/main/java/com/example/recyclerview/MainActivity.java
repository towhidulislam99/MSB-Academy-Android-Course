package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

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




        food_Adapter adapter = new food_Adapter(MainActivity.this,arrayList);
// Linear Layout Manager Example
        /*
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

        recyclerView.setAdapter(adapter);

         */

        /*
        // Grid Layout Example

        GridLayoutManager gridLayoutManager = new GridLayoutManager(MainActivity.this,2,GridLayoutManager.VERTICAL,true);
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setAdapter(adapter);

         */
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        recyclerView.setAdapter(adapter);



    }
}