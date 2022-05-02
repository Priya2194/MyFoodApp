package com.example.myfoodapp.ui;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.CartAdapter;
import com.example.myfoodapp.models.CartModel;

import java.util.ArrayList;
import java.util.List;

public class MyCartFragment extends Fragment
{

    RecyclerView recyclerView;
    List<CartModel> list;
    CartAdapter cartAdapter;



    public MyCartFragment()
    {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_my_cart, container, false);
        recyclerView=view.findViewById(R.id.cart_rec);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        list=new ArrayList<>();
        list.add(new CartModel(R.drawable.sweet11,"Order 1","4.4","50"));
        list.add(new CartModel(R.drawable.sweet11,"Order 1","4.4","50"));
        list.add(new CartModel(R.drawable.sweet11,"Order 1","4.4","50"));
        list.add(new CartModel(R.drawable.sweet11,"Order 1","4.4","50"));
        list.add(new CartModel(R.drawable.sweet11,"Order 1","4.4","50"));
        list.add(new CartModel(R.drawable.sweet11,"Order 1","4.4","50"));

        cartAdapter=new CartAdapter(list);
        recyclerView.setAdapter(cartAdapter);
        return view;
    }
}