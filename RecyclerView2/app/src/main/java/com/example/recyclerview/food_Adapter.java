package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class food_Adapter extends RecyclerView.Adapter<food_Adapter.MyViewHolder> {


    private  Context context;
    private ArrayList<FoodModel> arrayList;
    food_Adapter(Context context, ArrayList<FoodModel> arrayList)
    {
        this.context = context;
        this.arrayList = arrayList;

    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(context);
       View v = layoutInflater.inflate(R.layout.food_item_row,parent,false);
       MyViewHolder myViewHolder = new MyViewHolder(v);

        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.image.setImageResource(arrayList.get(position).image);
        holder.foodname.setText(arrayList.get(position).foodname.toString());
        holder.fooddesc.setText(arrayList.get(position).fooddesc.toString());

    }

    @Override
    public int getItemCount() {

        return arrayList.size();
    }

    public  class MyViewHolder extends RecyclerView.ViewHolder
    {
        TextView foodname, fooddesc;
        ImageView image;

        public MyViewHolder(@NonNull View itemView) {

            super(itemView);

            foodname = itemView.findViewById(R.id.foodNameTV);
            fooddesc = itemView.findViewById(R.id.fooddescTV);
            image = itemView.findViewById(R.id.ImageView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(context,arrayList.get(getAdapterPosition()).fooddesc.toString(),Toast.LENGTH_SHORT).show();
                }
            });
        }
    }


}
