package com.gb.vale.uitaylibraryutils

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.gb.vale.uitaylibrarycompose.extra.UiTayCToolBar
import com.gb.vale.uitaylibraryutils.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                UiTayCToolBar(){
                    Log.d("actiontay","$it")
                }
            }
        }
    }
}
