package com.example.accessdots.components

import androidx.compose.animation.Animatable
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Switch
import androidx.compose.material.SwitchDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Circle
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HomeScreen(switchState: MutableState<Boolean>,travelDistance: Dp =20.dp) {
    val circles=listOf(
        remember{ androidx.compose.animation.core.Animatable(initialValue = 0f) } ,
        remember{ androidx.compose.animation.core.Animatable(initialValue = 0f) } ,
        remember{ androidx.compose.animation.core.Animatable(initialValue = 0f) }
    )
    val circleValues=circles.map { it.value }
    val distance = with(LocalDensity.current){travelDistance.toPx()}
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
    ) {
        Row(
            modifier = Modifier
                .padding(start = 24.dp)
                .fillMaxWidth()
            ,
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        )
        {

            Image(
                imageVector = Icons.Filled.Circle,
                contentDescription = "",
                modifier = Modifier
                    .size(20.dp)
                    .clip(
                        CircleShape
                    ),
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary)
            )
            Image(
                imageVector = Icons.Filled.Circle,
                contentDescription = "",
                modifier = Modifier
                    .size(20.dp)
                    .clip(
                        CircleShape
                    ),
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.secondary)
            )
            Image(
                imageVector = Icons.Filled.Circle,
                contentDescription = "",
                modifier = Modifier
                    .size(20.dp)
                    .clip(
                        CircleShape
                    ),
                colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.tertiary)
            )

        }
        Row(modifier = Modifier.padding(start = 24.dp,top=8.dp))
        {
            Text(text = "Access Dots", fontSize = 30.sp, fontFamily = FontFamily.SansSerif, color = MaterialTheme.colorScheme.onBackground)
            Switch(checked = switchState.value, onCheckedChange = {switchState.value=it},Modifier.padding(start = 16.dp),colors = SwitchDefaults.colors(
                checkedThumbColor = MaterialTheme.colorScheme.onTertiary,
                uncheckedThumbColor = MaterialTheme.colorScheme.onSurfaceVariant,
                checkedTrackColor = MaterialTheme.colorScheme.tertiary,
                uncheckedTrackColor = MaterialTheme.colorScheme.onSurface,
                checkedTrackAlpha = 1.0f,
                uncheckedTrackAlpha = 1.0f
            ))
        }
        Row(modifier = Modifier.padding(start = 24.dp))
        {
            Text(
                text = "Early release , under development...",
                fontFamily = FontFamily.Cursive,
                fontSize = 24.sp,
                color = MaterialTheme.colorScheme.onSurface
            )
        }

    }
}