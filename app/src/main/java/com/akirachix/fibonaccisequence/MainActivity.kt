package com.akirachix.fibonaccisequence

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.akirachix.fibonaccisequence.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

       binding=ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        var number = numbersOffibonacci(100)
        binding.rvFibonacci.layoutManager=LinearLayoutManager(this)
        val fibonacciNumbersAdapter = NumbersRecyclerView(number)
        binding.rvFibonacci.adapter = fibonacciNumbersAdapter
    }

    fun numbersOffibonacci(num:Int):List<Int>{
        val numbers = mutableListOf(0,1)
        while (numbers.size< num){
            numbers.add(numbers[numbers.lastIndex]+numbers[numbers.lastIndex - 1])
        }
        return numbers
    }
}