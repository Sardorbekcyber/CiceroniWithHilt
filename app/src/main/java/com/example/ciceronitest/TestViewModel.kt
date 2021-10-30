package com.example.ciceronitest

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TestViewModel @Inject constructor(
    private val application: TestApplication
) : ViewModel() {

    fun onBtnClicked() {
        application.router.navigateTo(Screens.SecondScreen)
    }

}