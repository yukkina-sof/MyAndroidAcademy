package com.example.myandroidacademy

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.cardview.widget.CardView

class Movieslist : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_list, container, false)
        val image = view.findViewById<ImageView>(R.id.rating_bar_1)
        val image2 = view.findViewById<ImageView>(R.id.rating_bar_2)
        val image3 = view.findViewById<ImageView>(R.id.rating_bar_3)
        val image4 = view.findViewById<ImageView>(R.id.rating_bar_4)
        val image5 = view.findViewById<ImageView>(R.id.rating_bar_5)
        image.setImageLevel(1)
        image2.setImageLevel(1)
        image3.setImageLevel(1)
        image4.setImageLevel(1)
        image5.setImageLevel(0)

        view.findViewById<CardView>(R.id.card_movie).setOnClickListener {
            (activity as MainActivity).changeFragment(MovieDetailsFragment.newInstance())
        }

        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            Movieslist()
    }
}