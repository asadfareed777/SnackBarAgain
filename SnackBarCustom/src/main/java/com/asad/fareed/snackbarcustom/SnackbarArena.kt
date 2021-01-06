package com.asad.fareed.snackbarcustom

import android.graphics.Color
import android.view.View
import com.google.android.material.snackbar.Snackbar

public class SnackbarArena {

    companion object{
         fun showMessage(view:View,text:String){
            Snackbar.make(view,text,3000).setBackgroundTint(Color.YELLOW).setTextColor(Color.BLACK)
        }
    }
}