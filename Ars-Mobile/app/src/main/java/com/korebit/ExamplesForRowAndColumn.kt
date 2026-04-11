package com.korebit

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ExamplesForRowAndColumn {
    @Composable
    fun ExampleForColum() {
        ExampleForRow()
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(top = 55.dp)) {
            Text("Hola")
            Text("Este es un ejemplo de una función composable")
            Spacer(modifier = Modifier.height(35.dp))
            Row {
                Text("Esta es otra fila")
            }
        }
    }

    @Composable
    @Preview
    fun PreviewExampleForColum() {
        ExampleForColum()
    }

    @Composable
    fun ExampleForRow() {
        Row(modifier = Modifier
            .fillMaxSize()
            .padding(top = 20.dp)) {
            Text("Estás en la fila")
        }
    }
}