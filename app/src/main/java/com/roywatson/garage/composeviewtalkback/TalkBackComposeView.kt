package com.roywatson.garage.composeviewtalkback

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.AbstractComposeView
import androidx.lifecycle.viewmodel.compose.viewModel

class TalkBackComposeView @JvmOverloads constructor (
    context: Context,
    attributes: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractComposeView(context, attributes, defStyleAttr) {

    @Composable
    override fun Content() {
        var scrimVisible by remember { mutableStateOf( false ) }
        ComposeContent(
            onToggleShowSettings = { scrimVisible = !scrimVisible },
            scrimVisible,
        )
    }
}