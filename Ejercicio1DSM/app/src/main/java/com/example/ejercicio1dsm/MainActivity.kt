package com.example.ejercicio1dsm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    private lateinit var res:TextView
    private lateinit var res2:TextView
    lateinit var A:EditText
    lateinit var B:EditText
    lateinit var C:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        A=findViewById(R.id.valA)
        B=findViewById(R.id.ValB)
        C=findViewById(R.id.ValC)
        res=findViewById(R.id.txtRes1)
        res2=findViewById(R.id.txtRes2)
    }
     fun Calculo(view:View){
        var x1: Double
        var x2: Double
        var A1: Double=A.text.toString().toDouble()
        var B2: Double=B.text.toString().toDouble()
        var C2: Double=C.text.toString().toDouble()
var disc:Double
         disc=(B2*B2)-4*A1*C2
if (disc>=0){
    x1=(-B2+ sqrt(disc))/(2*A1)
    x2=(-B2-(sqrt(disc)))/(2*A1)
    res.text=""+x1.toString()
    res2.text=""+x2.toString()

}
         else{
    Toast.makeText(this,"No se puede resolver porque el discriminante da imaginario",Toast.LENGTH_LONG).show()
         }
    }

}