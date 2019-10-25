package com.example.onlinrestaurant;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<FoodItems> food = new ArrayList<>();
        food.add(new FoodItems("Chicken Burger"));
        food.add(new FoodItems("Apple Pie"));
        food.add(new FoodItems("Fish Fingers"));
        food.add(new FoodItems("Chocolate Mousse"));
        food.add(new FoodItems("Onion Rings"));
        food.add(new FoodItems("French Fries"));
        food.add(new FoodItems("Cheeseburger"));
        food.add(new FoodItems("Beef Burger"));
        food.add(new FoodItems("Salad"));

        RecyclerView recyclerView = findViewById(R.id.rv_main);

        FoodItemsRecyclerViewAdapter adapter = new FoodItemsRecyclerViewAdapter();
        adapter.setData(food);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(linearLayoutManager);





    }
}
