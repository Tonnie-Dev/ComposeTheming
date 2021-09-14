package com.codelab.theming.ui.start.theme

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Shapes
import androidx.compose.ui.unit.dp

val JetnewsShapes = Shapes(

    //Shape used by small components like Button or Snackbar
    small = CutCornerShape(topStart = 8.dp),

    //Shape used by medium components like Card or AlertDialog
    medium =CutCornerShape(topStart = 24.dp, bottomEnd = 24.dp),

    //Shape used by large components like ModalDrawer
    large = RoundedCornerShape(8.dp))