package com.bur.exampleweek2_fragment

import android.app.Dialog
import android.content.ContentValues
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment

class myAlertDialog : DialogFragment() {
    val name = "AlertDialog"
    val TAG = "LoggerApp"
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return activity?.let {
            val builder = AlertDialog.Builder(it)
            builder.setTitle("Важное сообщение!")
                .setMessage("Покормите кота!")
                .setPositiveButton("ОК, иду на кухню") { dialog, id ->
                    dialog.cancel()
                }
            builder.create()
        } ?: throw IllegalStateException("Activity cannot be null")
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
