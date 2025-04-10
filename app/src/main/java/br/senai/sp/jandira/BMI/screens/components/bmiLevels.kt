package br.senai.sp.jandira.BMI.screens.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import br.senai.sp.jandira.BMI.screens.HomeScreen

@Composable
fun BmiLevels(modifier: Modifier = Modifier) {
    Row {
        Card(
            modifier = Modifier
                .size(20.dp),
            shape = CircleShape
        ) {  }
        Spacer(modifier = Modifier.width(8.dp))
        Card(
            modifier = Modifier
                .fillMaxSize(),
            shape = RoundedCornerShape(8.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Absolute.SpaceBetween
            ){
                Text(text = "Left text")
                Text(text = "Right text")
            }
        }

    }
}

@Preview(showSystemUi = true)
@Composable
private fun BmiLevelsPreview() {

    BmiLevels()
}