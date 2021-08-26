package com.appetiser.stepsindicatorviewdemo

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.appetiser.stepsindicatorview.StepsIndicatorView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val progress = findViewById<StepsIndicatorView>(R.id.roundedStepIndicatorView)

        findViewById<Button>(R.id.btnPrev)
            .setOnClickListener {
                progress.animateBack()
            }

        findViewById<Button>(R.id.btnNext)
            .setOnClickListener {
                progress.animateNext()
            }

        findViewById<Button>(R.id.btnChangeTotal)
            .setOnClickListener {
                progress.setTotalProgressCount(6)
            }

        findViewById<Button>(R.id.btnChangeProgress)
            .setOnClickListener {
                progress.setProgressCount(3)
            }
    }
}
