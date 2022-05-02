package com.example.myfoodapp.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.models.HomeVerModel;
import com.example.myfoodapp.ui.MyCartFragment;
import com.google.android.material.bottomsheet.BottomSheetDialog;

import java.util.ArrayList;
import java.util.List;

public class HomeVerAdapter extends RecyclerView.Adapter<HomeVerAdapter.ViewHolder>
{
    private BottomSheetDialog bottomSheetDialog;
    Context context;
   ArrayList<HomeVerModel> list;

    public HomeVerAdapter(Context context, ArrayList<HomeVerModel> list)
    {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.home_vertical_item,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {

        final String mName=list.get(position).getName();
        final String mPrice=list.get(position).getPrice();
        final String mRating=list.get(position).getRating();
        final String mTiming=list.get(position).getTiming();
        final int mImage=list.get(position).getImage();

            holder.imageView.setImageResource(list.get(position).getImage());
            holder.name.setText(list.get(position).getName());
            holder.price.setText(list.get(position).getPrice());
            holder.rating.setText(list.get(position).getRating());
            holder.timing.setText(list.get(position).getTiming());

            holder.itemView.setOnClickListener(new View.OnClickListener()
            {
                @Override
                public void onClick(View v)
                {
                    bottomSheetDialog=new BottomSheetDialog(context,R.style.BottomSheetTheme);

                    View sheetView=LayoutInflater.from(context).inflate(R.layout.bottom_sheet_layout,null);

                    sheetView.findViewById(R.id.add_to_cart).setOnClickListener(new View.OnClickListener()
                    {
                        @Override
                        public void onClick(View v)
                        {
                            Toast.makeText(context, "Added to a cart", Toast.LENGTH_SHORT).show();
                            bottomSheetDialog.dismiss();
                            sheetView.getContext().startActivity(new Intent(context,MyCartFragment.class));

                        }
                    });
                    ImageView bottomimg=sheetView.findViewById(R.id.bottom_sheet_img);
                    TextView bottomNm=sheetView.findViewById(R.id.bottom_sheet_name);
                    TextView bottomRating=sheetView.findViewById(R.id.bottom_sheet_rating);
                    TextView bottomtiming=sheetView.findViewById(R.id.bottom_sheet_timing);
                    TextView bottomPrice=sheetView.findViewById(R.id.bottom_sheet_price);
                    Button bottomBtn=sheetView.findViewById(R.id.add_to_cart);


                    bottomNm.setText(mName);
                    bottomRating.setText(mRating);
                    bottomtiming.setText(mTiming);
                    bottomPrice.setText(mPrice);
                    bottomimg.setImageResource(mImage);

                    bottomSheetDialog.setContentView(sheetView);
                    bottomSheetDialog.show();

bottomBtn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v)
    {
        Intent intent=new Intent(bottomBtn.getContext(),MyCartFragment.class);
        bottomBtn.getContext().startActivity(intent);

    }
});

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
        TextView name,timing,rating,price;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            imageView=itemView.findViewById(R.id.ver_img);
            name=itemView.findViewById(R.id.name);
            timing=itemView.findViewById(R.id.timing);
            rating=itemView.findViewById(R.id.rating);
            price=itemView.findViewById(R.id.price);

        }
    }
}
