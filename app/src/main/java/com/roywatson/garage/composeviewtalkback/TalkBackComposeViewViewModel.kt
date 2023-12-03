package com.roywatson.garage.composeviewtalkback

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel

class TalkBackComposeViewViewModel: ViewModel() {

    val showSettings = mutableStateOf<Boolean>(false)

}