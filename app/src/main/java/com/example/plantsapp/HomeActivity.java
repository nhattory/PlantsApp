package com.example.plantsapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toolbar;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class HomeActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    FloatingActionButton btn_add;
    private Fragment selectedFragment = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);

        // Set the default selected fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView, new fm_home(this))
                .commit();
        btn_add = (FloatingActionButton) findViewById(R.id.floatingActionButton2);
        btn_add.setOnClickListener(HomeActivity.this);
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {

        switch (item.getItemId()) {
            case R.id.home:
                System.out.println("profile");
                selectedFragment = new fm_home(this);
                break;
            case R.id.person:
                System.out.println("profile");
                selectedFragment = new fm_profile();
                break;
        }

        if (selectedFragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragmentContainerView, selectedFragment)
                    .commit();
            return true;
        }
        return false;
    }
    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.floatingActionButton2){
            selectedFragment = new fm_add(this);
            if (selectedFragment != null) {
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.fragmentContainerView, selectedFragment)
                        .commit();
            }
        }
    }

}