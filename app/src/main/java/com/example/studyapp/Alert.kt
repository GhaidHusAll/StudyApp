package com.example.studyapp

import android.app.Activity
import android.content.Context
import android.content.DialogInterface
import android.view.View
import androidx.appcompat.app.AlertDialog

class Alert {
    fun customAlert(arrayData:ArrayList<String>,theActivity: Context){
        val dialogBuilder = AlertDialog.Builder(theActivity)
        dialogBuilder.setMessage(arrayData[1])

            .setNegativeButton("Close", DialogInterface.OnClickListener {
                    dialog, _ -> dialog.cancel()
            })
        val alert = dialogBuilder.create()
        alert.setTitle(arrayData[0])
        alert.show()
    }
}