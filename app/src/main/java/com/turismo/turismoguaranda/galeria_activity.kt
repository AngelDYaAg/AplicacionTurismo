package com.turismo.turismoguaranda

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import com.turismo.turismoguaranda.adaptadores.galeria_adapter



class galeria_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_galeria_activity)
        val gridView = findViewById<View>(R.id.grid_view_imagenes) as GridView
        gridView.adapter = galeria_adapter(this)
        gridView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val i = Intent(applicationContext, visor_activity::class.java)

            i.putExtra("id", position)

            startActivity(i)
        }

    }
}

/*gridViewImagenes.setOnClickListener(AdapterView.OnItemClickListener(){
    fun onItemClick(adapterView: AdapterView, view: View, i: Int, l: Long){
        val intent = Intent(this,visor_activity::class.java);
        intent.putExtra(idimagen,i);
        startActivity(intent);
    }
});*/