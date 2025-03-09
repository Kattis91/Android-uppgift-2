package com.example.android_uppgift_2

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class ViewModel : ViewModel() {

    var count by mutableStateOf(0)
        private set

    fun increment() {
        count += 1
    }
}
