package com.gb.vale.uitaylibrarycompose

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.ScaffoldState
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign

@Composable
fun UiTayCToolBar(
    uiTayClick: (Boolean) -> Unit
) {
    TopAppBar(
        contentColor = Color.Black,
        backgroundColor = Color.Black,
        title = { Text("Tay Security", modifier = Modifier.fillMaxWidth(), color = Color.White,textAlign = TextAlign.Center) },
        navigationIcon = {
            IconButton(onClick = {
                uiTayClick(true)
            }) {
                Icon(imageVector = Icons.Filled.Menu, contentDescription = "Menu Icon", tint = Color.White)
            }
        },
        actions = {
            IconButton(onClick = {
                uiTayClick(false)
            }) {
                Icon(imageVector = Icons.Default.Settings, contentDescription = "Search Icon",tint = Color.White)
            }
        }
    )
}