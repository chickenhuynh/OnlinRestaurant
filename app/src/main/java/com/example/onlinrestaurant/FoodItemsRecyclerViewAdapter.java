package com.example.onlinrestaurant;

import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class FoodItemsRecyclerViewAdapter extends RecyclerView.Adapter<FoodItemsRecyclerViewAdapter.FoodItemsViewHolder> {

    private ArrayList<FoodItems> data;
    public void setData(ArrayList<FoodItems> data){
        this.data = data;
    }

    public class FoodItemsViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView foodText;

        public FoodItemsViewHolder(@NonNull View itemView) {

            super(itemView);
            view = itemView;
            foodText = itemView.findViewById(R.id.tv_food);



        }

        public void bind(FoodItems food) {

            foodText.setText(food.getFood());
        }
    }

    @NonNull
    @Override
    public FoodItemsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.fooditems, parent, false);

        FoodItemsViewHolder foodViewHolder = new FoodItemsViewHolder(view);

        return foodViewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull FoodItemsViewHolder holder, int position) {
        FoodItems food = data.get(position);
        holder.bind(food);






    }

    @Override
    public int getItemCount() {
        return data.size();
    }


}
