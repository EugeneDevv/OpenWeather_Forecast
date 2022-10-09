package com.eugenedevv.openweatherforecast.presentation.extension

import android.view.View
import com.google.android.material.snackbar.Snackbar

/**
 * Created by EugeneDevv on 09/10/2022.
 */
fun View.snackBar(message: String) {
    Snackbar.make(this, message, Snackbar.LENGTH_SHORT).show()
}

fun View.show(): View {
    if (visibility != View.VISIBLE) {
        visibility = View.VISIBLE
    }
    return this
}

fun View.hide(): View {
    if (visibility != View.GONE) {
        visibility = View.GONE
    }
    return this
}