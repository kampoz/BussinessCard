package com.kamilpoznakowski.businesscard

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    val database = FirebaseDatabase.getInstance()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupNavController()

        trainingAddingObjectsToFirebase()
    }

    private fun setupNavController() {
        findNavController(R.id.nav_host_fragment).apply {
            addOnDestinationChangedListener { _, _, _ ->

            }
            bottom_nav.setupWithNavController(this)
        }
    }

    private fun trainingAddingObjectsToFirebase() {
        val database = FirebaseDatabase.getInstance()
        val myRef2 = database.getReference("cards")
        myRef2.setValue(Card("123477", "Nice Name"))
        myRef2.push()
        val myRef3 = database.getReference("cards2")
        myRef3.setValue(Card("123444", "Ugly Name"))
        myRef3.push()
    }
}


data class Card(
    val id: String,
    val name: String
)