package com.example.accessdots.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.BottomSheetScaffold
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.StarRate
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun BottomSheetHelp()
{
 Box(modifier= Modifier
     .fillMaxWidth()
     .height(170.dp)
     .background(MaterialTheme.colorScheme.secondaryContainer)
     ) {
     Column(Modifier.padding(16.dp).fillMaxSize()) {
         Text(text = "Love the App ?", fontSize = 30.sp, style = MaterialTheme.typography.displayLarge)
         Row(verticalAlignment = Alignment.Bottom, horizontalArrangement = Arrangement.SpaceEvenly, modifier = Modifier.padding(top = 20.dp).fillMaxSize())
         {
             Icon(imageVector = Icons.Default.StarRate, contentDescription = "", tint = MaterialTheme.colorScheme.onSecondaryContainer, modifier = Modifier.size(45.dp))
             Text(text = "Rate", fontSize = 25.sp)
             Icon(imageVector =Icons.Default.Share , contentDescription = "",tint = MaterialTheme.colorScheme.onSecondaryContainer, modifier = Modifier.size(45.dp))
             Text(text = "Share",fontSize = 25.sp)
         }
     }

 }
}
