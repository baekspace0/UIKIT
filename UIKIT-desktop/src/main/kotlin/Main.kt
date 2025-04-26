import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

@Composable
@Preview
fun App() {
    var inputText by remember { mutableStateOf("") }
    var displayedText by remember { mutableStateOf("") }

    MaterialTheme {
        Column {
            TextField(
                value = inputText,
                onValueChange = { newText -> inputText = newText },
                label = { Text("여기에 입력하세요") }
            )

            Button(onClick = {
                displayedText = inputText
            }) {
                Text("출력하기")
            }
            Text("출력 결과: $displayedText")
        }
    }
}

fun main() = application {
    Window(onCloseRequest = ::exitApplication, title = "UIKIT Desktop") {
        App()
    }
}
