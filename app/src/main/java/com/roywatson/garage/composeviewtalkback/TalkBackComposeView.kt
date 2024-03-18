package com.roywatson.garage.composeviewtalkback

import android.content.Context
import android.util.AttributeSet
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.AbstractComposeView
import androidx.lifecycle.viewmodel.compose.viewModel

class TalkBackComposeView @JvmOverloads constructor (
    context: Context,
    attributes: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractComposeView(context, attributes, defStyleAttr) {

    @OptIn(ExperimentalMaterial3Api::class)
    @Composable
    override fun Content() {
        var scrimVisible by remember { mutableStateOf( false ) }
        Scaffold(
            modifier = Modifier
                .fillMaxSize()
        ) { innerPadding ->
            ComposeContent(
                modifier = Modifier
                    .padding(innerPadding),
                onToggleShowSettings = { scrimVisible = !scrimVisible },
                scrimVisible,
            )
        }
    }
}