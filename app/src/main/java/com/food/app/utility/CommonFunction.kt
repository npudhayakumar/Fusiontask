package com.food.app.utility

import android.app.Activity
import android.app.Application
import android.content.Intent
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.gson.Gson
import timber.log.Timber

class CommonFunction  constructor(private val application: Application) {






    fun hideKeyboard(activity: Activity) {
        val imm = activity.getSystemService(Activity.INPUT_METHOD_SERVICE) as InputMethodManager
        //Find the currently focused view, so we can grab the correct window token from it.
        var view = activity.currentFocus
        //If no view currently has focus, create a new one, just so we can grab a window token from it
        if (view == null) {
            view = View(activity)
        }
        imm.hideSoftInputFromWindow(view.windowToken, 0)
    }

    fun commonToast(value: String) {
        try {
            Toast.makeText(application, value, Toast.LENGTH_LONG).show()
        } catch (e: Exception) {
            Timber.e(e)
        }
    }
    fun setTextView(value: String,view: View) {
        try {
            when(view){
                is EditText ->{
                    view.setText(value)
                }
                is TextView ->{
                    view.setText(value)
                }
            }
        } catch (e: Exception) {
            Timber.e(e)
        }
    }

    fun setTntent(cObjection: Class<*>, isFrom: Int, activity: Activity) {
        activity.startActivity(Intent(activity, cObjection))
        when (isFrom) {
            1 -> {
                // TODO just no need to finish

            }
            2 ->
                // TODO just finishing the single activity
                activity.finish()
            3 ->
                // TODO  finishing All previous activity
                activity.finishAffinity()
        }// TODO Not finishing

    }

    fun modelToGson(cObjection: Any): String? {
        val gson = Gson()
        val Json = gson.toJson(cObjection)  //see firstly above above
        return Json
    }

    fun gsonToModel(value: String, cObjection: Class<*>): Any? {
        val gson = Gson()
        return gson.fromJson(value, cObjection)

    }
    fun visibleState(view: View, isvisible :Boolean){
        if(isvisible){
            if(view.visibility == View.GONE){
                view.visibility = View.VISIBLE
            }
        }else{
            if(view.visibility == View.VISIBLE){
                view.visibility = View.GONE
            }
        }
    }

}