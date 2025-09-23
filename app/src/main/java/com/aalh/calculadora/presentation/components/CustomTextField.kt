package com.aalh.calculadora.presentation.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.aalh.calculadora.ui.theme.CalculadoraTheme


@Composable
fun CustomTextField(
    modifier: Modifier = Modifier,
    text: String,

) {
    TextField(text, onValueChange = {}, modifier = modifier.fillMaxWidth())
}

@Preview
@Composable
fun CustomTextFieldPreview() {
    CalculadoraTheme {
        CustomTextField(text = "Hola")
    }
}