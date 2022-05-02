package com.example.myfoodapp.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.FeaturedModel;

import java.util.List;

public class FeaturedAdapter extends RecyclerView.Adapter<FeaturedAdapter.ViewHolder>
{
    List<FeaturedModel> list;

    public FeaturedAdapter(List<FeaturedModel> list)
    {
        this.list = list;
    }

    @NonNull
    @Override
    public FeaturedAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.featured_hor_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull FeaturedAdapter.ViewHolder holder, int position)
    {

        holder.image.setImageResource(list.get(position).getImage());
        holder.desc.setText(list.get(position).getDesc());
        holder.name.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView image;
        TextView desc,name;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            image=itemView.findViewById(R.id.featured_img);
            desc=itemView.findViewById(R.id.featured_des);
            name=itemView.findViewById(R.id.featured_nm);
        }
    }
}
