package com.example.ciceronitest

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SecondViewModel @Inject constructor(
    private val application: Router
)  : ViewModel() {

    fun onBtnSecondClicker() {
        application.navigateTo(Screens.TestScreen)
    }
}