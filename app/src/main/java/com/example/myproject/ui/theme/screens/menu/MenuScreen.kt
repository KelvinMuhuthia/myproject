package com.example.myproject.ui.theme.screens.menu

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.myproject.Navigation.ROUT_BABY
import com.example.myproject.Navigation.ROUT_KIDS
import com.example.myproject.Navigation.ROUT_MEN
import com.example.myproject.Navigation.ROUT_WOMEN
import com.example.myproject.R
import androidx.compose.ui.text.style.TextAlign

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController){
    Column {
        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar(
                    containerColor = Color.Red
                ) {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(
                                        imageVector =
                                        if (index == selected)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title
                                    )
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            }
                        )
                    }
                }

            },

            topBar = {
                TopAppBar(
                    title = {
                        Text(modifier = Modifier.padding(start = 120.dp),
                            text = "ROVERGIFTS",
                            color = Color.White,
                            fontStyle = androidx.compose.ui.text.font.FontStyle.Italic
                        )
                    },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),

                )
            },

            content = @Composable {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(280.dp),
                        contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.property),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 60.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                    //Start of row1
                    Row (
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .horizontalScroll(rememberScrollState())
                    ){
                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)

                        ){
                            Box (
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.property),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                        }

                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable { navController.navigate(ROUT_MEN) }
                                .verticalScroll(rememberScrollState()),

                            colors = CardDefaults.cardColors(Color.White)
                        ){
                            Text(
                                text = "MEN",
                                color = Color.Black,
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 10.dp)
                                    .clickable { navController.navigate(ROUT_MEN) }
                            )

                        }

                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable { navController.navigate(ROUT_WOMEN) }

                        ){
                            Box (
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.property),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                        }
                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable { navController.navigate(ROUT_WOMEN) }
                                .verticalScroll(rememberScrollState()),
                            colors = CardDefaults.cardColors(Color.White)
                        ){
                            Text(
                                text = "WOMEN",
                                color = Color.Black,
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 10.dp)
                            )

                        }
                    }
                    //End of row1

                    Spacer(modifier = Modifier.height(30.dp))

                    //Start of row2
                    Row (
                        modifier = Modifier
                            .padding(start = 20.dp)
                            .horizontalScroll(rememberScrollState())

                    ){
                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable { navController.navigate(ROUT_BABY) }
                        ){
                            Box (
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.property),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                        }
                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable { navController.navigate(ROUT_BABY) }
                                .verticalScroll(rememberScrollState()),
                            colors = CardDefaults.cardColors(Color.White)
                        ){
                            Text(
                                text = "BABY",
                                color = Color.Black,
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 10.dp)
                            )
                        }

                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable { navController.navigate(ROUT_KIDS) }
                        ){
                            Box (
                                modifier = Modifier
                                    .fillMaxSize(),
                                contentAlignment = Alignment.Center
                            ){
                                Image(
                                    painter = painterResource(id = R.drawable.property),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentScale = ContentScale.Crop
                                )
                            }
                        }
                        Card (
                            modifier = Modifier
                                .height(200.dp)
                                .width(200.dp)
                                .clickable { navController.navigate(ROUT_KIDS) }
                                .verticalScroll(rememberScrollState()),
                            colors = CardDefaults.cardColors(Color.White)
                        ){
                            Text(
                                text = "KIDS",
                                color = Color.Black,
                                fontSize = 20.sp,
                                modifier = Modifier
                                    .padding(start = 10.dp, top = 10.dp)
                            )
                        }
                    }
                    //End of row2
                    Spacer(modifier = Modifier.height(120.dp))

                }
            }
        )
    }
}

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Menu",
        route="menu",
        selectedIcon=Icons.Outlined.Menu,
        unselectedIcon=Icons.Outlined.Menu,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Contact us",
        route="contact",
        selectedIcon=Icons.Filled.Call,
        unselectedIcon=Icons.Outlined.Call,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Add",
        route="add_products",
        selectedIcon=Icons.Filled.Add,
        unselectedIcon=Icons.Outlined.Add,
        hasNews = false,
        badges=0
    ),

    )

data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)

@Composable
@Preview(showBackground = true)
fun MenuScreenPreview(){
    MenuScreen(rememberNavController())
}