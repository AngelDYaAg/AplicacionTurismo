package com.turismo.turismoguaranda.adaptadores;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

import com.turismo.turismoguaranda.R;

public class galeria_rustica_adaptador extends BaseAdapter {
    private Context mContext;
    public int[] imagenesArray = {
            R.drawable.rustica_foto1,
            R.drawable.rustica_foto2,
            R.drawable.rustica_foto3,
            R.drawable.rustica_foto4,
            R.drawable.rustica_foto5,
            R.drawable.rustica_foto6,
            R.drawable.rustica_foto8,
            R.drawable.rustica_foto9,
    };


    public galeria_rustica_adaptador(Context c){
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
