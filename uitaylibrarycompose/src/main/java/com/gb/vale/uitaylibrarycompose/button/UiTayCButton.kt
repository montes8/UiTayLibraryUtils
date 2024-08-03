package com.gb.vale.uitaylibrarycompose.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.gb.vale.uitaylibrarycompose.R
import com.gb.vale.uitaylibrarycompose.model.UTStyleCButton
import com.gb.vale.uitaylibrarycompose.model.UiTayButtonModel
import com.gb.vale.uitaylibrarycompose.model.UiTaySwitchModel
import com.gb.vale.uitaylibrarycompose.model.uiTayBackground
import com.gb.vale.uitaylibrarycompose.model.uiTayStroke
import com.gb.vale.uitaylibrarycompose.model.uiTayTextColor
import com.gb.vale.uitaylibrarycompose.model.utBtnState
import com.gb.vale.uitaylibrarycompose.utils.UI_TAY_TEXT_DEFAUL
import com.gb.vale.uitaylibrarycompose.utils.uiTayNoRippleClickable


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

@Composable
fun UiTaySwitchCustom(isChecked : Boolean = false,
                      uiTayCheckedChange: (Boolean) -> Unit){
    Row(
        modifier = Modifier
            .height(30.dp)
            .width(70.dp)
            .clip(RoundedCornerShape(30.dp))
            .border(1.dp, Color.Magenta, CircleShape)
            .background(Color.White).uiTayNoRippleClickable{
                uiTayCheckedChange.invoke(!isChecked)
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement= if(isChecked) Arrangement.End else Arrangement.Start

    ) {
        Image(
            painter = painterResource(R.drawable.uic_tay_bg_circle),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(28.dp).padding(2.dp)
                .clip(CircleShape)                       // clip to the circle shape
                .border(2.dp, Color.Black, CircleShape)
                .background(Color.Magenta) ,
            contentDescription = "",
            alignment = Alignment.Center
        )
    }
}

@Composable
fun UiTaySwitch(isChecked : Boolean = false,
                uTModel : UiTaySwitchModel = UiTaySwitchModel(),
                uiTayCheckedChange: (Boolean) -> Unit){
    Row(
        modifier = Modifier
            .height(uTModel.uTHeight.dp)
            .width(uTModel.uTWidth.dp)
            .clip(RoundedCornerShape(uTModel.uTRadiusCtn.dp))

            .border(uTModel.uTSizeStrokeCtn.dp,
                colorResource(if(isChecked) uTModel.uTBgStrokeSelecedCtn else uTModel.uTBgStrokeUnSelecedCtn)
                ,
                CircleShape)
            .background(colorResource(if(isChecked) uTModel.uTBgSelecedCtn else uTModel.uTBgUnSelecedCtn)).uiTayNoRippleClickable{
                uiTayCheckedChange.invoke(!isChecked)
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement= if(isChecked) Arrangement.End else Arrangement.Start

    ) {
        Box(
            modifier = Modifier
                .size((uTModel.uTHeight - uTModel.uTPadding).dp).padding(uTModel.uTPadding.dp)
                .clip(CircleShape)
                .border(uTModel.uTSizeStroke.dp,
                    colorResource(if(isChecked) uTModel.uTBgStrokeSeleced else uTModel.uTBgStrokeUnSeleced)
                    , CircleShape)
                .background( colorResource(if(isChecked) uTModel.uTBgSeleced else uTModel.uTBgUnSeleced))
        )
    }
}

