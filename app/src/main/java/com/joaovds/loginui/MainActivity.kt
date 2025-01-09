package com.joaovds.loginui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.joaovds.loginui.ui.screen.LoginScreen
import com.joaovds.loginui.ui.screen.WelcomeScreen
import com.joaovds.loginui.ui.theme.LoginUITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginUITheme {
                // WelcomeScreen()
                LoginScreen()
            }
        }
    }
}