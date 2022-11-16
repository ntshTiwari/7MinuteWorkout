package com.example.a7minuteworkout

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.FrameLayout
import com.example.a7minuteworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    /// we can mark it as lateinit if we know it will be populated by the time it is needed
//    private lateinit var binding:ActivityMainBinding?

    private var binding:ActivityMainBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val rootView = binding!!.root
        setContentView(rootView)

//        val startButton = findViewById<FrameLayout>(R.id.startButton)
        binding!!.startButton.setOnClickListener{
            val exerciseIntent = Intent(this, ExerciseActivity::class.java)
            startActivity(exerciseIntent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        binding = null
    }
}