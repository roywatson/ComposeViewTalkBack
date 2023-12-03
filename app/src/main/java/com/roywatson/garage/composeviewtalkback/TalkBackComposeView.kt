package com.roywatson.garage.composeviewtalkback

import android.content.Context
import android.util.AttributeSet
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.AbstractComposeView
import androidx.lifecycle.viewmodel.compose.viewModel

class TalkBackComposeView @JvmOverloads constructor (
    context: Context,
    attributes: AttributeSet? = null,
    defStyleAttr: Int = 0,
) : AbstractComposeView(context, attributes, defStyleAttr) {

    @Composable
    override fun Content() {
        val model: TalkBackComposeViewViewModel = viewModel()

        ComposeContent(
            onToggleShowSettings = { model.showSettings.value = !model.showSettings.value }
        )
    }
}