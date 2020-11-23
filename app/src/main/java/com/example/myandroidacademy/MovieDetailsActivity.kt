package com.example.myandroidacademy

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity


class MovieDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_details)
        val image = findViewById<View>(R.id.rating_bar_1) as ImageView
        val image2 = findViewById<View>(R.id.rating_bar_2) as ImageView
        val image3 = findViewById<View>(R.id.rating_bar_3) as ImageView
        val image4 = findViewById<View>(R.id.rating_bar_4) as ImageView
        val image5 = findViewById<View>(R.id.rating_bar_5) as ImageView
        image.setImageLevel(1)
        image2.setImageLevel(1)
        image3.setImageLevel(1)
        image4.setImageLevel(1)
        image5.setImageLevel(0)
    }
}