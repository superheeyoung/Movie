package com.superheeyoung.movie.ui.components.dialog.components.content

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.superheeyoung.movie.ui.models.dialog.DialogTitle
import com.superheeyoung.movie.ui.theme.Paddings
import com.superheeyoung.movie.ui.theme.colorScheme
import com.superheeyoung.movie.ui.theme.h5Title

@Composable
fun DialogTitleWrapper(title : DialogTitle) {
    when(title) {
        is DialogTitle.Default -> {
            DefaultDialogTitle(title)
        }
        is DialogTitle.Header -> {
            HeaderDialogTitle(title)
        }
        is DialogTitle.Large -> {
            LargeDialogTitle(title)
        }
    }
}

@Composable
fun HeaderDialogTitle(title: DialogTitle.Header) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
            .padding(Paddings.large),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title.text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h3.copy(
                color = MaterialTheme.colorScheme.onPrimary
            )
        )
    }
}
@Composable
fun LargeDialogTitle(title: DialogTitle.Large) {
    Column(
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = title.text,
            modifier = Modifier
                .padding(all = Paddings.xlarge)
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h5Title,
            color = MaterialTheme.colors.secondary
        )
    }
}

@Composable
fun DefaultDialogTitle(title: DialogTitle.Default) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colors.onPrimary)
            .padding(
                horizontal = Paddings.large,
                vertical = Paddings.extra
            ),
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            title.text,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),
            textAlign = TextAlign.Center,
            style = MaterialTheme.typography.h5.copy(
                color = MaterialTheme.colors.secondary
            )
        )
    }
}