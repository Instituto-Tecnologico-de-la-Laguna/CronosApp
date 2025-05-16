package com.example.cronoapps.viewModels

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.runtime.getValue
import androidx.lifecycle.ViewModel
import com.example.cronoapps.state.CronoState
import kotlinx.coroutines.Job

class CronometroViewModel:ViewModel() {
    var state by mutableStateOf(CronoState())
        private set
    var cronoJob by mutableStateOf<Job?>(null)
        private set
    var tiempo by mutableStateOf(0L)
    fun onValue(value: String){
        state = state.copy(
            title = value
        )
    }
}