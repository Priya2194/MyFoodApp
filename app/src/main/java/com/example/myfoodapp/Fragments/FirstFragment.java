package com.example.myfoodapp.Fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.FeaturedAdapter;
import com.example.myfoodapp.adapters.FeaturedVerAdapter;
import com.example.myfoodapp.models.FeaturedModel;
import com.example.myfoodapp.models.FeaturedVerModel;

import java.util.ArrayList;
import java.util.List;


public class FirstFragment extends Fragment
{
 ////////////////Featured Hor Recyclerview////////////
    List<FeaturedModel> featuredModelList;
    RecyclerView recyclerView;
    FeaturedAdapter featuredAdapter;

    ////////////////Featured Ver Recyclerview////////////
    List<FeaturedVerModel> featuredVerModelList;
    RecyclerView recyclerViewV;
    FeaturedVerAdapter featuredVerAdapter;

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_first, container, false);

        /////////////hor//////////////
        recyclerView=view.findViewById(R.id.featured_hor_rec);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.HORIZONTAL,false));

        featuredModelList=new ArrayList<>();
        featuredModelList.add(new FeaturedModel(R.drawable.fav1,"Featured 1","Description 1"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav2,"Featured 2","Description 2"));
        featuredModelList.add(new FeaturedModel(R.drawable.fav3,"Featured 3","Description 3"));

        featuredAdapter=new FeaturedAdapter(featuredModelList);
        recyclerView.setAdapter(featuredAdapter);

        /////////////ver////////////
        recyclerViewV=view.findViewById(R.id.featured_ver_rec);
        recyclerViewV.setLayoutManager(new LinearLayoutManager(getContext(),RecyclerView.VERTICAL,false));

        featuredVerModelList=new ArrayList<>();
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav1,"Featured 1 ","Description 1","4.5","10:00-8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav2,"Featured 2","Description 2","4.5","10:00-8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav3,"Featured 3","Description 3","4.5","10:00-8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav1,"Featured 1","Description 1","4.5","10:00-8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav2,"Featured 2","Description 2","4.5","10:00-8:00"));
        featuredVerModelList.add(new FeaturedVerModel(R.drawable.fav3,"Featured 3","Description 3","4.5","10:00-8:00"));

       featuredVerAdapter=new FeaturedVerAdapter(featuredVerModelList);
       recyclerViewV.setAdapter(featuredVerAdapter);
        return  view;
    }
}