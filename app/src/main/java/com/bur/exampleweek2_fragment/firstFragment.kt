package com.bur.exampleweek2_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bur.exampleweek2_fragment.databinding.ActivityMainBinding
import com.bur.exampleweek2_fragment.databinding.FragmentFirstBinding

class firstFragment : Fragment() {
    lateinit var binding: FragmentFirstBinding
    val secondFragment = secondFragment()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentFirstBinding.inflate(inflater, container, false)
        binding.firstFrgmntBtn.setOnClickListener { launchSecondFragment() }
        return binding.root
    }

    private fun launchSecondFragment() {
        parentFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragment_container, secondFragment)
            .commit()
    }
}


