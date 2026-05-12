package com.example.emptyactivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.emptyactivity.ui.log_in.view.LoginView
import com.example.emptyactivity.ui.navigation.AppNavigation
import com.example.emptyactivity.ui.theme.AndroidBasicsClassTheme

/** Entry point activity. Hosts [AppNavigation] inside [AndroidBasicsClassTheme]. */
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicsClassTheme {
                LoginView()
                /* AppNavigation() */
            }
        }
    }
}