package com.example.testing;

import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.testing.databinding.ActivityNavDrawerBinding;
import com.google.android.material.navigation.NavigationView;

public class NavDrawer extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    ActivityNavDrawerBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityNavDrawerBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        //  getSupportActionBar().hide();//نستخدمها لاخفاء ال actionBar لل activty
        setSupportActionBar(binding.toolBarDrawer);// هادي بتظهر ال actionBar

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, binding.drawerLayout, binding.toolBarDrawer, R.string.open_drawer_text,
                R.string.colse_drawer_text
                );
        binding.drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,SearchFragment.newInstance("Home")).commit();

        binding.navView.setCheckedItem(R.id.nav_search);
        binding.navView.setNavigationItemSelectedListener(this);


    }

    @Override
    public void onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)){
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        }else {
        super.onBackPressed();
    }}
    

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.nav_search) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,SearchFragment.newInstance("Home")).commit();
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        } else if (item.getItemId() == R.id.nav_profile) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,SearchFragment.newInstance("Home")).commit();
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        }else if (item.getItemId() == R.id.navView) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,SearchFragment.newInstance("Home")).commit();
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        }
        return true;
    }
}