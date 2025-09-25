package com.aalh.calculadora.presentation.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aalh.calculadora.ui.theme.CalculadoraTheme

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    textColor: Color,
    buttonColor: Color,
    onTap: () -> Unit = {}
) {
    Button(
        modifier = modifier
            .fillMaxSize()
            .padding(5.dp),
        shape = MaterialTheme.shapes.large,
        colors = ButtonDefaults.buttonColors(containerColor = buttonColor),
        onClick = {
            onTap()
        }
    ) {
        Text(
            text, modifier = Modifier,
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.displaySmall,
            color = textColor
        )
    }
}

@Preview
@Composable
private fun CustomButtonPrevie() {
    CalculadoraTheme {
        CustomButton(
            text = "+",
            textColor = Color.Black,
            buttonColor = Color.Green
        )
    }
}