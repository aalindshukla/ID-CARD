package com.example.id_card

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button



class MainActivity : AppCompatActivity() {



   // val binding: ActivityMainBinding = ActivityMainBinding.inflate(getLayoutInflater())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnedit: Button = findViewById(R.id.edit)
      //  val btnidmaker: Button = findViewById(R.id.createid)

        // Setting onClick Listener for the button
        btnedit.setOnClickListener{
            val intent = Intent(this, edit::class.java)
            startActivity(intent)
            finish()
        }

//        btnidmaker.setOnClickListener{
//            val intent = Intent(this, edit::class.java)
//            startActivity(intent)
//            finish()
//        }

}
    //Tried changing textview(Original text of ID CARD) as the edited text (which is on the 2nd page of the app)....

//    fun process(v:View){
//       // val ogreg = findViewById(R.id.regno)
//        val reno = findViewById<EditText>(R.id.editregno);
//       // ogreg.text = reno
//        val name = findViewById<EditText>(R.id.editname);
//        val brc = findViewById<EditText>(R.id.editbranch);
//        val blgr = findViewById<EditText>(R.id.editbloodgrp);
//        val add = findViewById<EditText>(R.id.editaddress);
//        val emer = findViewById<EditText>(R.id.editemgcontact);
//
//    }

}