package com.bur.exampleweek2_fragment

import android.content.ContentValues
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.bur.exampleweek2_fragment.databinding.FragmentThirdBinding


class thirdFragment : Fragment() {
    lateinit var binding: FragmentThirdBinding
    val name = "Third Fragment"
    val TAG = "LoggerApp"

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

    override fun onAttach(context: Context) {
        Toast.makeText(context, "onAttach() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onAttach() $name");
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Toast.makeText(context, "onCreate() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onCreate() $name");
        super.onCreate(savedInstanceState)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Toast.makeText(context, "onViewCreated() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onViewCreated() $name");
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        Toast.makeText(context, "onActivityCreated() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onActivityCreated() $name");
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        Toast.makeText(context, "onStart() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStart() $name");
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(context, "onResume() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onResume() $name");
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(context, "onPause() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onPause() $name");
        super.onPause()
    }

    override fun onStop() {
        Toast.makeText(context, "onStop() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop() $name");
        super.onStop()
    }

    override fun onDestroyView() {
        Toast.makeText(context, "onDestroyView() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroyView() $name");
        super.onDestroyView()
    }

    override fun onDestroy() {
        Toast.makeText(context, "onDestroy() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDestroy() $name");
        super.onDestroy()
    }

    override fun onDetach() {
        Toast.makeText(context, "onDetach() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onDetach() $name");
        super.onDetach()
    }
}