package com.turismo.turismoguaranda

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog
import androidx.core.app.ActivityCompat
import com.google.zxing.Result
import me.dm7.barcodescanner.zxing.ZXingScannerView

class scanner_activity : AppCompatActivity(), ZXingScannerView.ResultHandler {

    private lateinit var mScannerView: ZXingScannerView
    private var CAMERA_PERMISSION = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scanner_activity)
    }

    fun onclick_scanner (view: View){
        if (ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA) != PackageManager.PERMISSION_GRANTED)
            ActivityCompat.requestPermissions(this, arrayOf(android.Manifest.permission.CAMERA),CAMERA_PERMISSION)
        if (ActivityCompat.checkSelfPermission(this,android.Manifest.permission.CAMERA) == PackageManager.PERMISSION_GRANTED){
            mScannerView = ZXingScannerView (this)
            setContentView(mScannerView)
            mScannerView.setResultHandler(this)
            mScannerView.startCamera()
        }
    }

    override fun handleResult(rawResult: Result) {
        val builder: AlertDialog.Builder = AlertDialog.Builder(this)
        builder.setTitle("resultado del scanner")
        builder.setMessage(rawResult.text)
        //val alertDialog: AlertDialog = builder.create()
        //alertDialog.show()

        //mScannerView.resumeCameraPreview(this)
        val intentUri = Uri.parse(rawResult.text)
        val intent = Intent(Intent.ACTION_VIEW, intentUri)
        startActivity(intent)
    }
}