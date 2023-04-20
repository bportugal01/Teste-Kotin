package com.example.amor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.amor.ui.theme.AmorTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Alignment

import androidx.compose.ui.res.painterResource

import androidx.compose.ui.unit.dp

@Composable
fun AmorScreen() {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "Amor",
                style = MaterialTheme.typography.h4
            )
            Spacer(modifier = Modifier.height(32.dp))
            Image(
                painter = painterResource(id = R.drawable.heart),
                contentDescription = "Heart",
                modifier = Modifier
                    .width(200.dp)
                    .height(200.dp)
            )
            Spacer(modifier = Modifier.height(32.dp))
            Text(
                text = "O amor é um sentimento que une as pessoas e é capaz de transformar vidas. É a expressão mais sincera de carinho, cuidado e respeito que alguém pode oferecer a outra pessoa. Celebre o amor todos os dias!",
                style = MaterialTheme.typography.body1,
                modifier = Modifier.padding(horizontal = 16.dp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AmorTheme {
        AmorScreen()
    }
}