package com.joaovds.loginui.ui.screen

import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.joaovds.loginui.R
import com.joaovds.loginui.ui.components.AuthenticationScreenTemplate
import com.joaovds.loginui.ui.theme.PrimaryPink
import com.joaovds.loginui.ui.theme.PrimaryPinkBlended
import com.joaovds.loginui.ui.theme.PrimaryPinkDark
import com.joaovds.loginui.ui.theme.PrimaryPinkLight

@Composable
fun LoginScreen(
    modifier: Modifier = Modifier,
    onLoginClicked: () -> Unit,
    onRegisterClicked: () -> Unit
) {
    AuthenticationScreenTemplate(
        modifier = modifier,
        backgroundGradient = arrayOf(0f to PrimaryPinkBlended, 1f to PrimaryPink),
        imgRes = R.drawable.img_coder_m,
        title = "Bem vindo de volta!",
        subtitle = "Faça seu login",
        mainActionButtonTitle = "Login",
        secondaryActionButtonTitle = "Criar Conta",
        mainActionButtonColors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = PrimaryPinkDark
        ),
        secondaryActionButtonColors = ButtonDefaults.buttonColors(
            contentColor = Color.White,
            containerColor = PrimaryPinkLight
        ),
        mainActionButtonShadow = PrimaryPinkDark,
        secondaryActionButtonShadow = PrimaryPinkDark,
        onMainActionButtonClicked = onLoginClicked,
        onSecondaryActionButtonClicked = onRegisterClicked
    )
}