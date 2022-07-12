package com.bur.exampleweek2_fragment

import android.app.ProgressDialog.show
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.bur.exampleweek2_fragment.databinding.FragmentFirstBinding
import com.bur.exampleweek2_fragment.databinding.FragmentThirdBinding


class thirdFragment : Fragment() {
    lateinit var binding: FragmentThirdBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(inflater, container, false)
        binding.alertDialogBtn.setOnClickListener { launchAlertDialog() }
        return binding.root

    }

    private fun launchAlertDialog() {
        val myDialogFragment = myAlertDialog()
        val manager = parentFragmentManager
        myDialogFragment.show(manager, "myDialog")
    }

}