package com.aalh.calculadora.domain.model

class Calculator {
    fun add(a: Double, b: Double): Double = a + b
    fun subtract(a: Double, b: Double): Double = a - b
    fun multiply(a: Double, b: Double): Double = a * b
    fun divide(a: Double, b: Double): Double = if (b != 0.0) a / b else Double.NaN
    fun percentage(a: Double, b: Double): Double = a % b
}