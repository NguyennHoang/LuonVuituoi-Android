package com.example.food_delivery

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_on_boarding_three.*
import kotlinx.android.synthetic.main.activity_on_boarding_two.*

class OnBoardingThreeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding_three)
        btn_onBoarding3.setOnClickListener {
            val intent: Intent = Intent(this, welcome::class.java)
            startActivity(intent)
        }
    }
}