package com.example.myproject.Navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myproject.ui.theme.screens.about.AboutScreen
import com.example.myproject.ui.theme.screens.baby.BabyScreen
import com.example.myproject.ui.theme.screens.home.HomeScreen
import com.example.myproject.ui.theme.screens.kids.KidsScreen
import com.example.myproject.ui.theme.screens.men.MenScreen
import com.example.myproject.ui.theme.screens.menu.MenuScreen
import com.example.myproject.ui.theme.screens.products.AddProductsScreen
import com.example.myproject.ui.theme.screens.products.ViewProductScreen
import com.example.myproject.ui.theme.screens.signup.SignupScreen
import com.example.myproject.ui.theme.screens.splash.SplashScreen
import com.example.myproject.ui.theme.screens.women.WomenScreen


@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH,
) {
    NavHost(
        navController = navController,
        startDestination = ROUT_SPLASH,
        modifier = modifier
    ) {

        composable(ROUT_HOME) {
            HomeScreen(navController = navController)
        }

        composable(ROUT_ABOUT) {
            AboutScreen(navController = navController)
        }
        composable(ROUT_SPLASH) {
            SplashScreen(navController = navController)
        }

        composable(ROUT_SIGNUP){
            SignupScreen(navController = navController)
        }

        composable(ROUT_LOGIN) {
            AboutScreen(navController = navController)
        }
        composable(ROUT_PRODUCTS) {
            AddProductsScreen(navController = navController)
        }
        composable(ROUT_PRODUCTS) {
            ViewProductScreen(navController = navController)
        }

        composable(ROUT_MEN) {
            MenScreen(navController = navController)
        }

        composable(ROUT_WOMEN) {
            WomenScreen(navController = navController)
        }

        composable(ROUT_BABY) {
            BabyScreen(navController = navController)
        }

        composable(ROUT_KIDS) {
            KidsScreen(navController = navController)
        }

        composable(ROUT_MENU) {
            MenuScreen(navController = navController)
        }


    }
}





