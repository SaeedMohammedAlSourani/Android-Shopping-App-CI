package com.example.testing;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.testing.databinding.ActivityTharedActivtiyBinding;

public class TharedActivtiy extends AppCompatActivity {
    ActivityTharedActivtiyBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityTharedActivtiyBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());


        getSupportFragmentManager().beginTransaction().addToBackStack("saeed").replace(R.id.containerSubmit,new TharedFragment()).commit();
        binding.Submit.setOnClickListener(view -> {
            String name =binding.ETSubmti.getText().toString();
        FourdFragment fourdFragment=FourdFragment.newInstance(binding.ETSubmti.getText().toString());
            TharedFragment tharedFragment=new TharedFragment();
            Bundle bundle=new Bundle();
            bundle.putString("name",binding.ETSubmti.getText().toString());
            tharedFragment.setArguments(bundle);

            getSupportFragmentManager().beginTransaction().addToBackStack("saeed").replace(R.id.containerSubmit,new FourdFragment()).commit();

        });

    }
}