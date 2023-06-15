package com.example.plantsapp

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity(), View.OnClickListener {
    var btn_signup: ImageView? = null
    var txt_email: EditText? = null
    var txt_password: EditText? = null
    var txt_person: EditText? = null
    var txt_back: TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        init()
    }

    fun init() {
        btn_signup = findViewById<View>(R.id.btn_signup) as ImageView
        btn_signup!!.setOnClickListener(this)
        txt_email = findViewById<View>(R.id.txt_signup_email) as EditText
        txt_password = findViewById<View>(R.id.txt_signup_password) as EditText
        txt_person = findViewById<View>(R.id.txt_signup_personname) as EditText
        txt_back = findViewById<View>(R.id.txt_back) as TextView
        txt_back!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.btn_signup -> {
                // Perform the signup button action
            }
            R.id.txt_back -> {
                onBackPressedCustom()
            }
        }
    }

    private fun onBackPressedCustom() {
        // Handle the custom back button action
        onBackPressed()
    }

}