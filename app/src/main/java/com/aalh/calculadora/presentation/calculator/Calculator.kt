package com.aalh.calculadora.presentation.calculator

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.aalh.calculadora.presentation.components.CustomButton
import com.aalh.calculadora.presentation.components.CustomTextField

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Calculator() {
    Column(modifier = Modifier.fillMaxSize()) {
        Spacer(modifier = Modifier.weight(0.2f))
        Row(modifier = Modifier.fillMaxWidth()) {
            CustomButton(
                modifier = Modifier,
                text = "C",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "()",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "%",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "÷",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
        }

        Row(modifier = Modifier) {
            CustomButton(
                modifier = Modifier,
                text = "7",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "8",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "9",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "X",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
        }
        Row(modifier = Modifier) {
            CustomButton(
                modifier = Modifier,
                text = "4",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "5",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "6",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "-",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
        }
        Row(modifier = Modifier) {
            CustomButton(
                modifier = Modifier,
                text = "1",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "2",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "3",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "+",
                buttonColor = Color.LightGray,
                textColor = Color.Black,
                onTap = {}
            )
        }
        Row(modifier = Modifier) {
            CustomButton(
                modifier = Modifier,
                text = "+",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "0",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = ".",
                buttonColor = Color.Gray,
                textColor = Color.White,
                onTap = {}
            )
            CustomButton(
                modifier = Modifier,
                text = "=",
                buttonColor = Color.Green,
                textColor = Color.White,
                onTap = {}
            )
        }
    }
}