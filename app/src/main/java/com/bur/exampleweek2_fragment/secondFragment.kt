package com.bur.exampleweek2_fragment

import android.content.ContentValues
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.bur.exampleweek2_fragment.databinding.FragmentSecondBinding


class secondFragment : Fragment() {
    lateinit var binding: FragmentSecondBinding
    val thirdFragment = thirdFragment()
    val name = "Second Fragment"
    val TAG = "LoggerApp"
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


    override fun onAttach(context: Context) {
        (activity as MainActivity?)?.newItemInLogList("onAttach() $name")
        Log.i(TAG, "onAttach() $name");
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        (activity as MainActivity?)?.newItemInLogList("onCreate() $name")
        Log.i(TAG, "onCreate() $name");
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        (activity as MainActivity?)?.newItemInLogList("onViewCreated() $name")
        Log.i(TAG, "onViewCreated() $name");
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        (activity as MainActivity?)?.newItemInLogList("onActivityCreated() $name")
        Log.i(TAG, "onActivityCreated() $name");
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        (activity as MainActivity?)?.newItemInLogList("onStart() $name")
        Log.i(TAG, "onStart() $name");
        super.onStart()
    }

    override fun onResume() {
        (activity as MainActivity?)?.newItemInLogList("onResume() $name")
        Log.i(TAG, "onResume() $name");
        super.onResume()
    }

    override fun onPause() {
        (activity as MainActivity?)?.newItemInLogList("onPause() $name")
        Log.i(TAG, "onPause() $name");
        super.onPause()
    }

    override fun onStop() {
        (activity as MainActivity?)?.newItemInLogList("onStop() $name")
        Log.i(TAG, "onStop() $name");
        super.onStop()
    }

    override fun onDestroyView() {
        (activity as MainActivity?)?.newItemInLogList("onDestroyView() $name")
        Log.i(TAG, "onDestroyView() $name");
        super.onDestroyView()
    }

    override fun onDestroy() {
        (activity as MainActivity?)?.newItemInLogList("onDestroy() $name")
        Log.i(TAG, "onDestroy() $name");
        super.onDestroy()
    }

    override fun onDetach() {
        (activity as MainActivity?)?.newItemInLogList("onDetach() $name")
        Log.i(TAG, "onDetach() $name");
        super.onDetach()
    }
}
