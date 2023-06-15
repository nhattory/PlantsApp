package com.example.plantsapp;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class ResetActicity extends AppCompatActivity implements View.OnClickListener {

    EditText txt_email;

    ImageView btn_reset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset);
        init();
    }

    private void init()
    {
        txt_email = findViewById(R.id.txt_reset_email);
        btn_reset = findViewById(R.id.btn_sendemail);
        btn_reset.setOnClickListener(this);
    }


    @Override
    public void onClick(View view) {

    }
}
