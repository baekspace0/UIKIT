import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.WindowState
import androidx.compose.ui.window.application

enum class Screen {
    HOME, TIMETABLE, BOARD, REVIEW, MYPAGE
}

@Composable
@Preview
fun App() {
    var currentScreen by remember { mutableStateOf(Screen.HOME) }

    MaterialTheme {
        Row(
            modifier = Modifier.fillMaxSize().background(Color(0xFFF8F9FA))
        ) {
            // 왼쪽 사이드바
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .fillMaxHeight()
                    .background(Color.White)
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp),
                horizontalAlignment = Alignment.Start
            ) {
                TextButton(onClick = { currentScreen = Screen.HOME }) { Text("🏠 Home", color = Color.Black) }
                TextButton(onClick = { currentScreen = Screen.TIMETABLE }) { Text("🗓️ Timetable", color = Color.Black) }
                TextButton(onClick = { currentScreen = Screen.BOARD }) { Text("📝 Board", color = Color.Black) }
                TextButton(onClick = { currentScreen = Screen.REVIEW }) { Text("🧠 Review", color = Color.Black) }
                TextButton(onClick = { currentScreen = Screen.MYPAGE }) { Text("⚙️ MyPage", color = Color.Black) }
            }

            Divider(color = Color.LightGray, modifier = Modifier.width(1.dp).fillMaxHeight())

            // 오른쪽 메인 콘텐츠
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp)
            ) {
                when (currentScreen) {
                    Screen.HOME -> HomeScreen()
                    Screen.TIMETABLE -> TimetableScreen()
                    Screen.BOARD -> BoardScreen()
                    Screen.REVIEW -> ReviewScreen()
                    Screen.MYPAGE -> MyPageScreen()
                }
            }
        }
    }
}

@Composable
fun HomeScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Home 화면", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun TimetableScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Timetable 화면", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun BoardScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Board 화면", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun ReviewScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("Review 화면", style = MaterialTheme.typography.h4)
    }
}

@Composable
fun MyPageScreen() {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Text("MyPage 화면", style = MaterialTheme.typography.h4)
    }
}

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "KIT Desktop",
        state = WindowState(width = 1000.dp, height = 700.dp),
        resizable = false
    ) {
        App()
    }
}
