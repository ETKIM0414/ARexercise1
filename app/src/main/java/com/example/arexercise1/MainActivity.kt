package com.example.arexercise1

import androidx.appcompat.app.AppCompatActivity
import com.google.ar.sceneform.ux.ArFragment
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        (supportFragmentManager.findFragmentById(R.id.arFragment) as ArFragment)
            .setOnTapPlaneGlbModel("Cappuccino_cup.glb")
    }

}
//AndroidManifest.xml
// <uses-permission android:name="android.permission.CAMERA" />
// <uses-feature android:name="android.hardware.camera.ar" />
// <application> ...
//<meta-data android:name="com.google.ar.core" android:value="required" /> 추가

//layout - activity.xml
//build.gradle (:app)
