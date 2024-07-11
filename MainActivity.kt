package com.example.myapplicationpractica02dsm104

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val operand1 = findViewById<EditText>(R.id.operand1)
        val operand2 = findViewById<EditText>(R.id.operand2)
        val calculateButton = findViewById<Button>(R.id.btn_calculate)
        val resultView = findViewById<TextView>(R.id.result)

        calculateButton.setOnClickListener {
            val op1 = operand1.text.toString().toFloatOrNull()
            val op2 = operand2.text.toString().toFloatOrNull()

            if (op1 != null && op2 != null) {
                val result = op1 + op2
                resultView.text = "Resultado: $result"
            } else {
                resultView.text = "Por favor ingrese valores válidos"
            }
        }
    }
}
