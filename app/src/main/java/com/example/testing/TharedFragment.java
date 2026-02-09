package com.example.testing;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testing.databinding.FragmentTharedBinding;


public class TharedFragment extends Fragment {
    String name;
    public TharedFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (name!=null)
         name = getArguments().getString("name");
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (name!=null);
        FragmentTharedBinding binding =FragmentTharedBinding.inflate(inflater,container,false);
        return binding.getRoot();
    }
}