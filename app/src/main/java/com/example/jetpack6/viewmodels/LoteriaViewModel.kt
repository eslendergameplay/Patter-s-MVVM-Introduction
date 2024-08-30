package com.example.jetpack6.viewmodels

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class LoteriaViewModel : ViewModel() {
    private val _lottoNumbers = mutableStateOf(emptyList<Int>())
    val lottoNumbers: State<List<Int>> = _lottoNumbers

    fun generarLottoNumbers(){
        _lottoNumbers.value = (1..60).shuffled().take(6).sorted()
    }
}