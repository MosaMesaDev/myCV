package com.mosamesadev.MyCV

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mosamesadev.myCV.R
import kotlinx.android.synthetic.main.activity_astrologer.*


class Astrologer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_astrologer)

        BtnAstrologerSplashScreen.setOnClickListener {
            val intent = Intent(this, AstrologerSplashScreenActivity::class.java)
            startActivity(intent)
        }

    }

}