package com.trabalhoandroid.idiomas


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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

                        }
                    )

                    Column(
                        modifier = Modifier
                    ) {

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
                modifier = Modifier.size(300.dp)
            )
            Text(
                text = "Brasil",
                modifier = Modifier.padding(100.dp)
            )
        }
    }
}


@Preview
@Composable
private fun HomePreview() {
    Home()
}