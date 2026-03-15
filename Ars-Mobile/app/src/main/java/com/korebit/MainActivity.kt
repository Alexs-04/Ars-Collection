package com.korebit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExampleForColum()
        }
    }
}

@Composable
fun ExampleForColum(){
    ExampleForRow()
    Column (modifier = Modifier.fillMaxSize().padding(top = 55.dp)){
        Text("Hola")
        Text("Este es un ejemplo de una función composable")
    }
}

@Composable
@Preview
fun PreviewExampleForColum(){
    ExampleForColum()
}

@Composable
fun ExampleForRow(){
    Row (modifier = Modifier.fillMaxSize().padding(top = 35.dp)){
        Text("Estas en la fila")
    }
}