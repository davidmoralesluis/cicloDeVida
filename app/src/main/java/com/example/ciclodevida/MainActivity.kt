package com.example.ciclodevida

import android.graphics.Color
import android.hardware.biometrics.BiometricManager.Strings
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var horaContador:Long =0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myButton: Button = findViewById(R.id.my_button)
        myButton.setBackgroundColor(Color.MAGENTA)
        myButton.text="PUSH ME"

        val textVista: TextView= findViewById(R.id.text_saludo)
        textVista.text="!! What's UP !!"

        horaContador=System.currentTimeMillis()
        Log.d("Estado","he creado!!!")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Estado","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Estado","OnResume")
    }



    override fun onPause() {
        super.onPause()
        val hrFinal = System.currentTimeMillis()
        Log.d("Estado","OnPause "+((System.currentTimeMillis()-horaContador)/1000)+" segundos")
    }


}