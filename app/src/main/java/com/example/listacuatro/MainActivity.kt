package com.example.listacuatro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var  recyclerView: RecyclerView
    private lateinit var foodList: ArrayList<Food>
    private lateinit var foodAdapter: FoodAdapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true);
        recyclerView.layoutManager = LinearLayoutManager(this);

        foodList = ArrayList();

        foodList.add(Food(R.drawable.baseballoficial, "primero"));
        foodList.add(Food(R.drawable.baseballoficial, "dos"));
        foodList.add(Food(R.drawable.baseballoficial, "tres"));
        foodList.add(Food(R.drawable.baseballoficial, "cuatro"));
        foodList.add(Food(R.drawable.baseballoficial, "cinco"));
        foodList.add(Food(R.drawable.baseballoficial, "seis"));
        foodList.add(Food(R.drawable.baseballoficial, "siete"));
        foodList.add(Food(R.drawable.baseballoficial, "ocho"));
        foodList.add(Food(R.drawable.baseballoficial, "nueve"));

        foodAdapter = FoodAdapter(foodList)
        recyclerView.adapter = foodAdapter

        foodAdapter.onItemclick = {
            val intent = Intent(this, DetailedActivity::class.java)
            intent.putExtra("food", it)
            startActivity(intent)
        }





    }
}