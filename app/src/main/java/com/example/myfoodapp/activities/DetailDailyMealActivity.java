package com.example.myfoodapp.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.ImageView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DetailedDailyAdapter;
import com.example.myfoodapp.models.DetailedDailyModels;

import java.util.ArrayList;
import java.util.List;

public class DetailDailyMealActivity extends AppCompatActivity
{
    RecyclerView recyclerView;
    List<DetailedDailyModels> detailedDailyModels;

    DetailedDailyAdapter dailyAdapter;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_daily_meal);

        String type=getIntent().getStringExtra("type");
        recyclerView=findViewById(R.id.detailed_rec);
        imageView=findViewById(R.id.detailed_img1);

        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        detailedDailyModels=new ArrayList<>();
        dailyAdapter=new DetailedDailyAdapter(detailedDailyModels);
        recyclerView.setAdapter(dailyAdapter);

        if (type!=null&&type.equalsIgnoreCase("breakfast"))
        {
            imageView.setImageResource(R.drawable.breakfast);
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if (type!=null&&type.equalsIgnoreCase("lunch"))
        {
            imageView.setImageResource(R.drawable.lunch);
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if (type!=null&&type.equalsIgnoreCase("dinner"))
        {
            imageView.setImageResource(R.drawable.dinner);
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if (type!=null&&type.equalsIgnoreCase("sweets"))
        {
            imageView.setImageResource(R.drawable.sweet);
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.sweet11,"Sweets","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.sweet2,"Sweets","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.sweet3,"Sweets","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.sweet4,"Sweets","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.sweet5,"Sweets","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.sweet11,"Sweets","description","4.4","$67","10am-9pm"));

            dailyAdapter.notifyDataSetChanged();
        }
        if (type!=null&&type.equalsIgnoreCase("coffee"))
        {
            imageView.setImageResource(R.drawable.coffee);
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav1,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav2,"Breakfast","description","4.4","$67","10am-9pm"));
            detailedDailyModels.add(new DetailedDailyModels(R.drawable.fav3,"Breakfast","description","4.4","$67","10am-9pm"));

            dailyAdapter.notifyDataSetChanged();
        }

    }
}