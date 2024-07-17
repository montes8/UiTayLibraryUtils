package com.gb.vale.uitaylibrarycompose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.gb.vale.uitaylibrarycompose.model.UiTayButtonModel

@Composable
fun UiTayCButton(
    uiTayModifier : UiTayButtonModel = UiTayButtonModel(),
    uiTayClick: () -> Unit
) {

    Button(modifier = Modifier
        .height(uiTayModifier.uiTayHeight.dp),
        shape = RoundedCornerShape(uiTayModifier.uiTayRadius.dp),
        border = BorderStroke(uiTayModifier.uiTayStrokeWith.dp, colorResource(id = uiTayModifier.uiTayStronker)),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id = uiTayModifier.uiTayBackground)),
        onClick = {
            uiTayClick()
        }) {
        Text(text = "Iniciar sesión", color = colorResource(id = uiTayModifier.uiTayTextColor))
    }

}