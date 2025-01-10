package com.joaovds.loginui.ui.screen

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.joaovds.loginui.R
import com.joaovds.loginui.ui.components.AuthenticationScreenTemplate
import com.joaovds.loginui.ui.theme.PrimaryPinkDark
import com.joaovds.loginui.ui.theme.PrimaryViolet
import com.joaovds.loginui.ui.theme.PrimaryVioletDark
import com.joaovds.loginui.ui.theme.PrimaryVioletLight

@Composable
fun RegistrationScreen(modifier: Modifier = Modifier) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(0f to PrimaryViolet, 1f to PrimaryVioletDark),
        imgRes = R.drawable.img_coder_w,
        title = "Olá, bem vindo!",
        subtitle = "Vamos Começar",
        mainActionButtonTitle = "Criar Conta",
        secondaryActionButtonTitle = "Login",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = PrimaryVioletDark
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = PrimaryVioletLight
        ),
        mainActionButtonShadow = PrimaryPinkDark,
        secondaryActionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = {},
        onSecondaryActionButtonClicked = {}
    )
}