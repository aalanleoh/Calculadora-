package com.aalh.calculadora.presentation.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import com.aalh.calculadora.presentation.components.CustomButton
import com.aalh.calculadora.ui.theme.CalculadoraTheme

@Composable
fun Calculator(viewModel: CalculatorViewModel) {
    val display by viewModel.display.collectAsState()
    val historicalDisplay by viewModel.historicalDisplay.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(MaterialTheme.colorScheme.surfaceContainerLow),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = historicalDisplay,
            style = MaterialTheme.typography.displaySmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant,
            modifier = Modifier.fillMaxWidth()
                .weight(1f),
            textAlign = TextAlign.End,
            maxLines = 1
        )
        Text(
            text = display,
            style = MaterialTheme.typography.displayLarge,
            color = MaterialTheme.colorScheme.onSurface,
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            textAlign = TextAlign.End,
            maxLines = 1
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
        ) {
            Spacer(modifier = Modifier.weight(3f))
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "⌫",
                buttonColor = MaterialTheme.colorScheme.onSecondaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.deleteNumber() }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "C",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = MaterialTheme.colorScheme.onSurface,
                onTap = { viewModel.cleanDisplay() }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "()",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = Color.Black,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "%",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = Color.Black,
                onTap = {viewModel.selectedOperation("%")}
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "÷",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = Color.Black,
                onTap = { viewModel.selectedOperation("÷") }
            )
        }

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "7",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(7) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "8",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(8) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "9",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(9) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "x",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = Color.Black,
                onTap = { viewModel.selectedOperation("x") }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "4",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(4) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "5",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(5) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "6",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(6) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "-",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = Color.Black,
                onTap = { viewModel.selectedOperation("-") }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "1",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(1) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "2",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(2) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "3",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(3) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "+",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = Color.Black,
                onTap = { viewModel.selectedOperation("+") }
            )
        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "±",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = MaterialTheme.colorScheme.onSurface,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "0",
                buttonColor = MaterialTheme.colorScheme.primaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.numberClicked(0) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = ".",
                buttonColor = MaterialTheme.colorScheme.inversePrimary,
                textColor = MaterialTheme.colorScheme.onSurface,
                onTap = { viewModel.point() }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "=",
                buttonColor = MaterialTheme.colorScheme.onSecondaryContainer,
                textColor = MaterialTheme.colorScheme.surfaceBright,
                onTap = { viewModel.onEqualsClick() }
            )
        }
    }
}

@Preview
@Composable
fun PreviewCalculator() {
    CalculadoraTheme {
        Calculator(CalculatorViewModel())
    }
}