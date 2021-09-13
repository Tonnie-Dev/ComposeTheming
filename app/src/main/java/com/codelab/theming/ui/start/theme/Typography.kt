package com.codelab.theming.ui.start.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.codelab.theming.R
import org.w3c.dom.Text

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

//Typograpy Class accepts
val JetnewsTypography = Typography(
    h4 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 30.sp
    ),
    h5 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600,
        fontSize = 24.sp
    ),
    h6 = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W600, fontSize = 20.sp
    ),
    subtitle1 = TextStyle(
        fontFamily = Domine,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    subtitle2 = TextStyle(
        fontFamily = Domine,
        fontWeight = FontWeight.W600,
        fontSize = 16.sp
    ),
    body1 = TextStyle(
        fontFamily = Domine,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    body2 = TextStyle(
        fontFamily = Montserrat,
        fontSize = 14.sp
    ),
    button = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    ),
    overline = TextStyle(
        fontFamily = Montserrat,
        fontWeight = FontWeight.W500,
        fontSize = 12.sp
    )
)