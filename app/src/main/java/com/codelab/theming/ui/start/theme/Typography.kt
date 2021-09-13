package com.codelab.theming.ui.start.theme

import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import com.codelab.theming.R

//FontFamily takes a list of Fonts
private val Montserrat = FontFamily(
    Font(resId = R.font.montserrat_regular),
    Font(resId = R.font.montserrat_medium, weight = FontWeight.W500),
    Font(resId = R.font.montserrat_semibold, weight = FontWeight.W600)
)

private val Domine = FontFamily(
    Font(resId = R.font.domine_regular),
    Font(resId = R.font.domine_bold, weight = FontWeight.Bold)
)