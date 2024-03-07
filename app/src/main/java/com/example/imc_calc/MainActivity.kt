package com.example.imc_calc

import android.graphics.Paint.Align
import android.icu.text.ListFormatter.Width
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.imc_calc.ui.theme.IMC_CalcTheme
import java.nio.file.WatchEvent

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IMC_CalcTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        Column(
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color(0xffED145B))
                .height(190.dp)
        ) {

            Image(
                modifier = Modifier
                    .padding(top = 18.dp, bottom = 12.dp)
                    .height(70.dp)
                    .width(70.dp),
                painter = painterResource(id = R.drawable.imagem),
                contentDescription = ""
            )

            Text(
                text = "Calculadora IMC",
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 20.sp,
                fontFamily = FontFamily.SansSerif
            )
        }

        Column(
            modifier = Modifier
                .padding(34.dp, 34.dp, 34.dp, 0.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {


            Card(
                modifier = Modifier
                    .offset(y = -70.dp),
                elevation = CardDefaults.cardElevation(8.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(color = Color(0xffF1F1F1))
                        .height(height = 450.dp),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.SpaceAround
                ) {

                    Text(
                        modifier = Modifier
                            .padding(top = 28.dp),
                        text = "Seus dados",
                        fontSize = 28.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xffED145B)
                    )

                    Column(
                        modifier = Modifier,
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            modifier = Modifier
                                .padding(top = 32.dp, bottom = 8.dp),
                            color = Color(0xffED145B),
                            text = "Seu peso:"
                        )

                        OutlinedTextField(
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color(
                                    0xffED145B
                                ),
                                focusedBorderColor = Color(0xffED145B),
                            ),
                            value = "Seu peso em Kg",
                            onValueChange = {},
                            shape = RoundedCornerShape(8.dp)
                        )

                        Text(
                            modifier = Modifier
                                .padding(top = 32.dp, bottom = 8.dp),
                            color = Color(0xffED145B),
                            text = "Sua altura:"
                        )

                        OutlinedTextField(
                            colors = OutlinedTextFieldDefaults.colors(
                                unfocusedBorderColor = Color(
                                    0xffED145B
                                ),
                                focusedBorderColor = Color(0xffED145B),
                            ),
                            value = "Sua altura em cm",
                            onValueChange = {},
                            shape = RoundedCornerShape(8.dp)
                        )
                    }

                    Button(
                        modifier = Modifier.width(250.dp), onClick = { /*TODO*/ },
                        shape = RoundedCornerShape(10.dp),
                        colors = ButtonDefaults.buttonColors(containerColor = Color(0xffED145B))
                    ) {
                        Text(text = "CALCULAR")
                    }
                }
            }

            Card(
                modifier = Modifier
                    .offset(y = -40.dp)
                    .fillMaxSize()
                    .padding(0.dp),
                elevation = CardDefaults.cardElevation(8.dp),
                border = BorderStroke(width = 2.dp, color = Color(0xffED145B)),
                colors = CardDefaults.cardColors(containerColor = Color(0xff329F6B))
            ) {

                Row(
                    modifier = Modifier
                        .fillMaxSize()
                ) {

                    Column(
                        modifier = Modifier
                            .padding(24.dp),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(
                            color = Color(0xffffffff),
                            text = "Resultado"
                        )

                        Text(
                            fontSize = 24.sp,
                            color = Color(0xffffffff), text = "Peso ideal"
                        )

                    }

                    Text(
                        modifier = Modifier
                            .padding(24.dp),
                        fontWeight = FontWeight.Bold,
                        fontSize = 40.sp,
                        color = Color(0xffffffff),
                        text = "21.3"
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    IMC_CalcTheme {
        Greeting()
    }
}