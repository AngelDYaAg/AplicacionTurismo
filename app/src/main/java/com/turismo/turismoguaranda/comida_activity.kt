package com.turismo.turismoguaranda


import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class comida_activity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comida_activity)
    }
    fun onclick_proteina (view: View){
        val intent = Intent(this,proteina_activity::class.java);
        startActivity(intent);
    }
    fun onclick_maiz (view: View){
        val intent = Intent(this,maiz_activity::class.java);
        startActivity(intent);
    }
    fun onclick_papa(view: View){
        val intent = Intent(this,papa_activity::class.java);
        startActivity(intent);
    }
}