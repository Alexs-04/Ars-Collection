package com.korebit

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class ExampleForBox {

    @Preview
    @Composable
    fun Example() {
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(16.dp).background(color = Color.Black),
            ) {
            Text(
                text = "Hola estás en el techo del box",
                modifier = Modifier.align(Alignment.TopStart),
                color = Color.Magenta
            )
            Text(
                text = "Ahora estas dentro del piso del box",
                modifier = Modifier.align(Alignment.BottomEnd),
                color = Color.Blue
            )

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_foreground),
                modifier = Modifier
                    .align(Alignment.Center)
                    .fillMaxSize(),
                contentDescription = "Esta imagen es de prueba"
            )

            Text(
                text = "Estas en el centro del box",
                modifier = Modifier.align(Alignment.Center),
                color = Color.Red,
                fontSize = 24.sp,
                FontStyle.Italic
            )
        }
    }
}