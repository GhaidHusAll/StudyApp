package com.example.studyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Android : AppCompatActivity() {
    private lateinit var androidArray : ArrayList<ArrayList<String>>
    lateinit var androidRV : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        androidArray = arrayListOf()
        setValues()
        androidRV = findViewById(R.id.rvAndroid)
        androidRV.adapter = AndroidAdapter(androidArray,this)
        androidRV.layoutManager = LinearLayoutManager(this)
    }
    fun setValues(){
        androidArray.add(arrayListOf("Gradle/SDK","Manifest -> Alaws wifi/GPS features\n" +
                "Values 1-> Color - set application colors\n" +
                "       2->String - set Application Strings\n" +
                "       3-> Themes - dark/light mode color changes"))
        androidArray.add(arrayListOf("Resource Files/layout","XML the view screen three different display (design / code / spilt)\n" +
                "drag-drop ui elements\n" +
                "or write in the code display \n" +
                "Margin- the spacae outside the view\n" +
                "Padding - the space inside the view"))
        androidArray.add(arrayListOf("app/java/MainActivity","the code part to control the view part\n" +
                "onCreate is the main function it will run when the application starts\n" +
                "print/println - shows in run\n" +
                "Log.d(class name , message) - showes in debug\n" +
                "findById- to specified/access each elements by unique id\n" +
                "R(for resource).id.(the element's id)"))
        androidArray.add(arrayListOf("RecycleView","allocates memory for what is visible"))
        androidArray.add(arrayListOf("Adapter","intermediate between data and recycle view"))
        androidArray.add(arrayListOf("onCreateViewHolder","links XML file to data / to tell where is item layout file"))
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