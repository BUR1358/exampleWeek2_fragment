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
    private var logListView: ListView ?= null
    private var myLogs: ArrayList<String> ? = null
    private var item
    lateinit var binding: ActivityMainBinding
    var firstFragment = firstFragment()   //присваиваем
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        logListViewConfig()
        showFirstFragmentOnAppStart(firstFragment)
    }

    private fun logListViewConfig() {
        val logListView = binding.logListView
        val adapter: ArrayAdapter<String>
        adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, myLogs)
        logListView.adapter = adapter
    }

    private fun showFirstFragmentOnAppStart(fragment: Fragment) {
        val fragmentManager = supportFragmentManager.beginTransaction()
        fragmentManager.add(binding.fragmentContainer.id, fragment)
        fragmentManager.commit()
    }

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {

        myLogs.add("onCreate() $name")
        ad.notifyDataSetChanged();
        Log.i(TAG, "onCreate() $name");
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        Toast.makeText(getApplicationContext(), "onStart() $name", Toast.LENGTH_SHORT)
            .show();
        Log.i(TAG, "onStart() $name");
        super.onStart()
    }

    override fun onResume() {
        Toast.makeText(getApplicationContext(), "onResume() $name", Toast.LENGTH_SHORT)
            .show();
        Log.i(TAG, "onResume() $name");
        super.onResume()
    }

    override fun onPause() {
        Toast.makeText(getApplicationContext(), "onPause() $name", Toast.LENGTH_SHORT)
            .show();
        Log.i(TAG, "onPause() $name");
        super.onPause()
    }

    override fun onRestart() {
        Toast.makeText(getApplicationContext(), "onRestart() $name", Toast.LENGTH_SHORT)
            .show();
        Log.i(TAG, "onRestart() $name");
        super.onRestart()
    }

    override fun onStop() {
        Toast.makeText(getApplicationContext(), "onStop() $name", Toast.LENGTH_SHORT).show();
        Log.i(TAG, "onStop() $name");
        super.onStop()
    }

    override fun onDestroy() {
        Toast.makeText(getApplicationContext(), "onDestroy() $name", Toast.LENGTH_SHORT)
            .show();
        Log.i(TAG, "onDestroy() $name");
        super.onDestroy()
    }
}


