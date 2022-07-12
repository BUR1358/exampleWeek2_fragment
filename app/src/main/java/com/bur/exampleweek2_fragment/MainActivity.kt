package com.bur.exampleweek2_fragment

import android.R
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.bur.exampleweek2_fragment.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    val name = "Main Activity"
    val TAG = "LoggerApp"

    lateinit var logListView: ListView
    var myLogsList: ArrayList<String> = ArrayList()
    lateinit var arrayAdapter: ArrayAdapter<String>

    lateinit var binding: ActivityMainBinding
    var firstFragment = firstFragment()   //присваиваем
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        logListViewConfig()
        showFirstFragmentOnAppStart(firstFragment)

        newItemInLogList("onCreate() $name")
        Log.i(TAG, "onCreate() $name");
    }

    private fun logListViewConfig() {
        logListView = binding.logListView
        arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myLogsList)
    }

    public fun newItemInLogList(lifeCycleNotification: String) {
        myLogsList.add(lifeCycleNotification)
        arrayAdapter.notifyDataSetChanged()
        logListView.adapter = arrayAdapter
    }

    private fun showFirstFragmentOnAppStart(fragment: Fragment) {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.add(binding.fragmentContainer.id, fragment)
        fragmentManager.commit()
    }

    override fun onStart() {
        newItemInLogList("onStart() $name")
        Log.i(TAG, "onStart() $name");
        super.onStart()
    }

    override fun onResume() {
        newItemInLogList("onResume() $name")
        Log.i(TAG, "onResume() $name");
        super.onResume()
    }

    override fun onPause() {
        newItemInLogList("onPause() $name")
        Log.i(TAG, "onPause() $name");
        super.onPause()
    }

    override fun onRestart() {
        newItemInLogList("onRestart() $name")
        Log.i(TAG, "onRestart() $name");
        super.onRestart()
    }

    override fun onStop() {
        newItemInLogList("onStop() $name")
        Log.i(TAG, "onStop() $name");
        super.onStop()
    }

    override fun onDestroy() {
        newItemInLogList("onDestroy() $name")
        Log.i(TAG, "onDestroy() $name");
        super.onDestroy()
    }

}


