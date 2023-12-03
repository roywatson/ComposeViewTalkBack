package com.roywatson.garage.composeviewtalkback

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.semantics.isTraversalGroup
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun ComposeContent(
    onToggleShowSettings: () -> Unit,
) {
    val model: TalkBackComposeViewViewModel = viewModel()

    if(model.showSettings.value) {
        Surface(
            modifier = Modifier
                .semantics(true) { isTraversalGroup = true }
                .fillMaxSize()
                .background(Color.LightGray),
        ) {
            Box(
                modifier = Modifier
                    .fillMaxSize(),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    text = "Scrim",
                    fontSize = 48.sp,
                )
            }
        }
    }
    Box(
        modifier = Modifier
            .fillMaxSize(),
        contentAlignment = Alignment.TopCenter,
    ) {
        ReaderTopBar(onReaderSettingsButton = { onToggleShowSettings() })
    }
}