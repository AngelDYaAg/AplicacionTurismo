package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import com.turismo.turismoguaranda.adaptadores.galeria_adapter
import com.turismo.turismoguaranda.adaptadores.galeria_angel_adaptador
import com.turismo.turismoguaranda.adaptadores.galeria_cabana_adaptador
import com.turismo.turismoguaranda.adaptadores.galeria_colina_adaptador
import com.turismo.turismoguaranda.adaptadores.galeria_rustica_adaptador


class galeria_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria_activity)
        val gridView = findViewById<View>(R.id.grid_view_imagenes) as GridView
        val opcion: Int = intent.getIntExtra("option",1)
        if(opcion==1){
            gridView.adapter = galeria_angel_adaptador(this)
        }
        if(opcion==2){
            gridView.adapter = galeria_colina_adaptador(this)
        }
        if(opcion==3){
            gridView.adapter = galeria_rustica_adaptador(this)
        }
        if(opcion==4){
            gridView.adapter = galeria_cabana_adaptador(this)
        }
        if(opcion==5){
            gridView.adapter = galeria_adapter(this)
        }
        gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val i = Intent(applicationContext, visor_activity::class.java)

            i.putExtra("id", position)
            i.putExtra("option",intent.getIntExtra("option",1))

            startActivity(i)
        }

    }
}