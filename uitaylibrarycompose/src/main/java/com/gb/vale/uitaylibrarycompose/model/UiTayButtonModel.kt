package com.gb.vale.uitaylibrarycompose.model

import com.gb.vale.uitaylibrarycompose.R

class UiTayButtonModel (
    var uiTayHeight : Int = 48,
    var uiTayBackground : Int = R.color.ui_tay_black,
    var uiTayStroke : Int = R.color.ui_tay_black,
    var uiTayBackgroundDisable : Int = R.color.ui_tay_gray,
    var uiTayStrokeDisable : Int = R.color.ui_tay_gray,
    var uiTayBackgroundSelected : Int = R.color.ui_tay_black,
    var uiTayStrokeSelected : Int = R.color.ui_tay_black,
    var uiTayBackgroundSecondary : Int = R.color.ui_tay_white,
    var uiTayStrokeSecondary : Int = R.color.ui_tay_black,
    var uiTayBackgroundSecondaryDisable : Int = R.color.ui_tay_gray_secondary,
    var uiTayStrokeSecondaryDisable : Int = R.color.ui_tay_gray,
    var uiTayBackgroundSecondarySelected : Int = R.color.ui_tay_black,
    var uiTayStrokeSecondarySelected : Int = R.color.ui_tay_white,
    var uiTayTextColor: Int = R.color.ui_tay_white,
    var uiTayTextColorDisable: Int = R.color.ui_tay_white,
    var uiTayTextColorSelected: Int = R.color.ui_tay_white,
    var uiTayTextColorSecondary: Int = R.color.ui_tay_black,
    var uiTayTextColorDisableSecondary: Int = R.color.ui_tay_gray,
    var uiTayTextColorSelectedSecondary: Int = R.color.ui_tay_black,
    var uiTayTextFont : Int = R.font.ui_tay_font_button,
    var uiTayTintStart: Int = R.color.ui_tay_white,
    var uiTayTintEnd : Int = R.color.ui_tay_white,
    var uiTayIconStart : Int? = null,
    var uiTayIconEnd : Int? = null,
    var uiTayTextSize : Int = 20,
    var uiTayStrokeWith : Int = 1,
    var uiTayRadius : Int = 62)

fun Boolean.utBtnState(selected : Boolean = false)=  if (selected) UTStateCButton.UI_BTN_SELECTED else
        if (this)UTStateCButton.UT_BTN_ENABLE else UTStateCButton.UI_BTN_DISABLE

fun UiTayButtonModel.uiTayStroke(type :UTStyleCButton,state : UTStateCButton) =
    if(type.uiCBtnPrimary())uiTayMStroke(state) else uiTayMStrokeS(state)

fun UiTayButtonModel.uiTayBackground(type :UTStyleCButton,state : UTStateCButton) =
    if(type.uiCBtnPrimary())uiTayMBackground(state) else uiTayMBackgroundS(state)


fun UiTayButtonModel.uiTayTextColor(type :UTStyleCButton,state : UTStateCButton) =
    if(type.uiCBtnPrimary())uiTayMText(state) else uiTayMTextS(state)


fun UiTayButtonModel.uiTayMStroke(state :UTStateCButton ): Int{
    return when(state){
        UTStateCButton.UT_BTN_ENABLE ->{uiTayStroke}
       UTStateCButton.UI_BTN_DISABLE ->{uiTayStrokeDisable}
      UTStateCButton.UI_BTN_SELECTED ->{uiTayStrokeSelected}
    }
}

fun UiTayButtonModel.uiTayMBackground(state :UTStateCButton ): Int{
    return when(state){
        UTStateCButton.UT_BTN_ENABLE ->{uiTayBackground}
        UTStateCButton.UI_BTN_DISABLE ->{uiTayBackgroundDisable}
        UTStateCButton.UI_BTN_SELECTED ->{uiTayBackgroundSelected}
    }
}

fun UiTayButtonModel.uiTayMStrokeS(state :UTStateCButton ): Int{
    return when(state){
        UTStateCButton.UT_BTN_ENABLE ->{uiTayStrokeSecondary}
        UTStateCButton.UI_BTN_DISABLE ->{uiTayStrokeSecondaryDisable}
        UTStateCButton.UI_BTN_SELECTED ->{uiTayStrokeSecondarySelected}
    }
}

fun UiTayButtonModel.uiTayMBackgroundS(state :UTStateCButton ): Int{
    return when(state){
        UTStateCButton.UT_BTN_ENABLE ->{uiTayBackgroundSecondary}
        UTStateCButton.UI_BTN_DISABLE ->{uiTayBackgroundSecondaryDisable}
        UTStateCButton.UI_BTN_SELECTED ->{uiTayBackgroundSecondarySelected}
    }
}

fun UiTayButtonModel.uiTayMTextS(state :UTStateCButton ): Int{
    return when(state){
        UTStateCButton.UT_BTN_ENABLE ->{uiTayTextColorSecondary}
        UTStateCButton.UI_BTN_DISABLE ->{uiTayTextColorDisableSecondary}
        UTStateCButton.UI_BTN_SELECTED ->{uiTayTextColorSelectedSecondary}
    }
}

fun UiTayButtonModel.uiTayMText(state :UTStateCButton ): Int{
    return when(state){
        UTStateCButton.UT_BTN_ENABLE ->{uiTayTextColor}
        UTStateCButton.UI_BTN_DISABLE ->{uiTayTextColorDisable}
        UTStateCButton.UI_BTN_SELECTED ->{uiTayTextColorSelected}
    }
}

fun UTStyleCButton.uiCBtnPrimary()= this == UTStyleCButton.UI_TAY_PRIMARY

enum class UTStateCButton(var code: Int) {
    UT_BTN_ENABLE(0),
    UI_BTN_DISABLE(1),
    UI_BTN_SELECTED(2)
}

enum class UTStyleCButton(var code: Int) {
    UI_TAY_PRIMARY(0),
    UI_TAY_SECONDARY(1)
}