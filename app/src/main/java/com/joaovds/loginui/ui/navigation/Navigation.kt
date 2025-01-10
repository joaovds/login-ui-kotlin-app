package com.joaovds.loginui.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.joaovds.loginui.ui.screen.HomeScreen
import com.joaovds.loginui.ui.screen.LoginScreen
import com.joaovds.loginui.ui.screen.RegistrationScreen
import com.joaovds.loginui.ui.screen.WelcomeScreen

@Composable
fun NavigationContainer() {
    val navHost = rememberNavController()

    NavHost(
        navController = navHost,
        startDestination = NavGraph.Welcome.route
    ) {
        composable(NavGraph.Welcome.route) {
            WelcomeScreen(onOpenLoginClicked = {
                navHost.navigate(
                    NavGraph.Login.route
                )
            })
        }
        composable(NavGraph.Login.route) {
            LoginScreen(
                onLoginClicked = { navHost.navigate(NavGraph.Home.route) },
                onRegisterClicked = { navHost.navigate(NavGraph.Register.route) })
        }
        composable(NavGraph.Register.route) {
            RegistrationScreen(onRegisterClicked = {
                navHost.navigate(
                    NavGraph.Home.route
                )
            }, onLoginClicked = { navHost.navigate(NavGraph.Login.route) })
        }
        composable(NavGraph.Home.route) {
            HomeScreen(onRestartFlowClicked = {
                navHost.navigate(
                    NavGraph.Welcome.route
                )
            })
        }
    }
}