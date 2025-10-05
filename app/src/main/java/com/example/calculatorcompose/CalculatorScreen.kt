package com.example.calculatorcompose
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.calculatorcompose.ui.theme.CalculatorComposeTheme
import com.example.calculatorcompose.ui.theme.inter
import com.example.calculatorcompose.ui.theme.orange

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CalculatorScreen() {

    val resultValue = remember { mutableStateOf("0") }
    var element = remember { mutableStateOf("") }
    var alert = remember { mutableStateOf("") }

    if(element.value.length > 20)
    {
        alert.value = "Karakter hatası"
    }
    else
    {
        alert.value = ""
    }

    val math = MathOperations()

    Scaffold(topBar = {
        CenterAlignedTopAppBar(title = {
            Text(text = stringResource(id = R.string.title),
                fontFamily = inter,
                fontSize = 36.sp,
                fontWeight = FontWeight.Bold

            )
        }, colors = TopAppBarDefaults.topAppBarColors(
            titleContentColor = Color.White,
            containerColor = orange,
        )

        )
    },
    ) {
        paddingValues ->
        Column(modifier = Modifier
            .fillMaxSize()
            .padding(paddingValues),

        ) {
            Box(modifier = Modifier
                .weight(2f)
            ) {
                Row(modifier = Modifier
                    .fillMaxSize()
                    .background(color = Color.DarkGray)
                    ,
                    verticalAlignment = Alignment.Bottom

                ) {
                    Text(text =
                        if(alert.value == "")
                        {
                            element.value
                        }else {
                            alert.value
                        },
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(all = 20.dp)
                            .weight(2f)
                    )

                    Text(text = resultValue.value,
                        color = Color.White,
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(all = 20.dp)
                            .weight(1f)
                    )
                }
            }

            Row(modifier =
                Modifier.fillMaxWidth().weight(1f)
            ) {
                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier.weight(2f).background(color = Color.DarkGray)
                        .fillMaxHeight()

                )
                {
                    Button(onClick = {
                        element.value = ""
                        resultValue.value = "0"

                    }) {
                        Text(text = "AC", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }

                }

                Box(contentAlignment = Alignment.Center,
                    modifier = Modifier.weight(1f).background(color = Color.DarkGray)
                        .fillMaxHeight()

                )
                {
                    Button(onClick = {
                        element.value = element.value.dropLast(1)

                    }) {
                        Text(text = "X", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }

                }


                Box(
                    contentAlignment = Alignment.Center,
                    modifier = Modifier.weight(1f).background(color = orange)
                        .fillMaxHeight()

                    ) {

                    Button(onClick = {
                        element.value += "/"

                    }) {
                        Text(text = "/", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .weight(1f)
            ) {

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray)
                    .fillMaxHeight()
                    ,
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "7"

                    }) {
                        Text(text = "7", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray)
                    .fillMaxHeight()
                    ,
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "8"


                    }) {
                        Text(text = "8", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray)
                    .fillMaxHeight()
                    ,
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "9"

                    }) {
                        Text(text = "9", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = orange)
                    .fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "x"
                    }) {
                        Text(text = "x", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .weight(1f)
            ) {

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "4"

                    }) {
                        Text(text = "4", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "5"


                    }) {
                        Text(text = "5", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "6"

                    }) {
                        Text(text = "6", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = orange).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "+"


                    }) {
                        Text(text = "+", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .weight(1f)
            ) {

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "1"


                    }) {
                        Text(text = "1", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "2"

                    }) {
                        Text(text = "2", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "3"

                    }) {
                        Text(text = "3", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = orange).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "-"

                    }) {
                        Text(text = "-", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }
            }

            Row(
                modifier = Modifier.fillMaxWidth()
                    .weight(1f)
            ) {

                Box(modifier = Modifier.weight(2f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "0"


                    }) {
                        Text(text = "0", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = Color.DarkGray).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "."


                    }) {
                        Text(text = ".", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

                Box(modifier = Modifier.weight(1f)
                    .background(color = orange).fillMaxHeight(),
                    contentAlignment = Alignment.Center

                ) {
                    Button(onClick = {
                        element.value += "="
                        val result = math.calculate(element.value).toString()
                        resultValue.value = result
                        element.value = result

                    }) {
                        Text(text = "=", textAlign = TextAlign.Center,color = Color.White,
                            fontSize = 24.sp
                        )
                    }
                }

            }
        }
    }

}

@Preview(showBackground = true)
@Composable
fun Show() {


    CalculatorComposeTheme {
        CalculatorScreen()
    }
}
