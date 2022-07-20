package com.example.accessdots.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Help
import androidx.compose.material.icons.filled.Restore
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Help
import androidx.compose.material.icons.outlined.Restore
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun BottomBar(bottonState: ModalBottomSheetState, scope:CoroutineScope) {
Row(modifier = Modifier
    .fillMaxWidth()
    .background(MaterialTheme.colorScheme.surfaceVariant)
    .padding(8.dp),
    horizontalArrangement = Arrangement.spacedBy(12.dp)
    )
{
    Text("Made In India", fontFamily = FontFamily.Cursive, modifier = Modifier.weight(2.0f).padding(top = 12.dp), color = MaterialTheme.colorScheme.onBackground, fontWeight = FontWeight.SemiBold)
    IconButton(onClick = {scope.launch {   bottonState.show()} }) {
            Icon(imageVector = Icons.Default.Help, contentDescription ="Help" , tint = MaterialTheme.colorScheme.onPrimaryContainer,)
    }
    IconButton(onClick = {scope.launch {   bottonState.show()}}) {
        Icon(imageVector = Icons.Default.Settings, contentDescription ="Settings" ,tint = MaterialTheme.colorScheme.onPrimaryContainer)
    }
    IconButton(onClick = {scope.launch {   bottonState.show()} }) {
        Icon(imageVector = Icons.Outlined.Restore , contentDescription = "Restore",tint = MaterialTheme.colorScheme.onPrimaryContainer)
    }

}
}