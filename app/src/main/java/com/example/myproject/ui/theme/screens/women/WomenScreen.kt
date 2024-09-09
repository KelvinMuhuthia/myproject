package com.example.myproject.ui.theme.screens.women

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
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
fun WomenScreen(navController: NavController){
    Column {

        Row {
            Card {
                Image(
                    painter = painterResource(id = R.drawable.charmbracelet),
                    contentDescription = "CHARM BRACELET  KSH:1000",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )

                Spacer(modifier = Modifier.height(20.dp))


            }
            Card {
                Image(
                    painter = painterResource(id = R.drawable.ladiesnecklace),
                    contentDescription = "GEM STONE NECKLACE  KSH:2500",
                    modifier = Modifier
                        .fillMaxSize(),
                    contentScale = ContentScale.Crop
                )




            }
        }

    }
}

@Composable
@Preview(showBackground = true)
fun WomenScreenPreview() {
    WomenScreen(rememberNavController())

}