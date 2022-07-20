package com.example.accessdots

import android.os.Bundle

import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.ModalBottomSheetLayout
import androidx.compose.material.ModalBottomSheetValue
import androidx.compose.material.rememberModalBottomSheetState
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.accessdots.components.*
import com.example.accessdots.ui.theme.AccessDotsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AccessDotsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class, ExperimentalMaterialApi::class)
@Composable
fun Greeting(name: String) {
    val switchState = remember {
        mutableStateOf(true)
    }
    var currentBottomSheet: BottomSheetType? by remember{
        mutableStateOf(null)
    }
    val scaffoldState= rememberScaffoldState()
    var coroutinescope= rememberCoroutineScope()
    var bottonState= rememberModalBottomSheetState(initialValue = ModalBottomSheetValue.Hidden)
    ModalBottomSheetLayout(sheetState = bottonState, sheetContent = { BottomSheetHelp()})
    {
        Scaffold(scaffoldState = scaffoldState, bottomBar = { BottomBar(bottonState,coroutinescope)}) {
            HomeScreen(switchState)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    AccessDotsTheme {
        Greeting("Android")
    }
}