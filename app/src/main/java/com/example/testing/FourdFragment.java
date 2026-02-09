package com.example.testing;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.testing.databinding.FragmentFourdBinding;

public class FourdFragment extends Fragment {

    private static final String ARG_Name = "name";
    // TODO: Rename and change types of parameters
    private String name;

    public FourdFragment() {
        // Required empty public constructor
    }


    public static FourdFragment newInstance(String name) {
        FourdFragment fragment = new FourdFragment();
        Bundle args = new Bundle();
        args.putString(ARG_Name, name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            name = getArguments().getString(ARG_Name);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        FragmentFourdBinding binding=FragmentFourdBinding.inflate(inflater,container,false);
        if (name!=null)
                binding.FourdFragments.setText(name);
        return binding.getRoot();
    }
}