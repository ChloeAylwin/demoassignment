package com.example.demoassignment1

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.textViewSuggestion)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //Here are the variables I have declared
        val editTextTime = findViewById<EditText>(R.id.editTextTime)
        val buttonSuggest = findViewById<Button>(R.id.buttonSuggest)
        val buttonReset = findViewById<Button>(R.id.buttonReset)
        val textViewSuggest = findViewById<TextView>(R.id.textViewSuggest)
        //Author: Zahra Bulbulia
        //url: https://youtu.be/R5p-YXC87VU?si=FMHQxElwma1YEO9V
//Here is where you'll find the meal suggestions for all hours of the day
        buttonSuggest.setOnClickListener {
            val timeOfDay = editTextTime.text.toString().trim()
            val suggest = when (timeOfDay.lowercase()) {
                "morning" -> "Make eggs with a side of avo and toast."
                "mid-morning" -> "Slice up some cucumber and drizzle balsamic vinegar"
                "afternoon" -> "Time to have a simple bagel with ham,cheese,mayo and lettuce"
                "mid-afternoon" -> "Take the Greek yogurt out and add some blueberries and honey"
                "dinner" -> "Cook yourself a steak with boiled broccoli and a stuffed baked potato"
                //Author: Myself for the meal suggestion

                // This will allow user to reset if needed
                // Author:Zahara Bulbulia
            textViewSuggest.text = suggest
                else -> "Please enter the correct time of day, try using lowercase."
            }
        buttonReset.setOnClickListener {
            editTextTime.text.clear()
            textViewSuggest.text = **

    }
}