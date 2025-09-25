package com.aalh.calculadora.presentation.calculator

import androidx.lifecycle.ViewModel
import com.aalh.calculadora.domain.model.Calculator
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CalculatorViewModel : ViewModel() {
    private val calculator = Calculator()

    private val _display = MutableStateFlow("0")
    val display: StateFlow<String> = _display

    private val _historicalDisplay = MutableStateFlow("")
    val historicalDisplay: StateFlow<String> = _historicalDisplay

    private var valorActual: Double = 0.0
    private var operationPendent: ((Double, Double) -> Double)? = null

    fun numberClicked(number: Int) {
        if (_display.value == "0") {
            _display.value = number.toString()
        } else {
            _display.value += number.toString()
        }
        _historicalDisplay.value += number.toString()
    }

    fun cleanDisplay() {
        _display.value = "0"
        _historicalDisplay.value = ""
        valorActual = 0.0
    }

    fun selectedOperation(operation: String) {
        valorActual = _display.value.toDoubleOrNull() ?: 0.0
        _display.value = "0"
        operationPendent = when (operation) {
            "+" -> {
                _historicalDisplay.value += "+"
                calculator::add
            }

            "-" -> {
                _historicalDisplay.value += "-"
                calculator::subtract
            }

            "x" -> {
                _historicalDisplay.value += "x"
                calculator::multiply
            }

            "÷" -> {
                _historicalDisplay.value += "÷"
                calculator::divide
            }

            "%" -> {
                _historicalDisplay.value += "%"
                { a, _ -> calculator.percentage(a, 100.0) }
            }

            else -> null
        }
    }

    fun onEqualsClick() {
        val segundoValor = if (_historicalDisplay.value.endsWith("%")) {
            100.0
        } else {
            _display.value.toDoubleOrNull() ?: 0.0
        }
        operationPendent?.let {
            val resultant = it(valorActual, segundoValor)
            if (resultant % 1.0 == 0.0) {
                _display.value = resultant.toInt().toString()
                operationPendent = null
            } else {
                _display.value = resultant.toString()
                operationPendent = null
            }
        }
    }

    fun point() {
        if (!_display.value.contains(".")) {
            _display.value = _display.value + "."
        }
    }

    fun deleteNumber() {
        _display.value = _display.value.dropLast(1)
    }

}