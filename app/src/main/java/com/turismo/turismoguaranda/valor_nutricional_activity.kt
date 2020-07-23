
package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class valor_nutricional_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_valor_nutricional_activity)
        val opcionvalorNutricional: Int = intent.getIntExtra("optionElemento",2)
        val imageViewvalorNutri: ImageView = findViewById(R.id.imageViewvalornutri)
        if(opcionvalorNutricional==2){
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_fritada)
        }
        if(opcionvalorNutricional==4){
            print(opcionvalorNutricional)
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_sancocho)
        }
        if(opcionvalorNutricional==6){
            print(opcionvalorNutricional)
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_chingui)
        }
        if(opcionvalorNutricional==8){
            print(opcionvalorNutricional)
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_chicha)
        }
        if(opcionvalorNutricional==10){
            print(opcionvalorNutricional)
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_dulce_oca)
        }
        if(opcionvalorNutricional==12){
            print(opcionvalorNutricional)
            imageViewvalorNutri.setImageResource(R.drawable.info_nutri_papa_china)
        }
    }
}