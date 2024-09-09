package com.example.myproject.ui.theme.screens.baby

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
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
fun BabyScreen(navController: NavController){
    Column {
        @androidx.compose.runtime.Composable run {
            Row {
                Card {
                    Image(
                        painter = painterResource(id = R.drawable.babygifts),
                        contentDescription = "Unique twin baby gift. Baby Gift Set Baby Gift Hamper twin.Price at sh.2000",
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
}

@Composable
@Preview(showBackground = true)
fun BabyScreenPreview() {
    BabyScreen(rememberNavController())

}