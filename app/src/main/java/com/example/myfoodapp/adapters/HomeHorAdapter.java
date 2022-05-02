package com.example.myfoodapp.adapters;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.HomeHorModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeHorAdapter extends RecyclerView.Adapter<HomeHorAdapter.ViewHolder>
{
    UpdateVerticalRec updateVerticalRec;
    Activity activity;
    //Context context;
    ArrayList<HomeHorModel> list;

    boolean check=true;
    boolean select=true;
    int row_index=-1;

    public HomeHorAdapter(UpdateVerticalRec updateVerticalRec, Activity activity, ArrayList<HomeHorModel> list)
    {
        this.updateVerticalRec = updateVerticalRec;
        this.activity = activity;
        this.list = list;
    }
    /*public HomeHorAdapter(Context context, List<HomeHorModel> list)
    {
        this.context = context;
        this.list = list;
    }*/

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.homehorizontalitem,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position)
    {
        holder.imageView.setImageResource(list.get(position).getImage());
        holder.name.setText(list.get(position).getName());

        if (check)
        {
            ArrayList<HomeVerModel> homeVerModels = new ArrayList<>();

            //homeVerModels.add(new HomeVerModel(R.drawable.pizza, "Pizza", "10:30-23:00", "4.5", "Min_$50"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza1, "Pizza 1", "10:30-23:00", "4.5", "Min-$50"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza2, "Pizza 2", "10:30-23:00", "4.5", "Min-$50"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza3, "Pizza 3", "10:30-23:00", "4.5", "Min-$50"));
            homeVerModels.add(new HomeVerModel(R.drawable.pizza4, "Pizza 4", "10:30-23:00", "4.5", "Min-$50"));

            updateVerticalRec.callBack(position, homeVerModels);
            check = false;
        }
            holder.cardView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    row_index=position;
                    notifyDataSetChanged();
                    if (position==0)
                    {
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();


                        homeVerModels.add(new HomeVerModel(R.drawable.pizza1,"Pizza 1","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza2,"Pizza 2","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza3,"Pizza 3","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.pizza4,"Pizza 4","10:30-23:00","4.5","Min-$50"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position==1)
                    {
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();


                        homeVerModels.add(new HomeVerModel(R.drawable.burger1,"Burger 1","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger2,"Burger 2","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger3,"Burger 3","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.burger4,"Burger 4","10:30-23:00","4.5","Min-$50"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position==2)
                    {
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();


                        homeVerModels.add(new HomeVerModel(R.drawable.fried_potatoes,"fried_potatoes","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries2,"Fries 2","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries3,"Fries 3","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.fries4,"Fries 4","10:30-23:00","4.5","Min-$50"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position==3)
                    {
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();


                        homeVerModels.add(new HomeVerModel(R.drawable.icecream1,"Icecream 1","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream2,"Icecream 2","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream3,"Icecream 3","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.icecream4,"Icecream 4","10:30-23:00","4.5","Min-$50"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }
                    else if (position==4)
                    {
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();


                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich1,"Sandwich 1","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich2,"Sandwich 2","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich3,"Sandwich 3","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.sandwich4,"Sandwich 4","10:30-23:00","4.5","Min-$50"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                    else if (position==5)
                    {
                        ArrayList<HomeVerModel> homeVerModels=new ArrayList<>();


                        homeVerModels.add(new HomeVerModel(R.drawable.coffee1,"Coffee 1","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coffee2,"Coffee 2","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coffee3,"Coffee 3","10:30-23:00","4.5","Min-$50"));
                        homeVerModels.add(new HomeVerModel(R.drawable.coffee4,"Coffee 4","10:30-23:00","4.5","Min-$50"));

                        updateVerticalRec.callBack(position,homeVerModels);
                    }

                }
            });
            if (select)
            {
                if (position==0)
                {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                    select=false;
                }
            }
            else
            {
                if (row_index==position)
                {
                    holder.cardView.setBackgroundResource(R.drawable.change_bg);
                }
                else
                    {
                        holder.cardView.setBackgroundResource(R.drawable.default_bg);
                    }
            }
        }


    @Override
    public int getItemCount()
    {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;
        TextView name;
        CardView cardView;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView=itemView.findViewById(R.id.hor_img);
            name=itemView.findViewById(R.id.hor_txt);
            cardView=itemView.findViewById(R.id.cardView);
        }
    }
}
