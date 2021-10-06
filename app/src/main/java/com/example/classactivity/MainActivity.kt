package com.example.classactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var text: EditText
    lateinit var S: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        text = findViewById(R.id.textView)

    }

    fun dialog(view: View) {
        var at = AlertDialog.Builder(this)
        at.setMessage("hello")
        at.setTitle("good morning")
        at.setPositiveButton("somename", null)
        at.show()
    }

    fun goo(view: View) {
        S = text.text.toString()
        var info = Intent(this, MainActivity2::class.java)
        info.putExtra("faten", text.toString())
        startActivity(info)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    fun minuto(view: View) {
        Toast.makeText(applicationContext, "click", Toast.LENGTH_SHORT).show()
    }
}