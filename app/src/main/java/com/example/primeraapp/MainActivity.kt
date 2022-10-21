package com.example.primeraapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.FirebaseDatabase


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Toast.makeText(,MainActivity "hola", Toast.LENGTH_SHORT).show()
        insertar():

    }
     public void insertar(){

         // Write a message to the database
         // Write a message to the database
         val database = FirebaseDatabase.getInstance()
         val myRef = database.getReference("message")

         myRef.setValue("Hello, World!")
     }
}
