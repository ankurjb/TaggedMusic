package composable.navigation

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import org.jetbrains.compose.resources.ExperimentalResourceApi
import org.jetbrains.compose.resources.painterResource
import taggedmusic.composeapp.generated.resources.Res
import taggedmusic.composeapp.generated.resources.baseline_home_24
import taggedmusic.composeapp.generated.resources.baseline_library_music_24
import taggedmusic.composeapp.generated.resources.baseline_search_24

@OptIn(ExperimentalResourceApi::class)
@Composable
fun MusicNavigation(
    modifier: Modifier = Modifier
) {
    BottomNavigation(backgroundColor = Color.Black) {
        BottomNavigationItem(
            selected = true,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(Res.drawable.baseline_home_24),
                    contentDescription = "Home",
                    tint = Color.White
                )
            },
            label = { Text("Home", color = Color.White) }
        )

        BottomNavigationItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(Res.drawable.baseline_search_24),
                    contentDescription = "Search",
                    tint = Color.White
                )
            },
            label = { Text("Search", color = Color.White) }
        )

        BottomNavigationItem(
            selected = false,
            onClick = {},
            icon = {
                Icon(
                    painter = painterResource(Res.drawable.baseline_library_music_24),
                    contentDescription = "Library",
                    tint = Color.White
                )
            },
            label = { Text("Library", color = Color.White) }
        )
    }
}