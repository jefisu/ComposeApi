package com.jefisu.composeapi.features.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jefisu.composeapi.features.data.model.Todo

@Composable
fun CardItem(
    todo: Todo
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 6.dp, end = 6.dp, start = 6.dp),
        shape = RoundedCornerShape(15.dp),
        backgroundColor = MaterialTheme.colors.onSecondary,
        elevation = 0.dp
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(text = "${todo.id} - ", fontSize = 25.sp, color = Color.White)
            Spacer(modifier = Modifier.width(8.dp))
            Text(text = todo.title, fontSize = 18.sp, color = Color.White)
        }
    }
}