package com.gb.vale.uitaylibrarycompose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.gb.vale.uitaylibrarycompose.model.UTStyleCButton
import com.gb.vale.uitaylibrarycompose.model.UiTayButtonModel
import com.gb.vale.uitaylibrarycompose.model.uiTayBackground
import com.gb.vale.uitaylibrarycompose.model.uiTayStroke
import com.gb.vale.uitaylibrarycompose.model.uiTayTextColor
import com.gb.vale.uitaylibrarycompose.model.utBtnState
import com.gb.vale.uitaylibrarycompose.utils.UI_TAY_TEXT_DEFAUL


@Composable
fun UiTayCButton(uiTayText : String = UI_TAY_TEXT_DEFAUL, uiTayEnable : Boolean = false,
                 uiTayStyleBtn : UTStyleCButton = UTStyleCButton.UI_TAY_PRIMARY,
                 uiTayBtnModel : UiTayButtonModel = UiTayButtonModel(),
                 uiTayClick: () -> Unit
) {
    var selected by remember { mutableStateOf(false) }

    Button(modifier = Modifier
        .height(uiTayBtnModel.uiTayHeight.dp).fillMaxWidth(),
        shape = RoundedCornerShape(uiTayBtnModel.uiTayRadius.dp),
        border = BorderStroke(uiTayBtnModel.uiTayStrokeWith.dp, colorResource(id =
        uiTayBtnModel.uiTayStroke(uiTayStyleBtn,uiTayEnable.utBtnState()))),
        colors = ButtonDefaults.buttonColors(backgroundColor = colorResource(id =
        uiTayBtnModel.uiTayBackground(uiTayStyleBtn,uiTayEnable.utBtnState())
        )),
        onClick = {
           if(uiTayEnable)uiTayClick()
        }) {
        Text(text = uiTayText, color = colorResource(id =
         uiTayBtnModel.uiTayTextColor(uiTayStyleBtn,uiTayEnable.utBtnState())))
    }

}

