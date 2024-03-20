package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.text.toInt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        //Variables
        var btnAdd :Button = findViewById<Button>(R.id.btnAdd)
        var btnSub :Button = findViewById<Button>(R.id.btnSub)
        var btnMul :Button = findViewById<Button>(R.id.btnMul)
        var btnDiv :Button = findViewById<Button>(R.id.btnDiv)
        var intNum1Text :EditText = findViewById<EditText>(R.id.etNum1)
        var intNum1 :Int = 0
        var intNum2Text :EditText = findViewById<EditText>(R.id.etNum2)
        var intNum2 :Int = 0
        var tvDisplay :TextView = findViewById<TextView>(R.id.tvDisplay)
        var intAnswer :Int = 0

        //Addition
        btnAdd.setOnClickListener(){
            intNum1 = intNum1Text.text.toString().toInt()
            intNum2 = intNum2Text.text.toString().toInt()

            //calculation
            intAnswer = intNum1 + intNum2

            //setting tvdisplay to answer
            tvDisplay.text = intAnswer.toString()
        }

        //Subtraction
        btnSub.setOnClickListener(){
            intNum1 = intNum1Text.text.toString().toInt()
            intNum2 = intNum2Text.text.toString().toInt()

            //calculation
            intAnswer = intNum1 - intNum2

            //setting tvdisplay to answer
            tvDisplay.text = intAnswer.toString()
        }

        //Division
        btnDiv.setOnClickListener(){
            intNum1 = intNum1Text.text.toString().toInt()
            intNum2 = intNum2Text.text.toString().toInt()

            //calculation
            intAnswer = intNum1 / intNum2

            //setting tvdisplay to answer
            tvDisplay.text = intAnswer.toString()
        }

        //Multiplication
        btnMul.setOnClickListener(){
            intNum1 = intNum1Text.text.toString().toInt()
            intNum2 = intNum2Text.text.toString().toInt()

            //calculation
            intAnswer = intNum1 * intNum2

            //setting tvdisplay to answer
            tvDisplay.text = intAnswer.toString()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}