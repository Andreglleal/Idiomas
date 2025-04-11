package com.trabalhoandroid.idiomas


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.trabalhoandroid.idiomas.ui.theme.Blue
import com.trabalhoandroid.idiomas.ui.theme.White


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Home()
        }
    }
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Home() {
    var menuExpanded by remember { mutableStateOf(false) }

    Scaffold(
        topBar = {
            TopAppBar(
                title = {},
                modifier = Modifier,
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Blue
                ),
                actions = {
                    Icon(
                        imageVector = Icons.Default.Menu,
                        contentDescription = "Menu",
                        tint = White,
                        modifier = Modifier.clickable{
                            menuExpanded = true
                        }
                    )

                    Column(
                        modifier = Modifier
                    ) {
                        DropdownMenu(
                            expanded = menuExpanded,
                            onDismissRequest = { menuExpanded = false },
                            modifier = Modifier.width(200.dp).background(White)
                        ){
                            DropdownMenuItem(
                                text = {
                                    Text( text = "Português")
                                },
                                leadingIcon = {
                                    Image(
                                        painter = painterResource(R.drawable.brasil),
                                        contentDescription = "bandeira do brasil",
                                        modifier = Modifier.size(30.dp)
                                    )
                                },
                                onClick = {
                                }
                            )
                            DropdownMenuItem(
                                text = {
                                    Text( text = "Inglês")
                                },
                                leadingIcon = {
                                    Image(
                                        painter = painterResource(R.drawable.eua),
                                        contentDescription = "bandeira do brasil",
                                        modifier = Modifier.size(30.dp)
                                    )
                                },
                                onClick = {
                                }
                            )
                            DropdownMenuItem(
                                text = {
                                    Text( text = "Espanhol")
                                },
                                leadingIcon = {
                                    Image(
                                        painter = painterResource(R.drawable.espanha),
                                        contentDescription = "bandeira do brasil",
                                        modifier = Modifier.size(30.dp)
                                    )
                                },
                                onClick = {
                                }
                            )
                        }
                    }
                }
            )
        }
    ) {paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(White),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(R.drawable.bandeira1),
                contentDescription = "bandeira do brasil",
                modifier = Modifier.size(250.dp)
            )
            Text(
                text = stringResource(R.string.idioma),
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.descricao),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(20.dp)
                    .align(Alignment.CenterHorizontally)
                    .border(width = 2.dp, color = Blue).padding(10.dp)
            )
        }
    }
}


@Preview
@Composable
private fun HomePreview() {
    Home()
}