package com.example.myfoodapp.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.DetailedDailyModels;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class DetailedDailyAdapter extends RecyclerView.Adapter<DetailedDailyAdapter.Viewholder>
{
    //Context context;
    List<DetailedDailyModels> list;

    public DetailedDailyAdapter( List<DetailedDailyModels> list)
    {
        //this.context = context;
        this.list = list;
    }




    @NonNull
    @Override
    public DetailedDailyAdapter.Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new Viewholder( LayoutInflater.from(parent.getContext()).inflate(R.layout.detailed_daily_meal_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull DetailedDailyAdapter.Viewholder holder, int position)
    {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());
        holder.description.setText(list.get(position).getDescription());
        holder.rating.setText(list.get(position).getRating());
        holder.price.setText(list.get(position).getPrice());
        holder.timing.setText(list.get(position).getTiming());

    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView name,description,rating ,price,timing;
        public Viewholder(@NonNull View itemView)
        {
            super(itemView);

            imageView=itemView.findViewById(R.id.detailed_img);
            name=itemView.findViewById(R.id.detailed_name);
            description=itemView.findViewById(R.id.detailed_desc);
            rating=itemView.findViewById(R.id.detailed_rating);
            price=itemView.findViewById(R.id.detailed_price);
            timing=itemView.findViewById(R.id.detailed_timing);
        }
    }
}
