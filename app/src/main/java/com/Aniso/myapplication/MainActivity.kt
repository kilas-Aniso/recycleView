package com.Aniso.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecycleView>(R.id.recyclerView)

        var adapter = RecyclerViewAdapter(getFibonacciNumbers(100))
        adapter = recyclerView.adapter
    }

    private fun getFibonacciNumbers(limit: Int): List<Int> {
        val fibonacciNumbers = mutableListOf(0, 1)
        for (i in 2 until limit) {
            fibonacciNumbers.add(fibonacciNumbers[i - 1] + fibonacciNumbers[i - 2])
        }
        return fibonacciNumbers
    }

}



