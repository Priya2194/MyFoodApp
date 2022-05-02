package com.example.myfoodapp.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myfoodapp.R;
import com.example.myfoodapp.adapters.HomeHorAdapter;
import com.example.myfoodapp.adapters.HomeVerAdapter;
import com.example.myfoodapp.adapters.UpdateVerticalRec;
import com.example.myfoodapp.databinding.FragmentHomeBinding;
import com.example.myfoodapp.models.HomeHorModel;
import com.example.myfoodapp.models.HomeVerModel;

import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment implements UpdateVerticalRec
{
RecyclerView homeHorizontalrec,homeVerticalrec;

//////////////////////horizontal/////////////////
ArrayList<HomeHorModel> homeHorModelList;
HomeHorAdapter homeHorAdapter;

/////////////////////Vertical///////////////////
    ArrayList<HomeVerModel> homeVerModelList;
    HomeVerAdapter homeVerAdapter;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState)
    {


        View root= inflater.inflate(R.layout.fragment_home, container, false);
        homeHorizontalrec=root.findViewById(R.id.home_hor_rec);
        homeVerticalrec=root.findViewById(R.id.home_ver_rec);

        ////////////////////HorizontalRecyclerView/////////////////////

        homeHorModelList=new ArrayList<>();
        homeHorModelList.add(new HomeHorModel(R.drawable.pizzaa,"Pizza"));
        homeHorModelList.add(new HomeHorModel(R.drawable.hamburger,"burger"));
        homeHorModelList.add(new HomeHorModel(R.drawable.fried_potatoes,"Fries"));
        homeHorModelList.add(new HomeHorModel(R.drawable.ice_cream,"Icecream"));
        homeHorModelList.add(new HomeHorModel(R.drawable.sandwich,"sandwich"));
        homeHorModelList.add(new HomeHorModel(R.drawable.cofffee,"Coffee"));

        homeHorAdapter=new HomeHorAdapter(this,getActivity(),homeHorModelList);
        homeHorizontalrec.setAdapter(homeHorAdapter);
        homeHorizontalrec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.HORIZONTAL,false));
        homeHorizontalrec.setHasFixedSize(true);
        homeHorizontalrec.setNestedScrollingEnabled(false  );


        /////////////////VerticalRecyclerView/////////////////////////

        homeVerModelList=new ArrayList<>();
        /*homeVerModelList.add(new HomeVerModel(R.drawable.burger1,"Burger","10:20-23:00","4.5","Min-$35"));
        homeVerModelList.add(new HomeVerModel(R.drawable.burger1,"Burger","10:20-23:00","4.5","Min-$35"));
        homeVerModelList.add(new HomeVerModel(R.drawable.burger1,"Burger","10:20-23:00","4.5","Min-$35"));
        homeVerModelList.add(new HomeVerModel(R.drawable.burger1,"Burger","10:20-23:00","4.5","Min-$35"));
        homeVerModelList.add(new HomeVerModel(R.drawable.burger1,"Burger","10:20-23:00","4.5","Min-$35"));*/

        homeVerAdapter=new HomeVerAdapter(getActivity(),homeVerModelList);
        homeVerticalrec.setAdapter(homeVerAdapter);
        homeVerticalrec.setLayoutManager(new LinearLayoutManager(getActivity(),RecyclerView.VERTICAL,false));
        /*homeVerticalrec.setHasFixedSize(true);
        homeVerticalrec.setNestedScrollingEnabled(false);*/

        return root;
    }


    @Override
    public void callBack(int position, ArrayList<HomeVerModel> list)
    {
        homeVerAdapter=new HomeVerAdapter(getContext(),list);
        homeVerAdapter.notifyDataSetChanged();
        homeVerticalrec.setAdapter(homeVerAdapter);
    }
}