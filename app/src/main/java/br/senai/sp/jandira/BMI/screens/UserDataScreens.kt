package br.senai.sp.jandira.BMI.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Balance
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Height
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Numbers
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.BMI.R

@Composable
fun UserDataScreens(modifier: Modifier = Modifier) {

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
                text = stringResource(R.string.hi),
                fontSize = 38.sp,
                color = Color.White,
                modifier = Modifier
                    .padding(horizontal = 16.dp,
                        vertical = 30.dp)
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
                Row (
                      modifier = Modifier
                          .padding(vertical = 30.dp)) {

                        Column(
                            modifier = Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Card(
                                modifier = Modifier.size(130.dp)
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.homem),
                                    contentDescription = stringResource(id = R.string.logo),
                                    modifier = Modifier
                                        .fillMaxSize(),

                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(20.dp, 10.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(0xFF2838A4)),
                                shape = RoundedCornerShape(10.dp)
                            ) {
                                Text(text = stringResource(R.string.male), fontSize = 16.sp, color = Color.White)
                            }
                        }

                        Column(
                            modifier = Modifier.weight(1f),
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            Card(
                                modifier = Modifier.size(130.dp),
                            ) {
                                Image(
                                    painter = painterResource(id = R.drawable.mulher),
                                    contentDescription = stringResource(id = R.string.logo),
                                    modifier = Modifier
                                        .fillMaxSize()
                                )
                            }
                            Button(
                                onClick = {},
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(20.dp, 10.dp),
                                colors = ButtonDefaults.buttonColors(containerColor = Color(
                                    0xFFE362EA
                                )
                                ),
                                        shape = RoundedCornerShape(10.dp)
                            ) {
                                Text(text = stringResource(R.string.female), fontSize = 16.sp, color = Color.White)
                            }
                        }
                    }

                    Column(
                        modifier = Modifier
                            .padding( 10.dp)
                            .height(230.dp),

                        verticalArrangement = Arrangement.SpaceBetween
                    ) {
                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nomeState.value = it },
                            modifier = Modifier
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            label = { Text(stringResource(R.string.age)) },
                            leadingIcon = {
                                Icon(imageVector = Icons.Default.Numbers, contentDescription = "")
                            },

                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,

                            )
                        )

                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nomeState.value = it },
                            modifier = Modifier
                                .fillMaxWidth(),
                            shape = RoundedCornerShape(12.dp),
                            label = { Text(stringResource(R.string.weight)) },
                            leadingIcon = {
                                Icon(imageVector = Icons.Default.Balance, contentDescription = "")
                            },

                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                capitalization = KeyboardCapitalization.None
                            )
                        )

                        OutlinedTextField(
                            value = nomeState.value,
                            onValueChange = { nomeState.value = it },
                            modifier = Modifier
                                .fillMaxWidth()
                                ,
                            shape = RoundedCornerShape(12.dp),
                            label = { Text(stringResource(R.string.height)) },
                            leadingIcon = {
                                Icon(imageVector = Icons.Default.Height, contentDescription = "")
                            },

                            keyboardOptions = KeyboardOptions(
                                keyboardType = KeyboardType.Number,
                                capitalization = KeyboardCapitalization.None
                            )
                        )
                    }

                    Button(
                        onClick = {},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 60.dp,
                                horizontal = 10.dp),
                        colors = ButtonDefaults.buttonColors(Color(0xFF2838A4)),
                        shape = RoundedCornerShape(10.dp)
                    ) {
                        Text(text = stringResource(R.string.calculate), fontSize = 20.sp)
                    }
                }
            }
        }
                    }








@Preview(showSystemUi = true)
@Composable
private fun UserDataScreensPreview() {

    UserDataScreens()
}


