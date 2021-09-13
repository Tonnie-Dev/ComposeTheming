package com.codelab.theming.ui.start.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable

@Composable
fun Jetnews(content:@Composable ()->Unit) {

    MaterialTheme(content = content)

}