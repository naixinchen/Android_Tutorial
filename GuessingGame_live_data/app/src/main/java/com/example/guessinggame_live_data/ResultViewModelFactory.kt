package com.example.guessinggame_live_data

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import java.lang.IllegalStateException

class ResultViewModelFactory(private val finalResult :String) : ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(ResultViewModel::class.java))
            return ResultViewModel(finalResult) as T
        throw IllegalStateException("Unknown ViewModel")
    }
}