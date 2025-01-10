package com.joaovds.loginui.ui.navigation

sealed class NavGraph(val route: String) {
    data object Welcome : NavGraph("welcome")
    data object Login : NavGraph("login")
    data object Register : NavGraph("register")
    data object Home : NavGraph("home")
}