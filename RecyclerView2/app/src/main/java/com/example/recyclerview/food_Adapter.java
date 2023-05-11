package com.example.recyclerview;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class food_Adapter extends RecyclerView<food_Adapter.MyViewHolder> {


    public  class MyViewHolder extends RecyclerView.ViewHolder
    {

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }


}
