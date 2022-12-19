package com.example.examenuf1

import android.content.ActivityNotFoundException
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.examenuf1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val entrarButton = binding.buttonEntrar
        val editTextAdmin = binding.editTextPonAdmin

        entrarButton.setOnClickListener {
            if (editTextAdmin.text.trim().toString() == "admin"){
                Toast.makeText(this@MainActivity, "Login Successful!", Toast.LENGTH_LONG).show()
                val menuActivityIntent = Intent(this, MenuActivity::class.java)

                try {
                    startActivity(menuActivityIntent)
                }catch (e: ActivityNotFoundException){
                    e.printStackTrace()
                }
            }else{
                Toast.makeText(this@MainActivity, "Something went wrong", Toast.LENGTH_LONG).show()
            }
        }
    }
}