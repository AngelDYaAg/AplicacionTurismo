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
            R.drawable.el_indio,
            R.drawable.guitarra,
            R.drawable.iglesia_guaranda,
            R.drawable.museo_guitarra,
            R.drawable.parque,
            R.drawable.salinas_guaranda,
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
