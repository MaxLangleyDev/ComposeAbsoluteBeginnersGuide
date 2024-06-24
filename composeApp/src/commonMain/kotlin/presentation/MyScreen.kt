package presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MyScreen(modifier: Modifier = Modifier.fillMaxSize()){

    // State
    var username by remember { mutableStateOf("") }
    var textInput by remember { mutableStateOf("") }

    // UI
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Hello, ${username}!")

        Spacer(modifier = Modifier.height(8.dp))

        Text(text = "Subscribe to MaxDev!")

        Spacer(modifier = Modifier.height(8.dp))

        OutlinedTextField(
            value = textInput,

            onValueChange = { newText ->
                textInput = newText
            }
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                username = textInput.ifBlank { "World" }
                textInput = ""
            }
        ){
            Text( text = "Submit" )
        }
    }

}