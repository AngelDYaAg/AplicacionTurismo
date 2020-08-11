
package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class valor_nutricional_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valor_nutricional_activity)
        val clase: Int = intent.getIntExtra("clase",1)
        val comida: Int = intent.getIntExtra("comida",1)
        val imageViewvalorNutri: ImageView = findViewById(R.id.imageViewvalornutri)
        if (clase==1&&comida==1){
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_fritada)
        }
        if (clase==1&&comida==2){
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_sancocho)
        }
        if (clase==2&&comida==1){
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_chingui)
        }
        if (clase==2&&comida==2){
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_chicha)
        }
        if (clase==3&&comida==1){
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_dulce_oca)
        }
        if (clase==3&&comida==2){
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_papa_china)
        }
    }
}