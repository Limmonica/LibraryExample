package com.example.mylibrary

import android.content.Context
import android.widget.Toast

class ToasterMessage {

    fun showToastMessage(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}