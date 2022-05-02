package com.example.myfoodapp.ui.DailyMeals;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.DailyMealAdapters;
import com.example.myfoodapp.models.DailyMealModels;

import java.util.ArrayList;
import java.util.List;


public class DailyMealFragment extends Fragment
{

    RecyclerView recyclerView;
    ArrayList<DailyMealModels> dailyMealModels;
    DailyMealAdapters dailyMealAdapters;


    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {

        View root = inflater.inflate(R.layout.fragment_daily_meal,container,false);

        recyclerView=root.findViewById(R.id.daily_meal_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        dailyMealModels=new ArrayList<>();

        dailyMealModels.add(new DailyMealModels(R.drawable.breakfast,"Breakfast","30% OFF","Description Description ","breakfast"));
        dailyMealModels.add(new DailyMealModels(R.drawable.lunch,"Lunch","30% OFF","Description Description ","lunch"));
        dailyMealModels.add(new DailyMealModels(R.drawable.dinner,"Dinner","30% OFF","Description Description ","dinner"));
        dailyMealModels.add(new DailyMealModels(R.drawable.sweet,"Sweets","30% OFF","Description Description ","sweets"));
        dailyMealModels.add(new DailyMealModels(R.drawable.coffee,"Coffee","30% OFF","Description Description ","coffee"));

        dailyMealAdapters=new DailyMealAdapters(getContext(),dailyMealModels);
        recyclerView.setAdapter(dailyMealAdapters);

        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
       // dailyMealAdapters.notifyDataSetChanged();
        return root;
    }


}