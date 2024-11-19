package com.example.sessions

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            val btnLogin= findViewById<Button>(R.id.btnLogin)
            btnLogin.setOnClickListener{

            val userName =findViewById<EditText>(R.id.etUsername).text.toString()
                Toast.makeText(this, "Welcome $userName" , Toast.LENGTH_LONG).show()
            }

            insets

        }

    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu1, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.abt -> {
                Toast.makeText(this, "About Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.set -> {
                Toast.makeText(this, "Settings Selected", Toast.LENGTH_SHORT).show()
                true
            }
            R.id.sOut -> {
                Toast.makeText(this, "Sign Out Selected", Toast.LENGTH_SHORT).show()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }


}