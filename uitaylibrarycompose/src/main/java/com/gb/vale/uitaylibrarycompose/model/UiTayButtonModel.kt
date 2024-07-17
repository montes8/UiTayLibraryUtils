package com.gb.vale.uitaylibrarycompose.model

import androidx.compose.ui.text.style.TextAlign
import com.gb.vale.uitaylibrarycompose.R
import com.gb.vale.uitaylibrarycompose.utils.UI_TAY_TEXT_DEFAUL

class UiTayButtonModel (
    var uiTayHeight : Int = 56,
    var uiTayBackground : Int = R.color.ui_tay_black,
    var uiTayStronker : Int = R.color.ui_tay_black,
    var uiTayBackgroundDisable : Int = R.color.ui_tay_gray,
    var uiTayStronkerDisable : Int = R.color.ui_tay_gray,
    var uiTayBackgroundSelected : Int = R.color.ui_tay_black,
    var uiTayStronkerSelected : Int = R.color.ui_tay_black,
    var uiTayBackgroundSecondary : Int = R.color.ui_tay_black,
    var uiTayStronkerSecondary : Int = R.color.ui_tay_white,
    var uiTayBackgroundSecondaryDisable : Int = R.color.ui_tay_gray,
    var uiTayStronkerSecondaryDisable : Int = R.color.ui_tay_gray,
    var uiTayBackgroundSecondarySelected : Int = R.color.ui_tay_black,
    var uiTayStronkerSecondarySelected : Int = R.color.ui_tay_white,
    var uiTayTextColor: Int = R.color.ui_tay_white,
    var uiTayTextColorDisable: Int = R.color.ui_tay_white,
    var uiTayTextColorSelected: Int = R.color.ui_tay_white,
    var uiTayTextColorSecondary: Int = R.color.ui_tay_black,
    var uiTayTextColorDisableSecondary: Int = R.color.ui_tay_white,
    var uiTayTextColorSelectedSecondary: Int = R.color.ui_tay_black,
    var uiTayTextFont : Int = R.font.ui_tay_c_tb,
    var uiTayText : String = UI_TAY_TEXT_DEFAUL,
    var uiTayTintStart: Int = R.color.ui_tay_white,
    var uiTayTintEnd : Int = R.color.ui_tay_white,
    var uiTayIconStart : Int? = null,
    var uiTayIconEnd : Int? = null,
    var uiTayTextSize : Int = 16,
    var uiTayStrokeWith : Int = 1,
    var uiTayRadius : Int = 62,

)