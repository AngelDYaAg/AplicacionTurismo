package com.turismo.turismoguaranda.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;

import com.turismo.turismoguaranda.R;

public class galeria_adapter extends BaseAdapter {
    private Context mContext;
    public int[] imagenesArray = {
            //R.drawable.camping_indio_guaranga,
            R.drawable.catedral_central,
            //R.drawable.colina_cruz_loma,
            //R.drawable.colina_loma_de_guaranda,
            //R.drawable.colina_san_bartolo,
            //R.drawable.colina_san_bartolo_2,
            //R.drawable.colina_san_jacinto,
            //R.drawable.colina_talalag,
            //R.drawable.colina_talalag_2,
            //R.drawable.colina_tililag_1,
            R.drawable.estatua_de_simon_bolivar,
            R.drawable.guaranda_1,
            //R.drawable.guaranda_2,
            //R.drawable.guarnada_5,
            R.drawable.indio_guaranga_1,
            //R.drawable.indio_guaranga_3,
            R.drawable.la_guitarra,
            //R.drawable.la_guitarra_2,
            R.drawable.parque_el_libertador_1,
            //R.drawable.parque_el_libertador_2,
            //R.drawable.parque_el_libertador_3,
            //R.drawable.parque_el_libertador_4,
            //R.drawable.parque_el_libertador_5,
            //R.drawable.parque_el_libertador_6,
            R.drawable.plaza_del_carnaval_1,
            //R.drawable.plaza_del_carnaval_2,
            //R.drawable.plaza_del_carnaval_3,
            //R.drawable.plaza_del_carnaval_4,
            //R.drawable.plaza_del_carnaval_5,
    };

    public galeria_adapter(Context c){
        mContext = c;
    }

    @Override
    public int getCount() {
        return imagenesArray.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView;

        if (convertView==null){
            imageView = new ImageView(mContext);
            imageView.setLayoutParams(new GridView.LayoutParams(230,230));
            imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            imageView.setPadding(8,8,8,8);
        }
        else
        {
            imageView = (ImageView) convertView;
        }
        imageView.setImageResource(imagenesArray[position]);
        return imageView;

    }
}
