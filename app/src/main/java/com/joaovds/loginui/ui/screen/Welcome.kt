package com.joaovds.loginui.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.joaovds.loginui.R
import com.joaovds.loginui.ui.components.ActionButton
import com.joaovds.loginui.ui.theme.DarkTextColor
import com.joaovds.loginui.ui.theme.PrimaryPinkBlended
import com.joaovds.loginui.ui.theme.PrimaryYellow
import com.joaovds.loginui.ui.theme.PrimaryYellowDark
import com.joaovds.loginui.ui.theme.PrimaryYellowLight

@Composable
fun WelcomeScreen(
    modifier: Modifier = Modifier,
    onOpenLoginClicked: () -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    0f to PrimaryPinkBlended,
                    0.6f to PrimaryYellowLight,
                    1f to PrimaryYellow
                )
            )
            .systemBarsPadding(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.img_welcome),
            contentDescription = null,
            modifier = Modifier
                .size(300.dp)
                .padding(top = 32.dp)
        )
        Spacer(
            modifier = Modifier.height(24.dp)
        )
        Text(
            text = "Vamos Iniciar em Kotlin",
            modifier = Modifier.padding(horizontal = 24.dp),
            fontWeight = FontWeight.Black,
            style = MaterialTheme.typography.headlineLarge,
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.height(8.dp)
        )
        Text(
            text = "Criando um belo fluxo de Login usando\nKotlin, Jetpack Compose e Material3",
            modifier = Modifier.padding(horizontal = 24.dp),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.bodyLarge,
            color = DarkTextColor
        )
        Spacer(
            modifier = Modifier.weight(weight = 1f)
        )
        ActionButton(
            text = "Próximo",
            isNavigationArrowVisible = true,
            onClick = onOpenLoginClicked,
            colors = ButtonDefaults.buttonColors(
                contentColor = DarkTextColor,
                containerColor = PrimaryYellowDark
            ),
            shadowColor = PrimaryYellowDark,
            modifier = Modifier.padding(24.dp)
        )
    }
}