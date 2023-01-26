package com.example.navigationapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.navigationapp.screen.Add
import com.example.navigationapp.screen.Main
import com.example.navigationapp.screen.Note
import com.example.navigationapp.screen.Start

sealed class NavRouteTest(val roteTest: String){
    object Start: NavRouteTest("start_screen")
    object Main: NavRouteTest("main_screen")
    object Add: NavRouteTest("add_screen")
    object Note: NavRouteTest("note_screen")
}
@Composable
fun NotesNavHost() {
    val navControllerTest = rememberNavController()
    NavHost(navController = navControllerTest, startDestination = NavRouteTest.Start.roteTest){
        composable(NavRouteTest.Start.roteTest){Start(navControllerTest = navControllerTest)}
        composable(NavRouteTest.Main.roteTest){Main(navControllerTest = navControllerTest)}
        composable(NavRouteTest.Add.roteTest){Add(navControllerTest = navControllerTest)}
        composable(NavRouteTest.Note.roteTest){Note(navControllerTest = navControllerTest)}
    }
} 