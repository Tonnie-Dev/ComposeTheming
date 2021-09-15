package com.codelab.theming.ui.start.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val lightColors = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    secondary = Red700,
    secondaryVariant = Red900,
    onPrimary = Color.White,
    onSecondary = Color.White,
    onError = Red800
)

private val darkColors = darkColors(
    primary = Red300,
    primaryVariant = Red700,
    onPrimary = Color.Black,
    secondary = Red300,
    onSecondary = Color.Black,
    error = Red200
)

@Composable
fun JetnewsTheme(darkTheme: Boolean = isSystemInDarkTheme(),
                 content: @Composable () -> Unit) {

    MaterialTheme(
        content = content, colors = if(darkTheme) darkColors else lightColors, typography =
        JetnewsTypography,
        shapes
        = JetnewsShapes
    )

}