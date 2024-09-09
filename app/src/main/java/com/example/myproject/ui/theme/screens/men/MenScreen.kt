package com.example.myproject.ui.theme.screens.men

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.R

@Composable
fun MenScreen(navController: NavController){
    Column (
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ){
        Row {
            Card {
                Image(
                    painter = painterResource(id = R.drawable.icedwatch),
                    contentDescription = "ROLEX ICED WATCH  KSH:5000",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )


            }
            Card {

            }
        }

        Spacer(modifier = Modifier.height(20.dp))


        Row {
            
        }
    }
}

@Composable
@Preview(showBackground = true)
fun MenScreenPreview() {
    MenScreen(rememberNavController())

}