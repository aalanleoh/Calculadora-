package com.aalh.calculadora.presentation.calculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aalh.calculadora.presentation.components.CustomButton
import com.aalh.calculadora.ui.theme.CalculadoraTheme

@Composable
fun Calculator(viewModel: CalculatorViewModel) {
    val display by viewModel.display.collectAsState()
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 5.dp, vertical = 10.dp)
            .background(Color.Yellow),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            text = display,
            style = MaterialTheme.typography.displayLarge,
            modifier = Modifier
                .fillMaxWidth()
                .weight(2f),
            textAlign = TextAlign.End,
            maxLines = 2
        )
        Row(modifier = Modifier
            .fillMaxWidth()
            .weight(1f)) {
            Spacer(modifier = Modifier.weight(3f))
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "Borrar",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
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
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = { viewModel.CleanDisplay() }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "()",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "%",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "÷",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = { viewModel.SelectedOperation("÷") }
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
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(7) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "8",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(8) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "9",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(9) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "X",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = { viewModel.SelectedOperation("X") }
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
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(4) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "5",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(5) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "6",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(6) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "-",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = { viewModel.SelectedOperation("-") }
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
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(1) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "2",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(2) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "3",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(3) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "+",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = { viewModel.SelectedOperation("+") }
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
                text = "+",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "0",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.NumberClicked(0) }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = ".",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = { viewModel.point() }
            )
            CustomButton(
                modifier = Modifier
                    .weight(1f),
                text = "=",
                buttonColor = Color.Green,
                textColor = Color.White,
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