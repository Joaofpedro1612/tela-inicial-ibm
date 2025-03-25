

package br.senai.sp.jandira.BMI.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import br.senai.sp.jandira.BMI.R

@Composable
fun  BMIResultScreen(controleDeNavegacao: NavHostController?) {

    var nomeState = remember {
        mutableStateOf(value = "")
    }

    var nome = ""

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                brush = Brush.linearGradient(
                    listOf(
                        Color(0xFF2838A4),
                        Color(0xFF6F77D2)

                    )
                )
            )
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = stringResource(R.string.Conclusion),
                fontSize = 38.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp,
                        vertical = 20.dp)
            )
            Card(
                modifier = Modifier
                    .fillMaxSize()
                    .height(40.dp),
                shape = RoundedCornerShape(
                    topStart = 48.dp,
                    topEnd = 48.dp
                )

            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(700.dp)
                        .padding(top = 15.dp),
                    horizontalAlignment = Alignment.CenterHorizontally

                ) {
                    Card(
                        modifier = Modifier
                            .size(150.dp),
                        shape = CircleShape,
                                border = BorderStroke(
                            width = 6.dp,
                            brush = Brush.horizontalGradient(
                                listOf(
                                    Color(0xFF2838A4),
                                    Color(0xFF6F77D2)
                                )
                            )
                        )
                    ) {
                        Text(
                            text = stringResource(R.string.BMIpercentage),
                            fontSize = 38.sp,
                            color = Color.Black,
                            modifier = Modifier
                            .padding(vertical = 50.dp, horizontal = 50.dp)


                        )
                    }
                    Text(
                        text = stringResource(R.string.ResultText),
                        fontSize = 22.sp,
                        color = Color.Black,
                        modifier = Modifier
                            .padding(vertical = 10.dp, horizontal = 10.dp)


                    )
                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(100.dp)
                            .padding(horizontal = 20.dp, vertical = 10.dp),
                        shape = RoundedCornerShape(16.dp),
                        colors = CardDefaults.cardColors(Color(0x19070707)),
                    ) {

                        Row (
                            modifier = Modifier
                                .padding(10.dp)
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically
                        ) {

                            Column (
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.age),
                                    fontSize = 22.sp
                                )
                                Text(
                                    text = "50",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }

                            VerticalDivider(
                                thickness = 1.dp,
                                color = Color.Gray
                            )

                            Column (
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.weight),
                                    fontSize = 22.sp
                                )
                                Text(
                                    text = "97 Kg",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold

                                )
                            }

                            VerticalDivider(
                                modifier = Modifier,
                                thickness = 1.dp,
                                color = Color.Gray
                            )

                            Column (
                                modifier = Modifier
                                    .weight(1f),
                                horizontalAlignment = Alignment.CenterHorizontally
                            ) {
                                Text(
                                    text = stringResource(R.string.height),
                                    fontSize = 22.sp
                                )
                                Text(
                                    text = "178 cm",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold
                                )
                            }
                        }
                    }
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(250.dp)
                            .padding(vertical = 10.dp, horizontal = 20.dp)
                            .background(
                                brush = Brush.linearGradient(
                                    listOf(
                                        Color(0xFF2838A4),
                                        Color(0xFF6F77D2)

                                    )
                                )
                            )
                    )

                    HorizontalDivider(
                        modifier = Modifier
                        .width(360.dp)
                            .padding(top = 10.dp),
                        thickness = 1.dp,
                        color = Color.Gray
                    )

                    Button(
                        onClick = {
                            controleDeNavegacao?.navigate("user_data")
                        },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 15.dp,
                                horizontal = 20.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF2838A4)),
                        shape = RoundedCornerShape(5.dp)
                    ) {
                        Text(text = stringResource(R.string.NewCalc), fontSize = 20.sp)

                      }


                   }
                }
            }
        }
    }







@Preview(showSystemUi = true)
@Composable
private fun BMIResultScreenPreview() {

    BMIResultScreen(null)
}