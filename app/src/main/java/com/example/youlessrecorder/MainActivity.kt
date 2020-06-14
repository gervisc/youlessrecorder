package com.example.youlessrecorder

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ToggleButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity()

{

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val intent = Intent(this, recorder::class.java)
        switch2.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
                // The switch is enabled/checked
                startService(intent)

            } else {
                // The switch is disabled
                MainActivity().stopService(intent)

            }
        }
    }


}

