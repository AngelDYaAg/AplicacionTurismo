package com.turismo.turismoguaranda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle;
import com.google.android.gms.maps.OnStreetViewPanoramaReadyCallback
import com.google.android.gms.maps.StreetViewPanorama
import com.google.android.gms.maps.SupportStreetViewPanoramaFragment
import com.google.android.gms.maps.model.LatLng


class streetview_activity : AppCompatActivity(), OnStreetViewPanoramaReadyCallback {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_streetview_activity)
        val streetViewPanoramaFragment =
            supportFragmentManager
                .findFragmentById(R.id.streetViewMap) as SupportStreetViewPanoramaFragment?
        streetViewPanoramaFragment?.getStreetViewPanoramaAsync(this)
        }

    override fun onStreetViewPanoramaReady(p0: StreetViewPanorama?) {
        p0?.setPosition(LatLng(-33.87365, 151.20689))
    }
}