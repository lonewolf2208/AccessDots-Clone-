package com.example.accessdots.components

import androidx.compose.runtime.Composable

@Composable
fun SheetLayout(
    bottomSheetType: BottomSheetType,
){

    when(bottomSheetType){
        BottomSheetType.BottomsSheetHelp -> BottomSheetHelp()
        BottomSheetType.BottomSheetLog -> BottomSheetLog()
        BottomSheetType.BottomSheetSettings -> BottomSheetHelp()
    }

}