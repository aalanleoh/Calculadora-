package com.aalh.calculadora.presentation.calculator

import androidx.lifecycle.ViewModel
import com.aalh.calculadora.domain.model.Calculator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CalculatorViewModel : ViewModel() {
    private val calculator = Calculator()

    private val _display = MutableStateFlow("0")
    val display: StateFlow<String> = _display

    private var valorActual: Double = 0.0
    private var operacionPendiente: ((Double, Double) -> Double)? = null

    fun NumberClicked(number: Int) {
        if (_display.value == "0") {
            _display.value = number.toString()
        } else {
            _display.value += number.toString()
        }
    }

    fun CleanDisplay() {
        _display.value = "0"
        valorActual = 0.0
    }

    fun SelectedOperation(operation: String) {
        valorActual = _display.value.toDoubleOrNull() ?: 0.0
        _display.value = "0"
        operacionPendiente = when (operation) {
            "+" -> calculator::add
            "-" -> calculator::subtract
            "X" -> calculator::multiply
            "÷" -> calculator::divide
            else -> null
        }
    }

    fun onEqualsClick(){
        val segundoValor = _display.value.toDoubleOrNull()?: 0.0
        operacionPendiente?.let {
            val resultado = it(valorActual, segundoValor)
            _display.value = resultado.toString()
            operacionPendiente = null
        }
    }

    fun point(){
        if(!_display.value.contains(".")){
            _display.value = _display.value + "."
        }
    }

    fun deleteNumber(){
        _display.value = _display.value.dropLast(1)
    }

}