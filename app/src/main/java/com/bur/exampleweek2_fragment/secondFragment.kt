package com.bur.exampleweek2_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bur.exampleweek2_fragment.databinding.FragmentSecondBinding


class secondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    val thirdFragment = thirdFragment()
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSecondBinding.inflate(inflater, container, false)
        binding.secondFrgmntBtn.setOnClickListener { launchThirdFragment() }
        return binding.root
    }

    private fun launchThirdFragment() {
        parentFragmentManager.beginTransaction()
            .addToBackStack(null)
            .replace(R.id.fragment_container, thirdFragment)
            .commit()
    }

}
