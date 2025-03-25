package br.senai.sp.jandira.BMI

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import br.senai.sp.jandira.BMI.screens.BMIResultScreen
import br.senai.sp.jandira.BMI.screens.HomeScreen
import br.senai.sp.jandira.BMI.screens.UserDataScreens
import br.senai.sp.jandira.BMI.ui.theme.BMITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BMITheme {
                val controleDeNavegacao = rememberNavController()
                NavHost(
                    navController = controleDeNavegacao,
                    startDestination = "home"
                ){
                    composable(route = "home"){ HomeScreen(controleDeNavegacao) }
                    composable(route = "user_data"){ UserDataScreens(controleDeNavegacao) }
                    composable(route = "bmi_screen"){ BMIResultScreen(controleDeNavegacao) }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BMITheme {
        Greeting("Android")
    }
}