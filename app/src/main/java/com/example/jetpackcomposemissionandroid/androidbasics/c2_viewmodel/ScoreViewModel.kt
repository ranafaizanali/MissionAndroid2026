package com.example.jetpackcomposemissionandroid.androidbasics.c2_viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ScoreViewModel : ViewModel() {

    var score by mutableStateOf(0)
        private set

    fun increment(){
        score++
    }

    fun decrement(){
        score--
    }

}