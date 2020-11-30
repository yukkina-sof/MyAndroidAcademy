package com.example.myandroidacademy

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.fragment.app.Fragment

class MovieDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_movie_details, container, false)
        val image = view.findViewById<View>(R.id.rating_bar_1) as ImageView
        val image2 = view.findViewById<View>(R.id.rating_bar_2) as ImageView
        val image3 = view.findViewById<View>(R.id.rating_bar_3) as ImageView
        val image4 = view.findViewById<View>(R.id.rating_bar_4) as ImageView
        val image5 = view.findViewById<View>(R.id.rating_bar_5) as ImageView
        image.setImageLevel(1)
        image2.setImageLevel(1)
        image3.setImageLevel(1)
        image4.setImageLevel(1)
        image5.setImageLevel(0)
        view.findViewById<TextView>(R.id.back).setOnClickListener {
            activity?.onBackPressed()
        }
        return view
    }

    companion object {
        @JvmStatic
        fun newInstance() =
            MovieDetailsFragment()
    }
}