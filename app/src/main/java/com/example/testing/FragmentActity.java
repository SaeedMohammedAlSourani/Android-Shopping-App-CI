package com.example.testing;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.testing.databinding.ActivityFragmentActityBinding;

public class FragmentActity extends AppCompatActivity {

    private ActivityFragmentActityBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityFragmentActityBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FirstFragments()).addToBackStack("saeed").commit();

        binding.FirstFragment.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new FirstFragments()).addToBackStack("saeed").commit();
        });
        binding.ScendFragment.setOnClickListener(view -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new ScendFragments()).addToBackStack("saeed").commit();
        });


    }


}