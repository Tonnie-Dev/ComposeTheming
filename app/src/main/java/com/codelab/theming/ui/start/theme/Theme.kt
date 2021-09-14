package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val lightColors = lightColors(
    primary = Red700,
    primaryVariant = Red900,
    secondary = Red700,
    secondaryVariant = Red900,
    onPrimary = Color.White,
    onSecondary =Color.White,
    onError = Red800
)

@Composable
fun JetnewsTheme(content:@Composable ()->Unit) {

    MaterialTheme(content = content, colors = lightColors, typography = JetnewsTypography)

}