package com.gb.vale.uitaylibrarycompose.extra

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.gb.vale.uitaylibrarycompose.model.UiTayToolBarModel

@Composable
fun UiTayCToolBar(
    uiTayModifier : UiTayToolBarModel = UiTayToolBarModel(),
    uiTayClick: (Boolean) -> Unit
) {
    Box (modifier = Modifier.height(uiTayModifier.uiTayHeight.dp).background(colorResource(uiTayModifier.uiTayBackground))
    ,contentAlignment = Alignment.CenterStart
    ){
        if (uiTayModifier.uiTayTypeStart){
            IconButton(onClick = {
                uiTayClick(true)
            },modifier = Modifier
                .align(Alignment.CenterStart).padding(start = uiTayModifier.uiTayIconMarginStar.dp)) {
                Icon(painter = painterResource(id = uiTayModifier.uiTayIconStart), contentDescription = "uiTayBackIcon",
                    tint = colorResource(uiTayModifier.uiTayTintStart))
            }
        }
        Text(text = uiTayModifier.uiTayText,modifier = Modifier.fillMaxWidth().padding(
            start = uiTayModifier.uiTayTextMarginHorizontal.dp,
            end = uiTayModifier.uiTayTextMarginHorizontal.dp), color = colorResource(uiTayModifier.uiTayTextColor),
            textAlign = uiTayModifier.uiTayTextPosition,
            fontSize = uiTayModifier.uiTayTextSize.sp,
            fontFamily = FontFamily(Font(uiTayModifier.uiTayTextFont))
        )
        if (uiTayModifier.uiTayTypeEnd){
            IconButton(onClick = {
                uiTayClick(false)
            }, modifier = Modifier
                .align(Alignment.CenterEnd).padding(start = uiTayModifier.uiTayIconMarginEnd.dp)) {
                Icon( painter = painterResource(id = uiTayModifier.uiTayIconEnd), contentDescription =
                "uiTayMenuIcon",tint = colorResource(uiTayModifier.uiTayTintEnd))
            }
        }

    }
}