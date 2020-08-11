package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_flora_activity.*
import android.text.method.ScrollingMovementMethod
import androidx.core.app.ComponentActivity
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T



class flora_activity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_flora_activity)
        val opcion: Int = intent.getIntExtra("option",1)
        val imageViewPlanta: ImageView = findViewById(R.id.imageView22)
        if(opcion==1){
            imageViewPlanta.setImageResource(R.drawable.flora_03)
        }
        if(opcion==2){
            imageViewPlanta.setImageResource(R.drawable.flora_08)
        }
        if(opcion==3){
            imageViewPlanta.setImageResource(R.drawable.flora_07)
        }
        if(opcion==4){
            imageViewPlanta.setImageResource(R.drawable.flora_04)
        }
        if(opcion==5){
            imageViewPlanta.setImageResource(R.drawable.flora_05)
        }
        if(opcion==6){
            imageViewPlanta.setImageResource(R.drawable.flora_06)
        }
    }
}
