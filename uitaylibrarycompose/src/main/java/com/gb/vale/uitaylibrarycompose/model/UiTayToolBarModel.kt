package com.gb.vale.uitaylibrarycompose.model

import androidx.compose.ui.text.style.TextAlign
import com.gb.vale.uitaylibrarycompose.R

class UiTayToolBarModel (
    var uiTayHeight : Int = 56,
    var uiTayBackground : Int = R.color.ui_tay_black,
    var uiTayTextColor: Int = R.color.ui_tay_white,
    var uiTayTintStart: Int = R.color.ui_tay_white,
    var uiTayTintEnd : Int = R.color.ui_tay_white,
    var uiTayIconStart : Int = R.drawable.tay_ic_c_back,
    var uiTayIconEnd : Int = R.drawable.tay_ic_c_menu,
    var uiTayTextSize : Int = 16,
    var uiTayTextMarginHorizontal : Int = 0,
    var uiTayIconMarginStar : Int = 0,
    var uiTayIconMarginEnd : Int = 0,
    var uiTayTextFont : Int = R.font.ui_tay_font_tb,
    var uiTayTextPosition : TextAlign = TextAlign.Center,
    var uiTayTypeStart : Boolean = true,
    var uiTayTypeEnd : Boolean = true
)