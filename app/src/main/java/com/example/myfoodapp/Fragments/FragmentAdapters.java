package com.example.myfoodapp.Fragments;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class FragmentAdapters extends FragmentStateAdapter
{
    public FragmentAdapters(@NonNull FragmentManager fragmentManager, @NonNull Lifecycle lifecycle)
    {
        super(fragmentManager, lifecycle);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position)
    {
        switch (position)
        {
            case 1:
                return new SecondFragment();

            case 2:
                return new ThirdFragment();
        }
        return new FirstFragment();
    }

    @Override
    public int getItemCount()
    {
        return 3;
    }
}
