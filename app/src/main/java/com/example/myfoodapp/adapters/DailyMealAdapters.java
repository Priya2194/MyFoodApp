package com.example.myfoodapp.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.activities.DetailDailyMealActivity;
import com.example.myfoodapp.models.DailyMealModels;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class DailyMealAdapters extends RecyclerView.Adapter<DailyMealAdapters.ViewHolder>
{

    Context context;
    List<DailyMealModels> list;

    public DailyMealAdapters(Context context, List<DailyMealModels> list)
    {
        this.context = context;
        this.list = list;
    }



    @NonNull
    @Override
    public DailyMealAdapters.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DailyMealAdapters.ViewHolder holder, @SuppressLint("RecyclerView") int position)
    {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.discount.setText(list.get(position).getDiscount());

        holder.itemView.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent=new Intent(context, DetailDailyMealActivity.class);
                intent.putExtra("type",list.get(position).getType());
                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView name,description, discount;

        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView=itemView.findViewById(R.id.imgdmeal);
            name=itemView.findViewById(R.id.textView8);
            description=itemView.findViewById(R.id.textView9);
            discount=itemView.findViewById(R.id.discount);
        }
    }
}
