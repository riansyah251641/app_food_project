package com.fromryan.appfoodbinar.presentation.about
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.food_app_project.databinding.FragmentAboutMainBinding


class AboutMainFragment : Fragment() {
    private lateinit var binding: FragmentAboutMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentAboutMainBinding.inflate(layoutInflater, container, false)
        return binding.root
    }

}