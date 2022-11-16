package com.example.a7minuteworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a7minuteworkout.databinding.ActivityExerciseBinding

class ExerciseActivity : AppCompatActivity() {
    private var binding: ActivityExerciseBinding? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExerciseBinding.inflate(layoutInflater)
        setContentView(binding!!.root)

        /// we put our toolbar as the action bar from here
        setSupportActionBar(binding!!.toolbar)

        if(supportActionBar != null){
            /// we can set text to the toolbar, else it will show the app name
//            supportActionBar!!.title = "Random text"

            /// we then enable the back button in the toolbar
            supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        }

        binding!!.toolbar.setNavigationOnClickListener{
            /// we then add functionality to the back button in the toolbar
            onBackPressed()
        }
    }
}