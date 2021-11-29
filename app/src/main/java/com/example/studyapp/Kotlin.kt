package com.example.studyapp

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent




class Kotlin : AppCompatActivity() {
    lateinit var kotlinArray : ArrayList<ArrayList<String>>
    lateinit var kotlinRV : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        kotlinArray = arrayListOf()
        setValues()
        kotlinRV = findViewById(R.id.rvKotlin)
        kotlinRV.adapter = KotlinAdapter(kotlinArray, this)
        kotlinRV.layoutManager = LinearLayoutManager(this)


    }
    // this event will enable the back
    // function to the button on press
    override fun onContextItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                finish()
                return true
            }
        }
        return super.onContextItemSelected(item)
    }
    private fun setValues(){
        kotlinArray.add(arrayListOf("Var & Val","Declaring Variables."))
        kotlinArray.add(arrayListOf("User Input","Getting User Input."))
        kotlinArray.add(arrayListOf("Strings","String concatenation, interpolation, and methods."))
        kotlinArray.add(arrayListOf("Data Types","Understand data types"))
        kotlinArray.add(arrayListOf("Basic Operations","Performing math operation in Kotlin"))
        kotlinArray.add(arrayListOf("If statements","if - else -else if"))
        kotlinArray.add(arrayListOf("Try/Catch","error handling method - always remember to handle everything to avoid crash"))
        kotlinArray.add(arrayListOf("While&For loops","to make coding easier (for loops we know how many loops it will take)" +
                "(while loops we don't know it depends on condition)"))
        kotlinArray.add(arrayListOf("WHEN statement" , "block of code to perform specific/single condition"))
        kotlinArray.add(arrayListOf("Random Number","using Random() method to generate random number from-until of just 0-until\n" +
                " while the last number will not be count "))
        kotlinArray.add(arrayListOf("Functions","isolated chunks of code \n" +
                "Arguments - in the function declaration - can have fixed argument value\n" +
                "Parameters - in the function calls \n" +
                "return -  return values from the function"))
        kotlinArray.add(arrayListOf("List and Array and ArrayList and 2DArrayList","collections fo data \n" +
                "list (immutable/fixed size)\n" +
                "array(mutable/fixed size)\n" +
                "arraylist(not fixed size)\n" +
                "2DArraylist (list within list)\n" +
                "some of the methods\n" +
                "(.add/.remove / .sort/.sum/.size/[i]to access)"))

    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            android.R.id.home -> {
                val intent = Intent(this, MainActivity::class.java)
                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}


