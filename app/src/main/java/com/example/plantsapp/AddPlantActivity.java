package com.example.plantsapp;



import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class AddPlantActivity extends AppCompatActivity implements View.OnClickListener {

    ImageView pic;
    private static final int CAMERA_REQUEST_CODE = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_plants);
        pic = (ImageView) findViewById(R.id.imageView);
    }



    @Override
    public void onClick(View view) {

    }
}
