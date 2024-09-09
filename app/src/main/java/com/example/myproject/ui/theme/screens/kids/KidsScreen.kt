package com.example.myproject.ui.theme.screens.kids

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.R
import java.lang.reflect.Modifier

@Composable
fun KidsScreen(navController: NavController){
    Column {
        Row {
            Card {
                Image(
                    painter = painterResource(id = R.drawable.drone),
                    contentDescription = "Buy DJI spark drone Propeller Guards and Foldable..." +
                            ,
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
fun KidsScreenPreview() {
    KidsScreen(rememberNavController())

}