package com.example.laboratorio1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.laboratorio1.ui.theme.Laboratorio1Theme

class MainActivity : ComponentActivity() {
    enum class Team{
        Mercedes,
        RedBullRacing,
        Ferrari,
        McLaren,
        AstonMartin,
        Alpine,
        AlphaTauri,
        AlfaRomeo,
        Haas,
        Williams
    }

    private fun printTeamDetails(team: Team) {
        // Code for printing team details
        when (team) {
            Team.Mercedes -> {
                println("Team: Mercedes\nOpinion publica: es un equipo fuerte con buenos carros, Hamilton ha roto miles de récords, esta season no han ido también han logrado pocos podiums")

            }
            Team.RedBullRacing -> {
                println("Team: Red Bull Racing\n" +
                        "Opinion publica:es un equipo fuerte pero hay mucha competencia interna esta season, Verstappen ha sido el mejor de la temporada, mientras que Checo ha ido mejorando")

            }
            Team.Ferrari -> {
                println("Team: Ferrari\n" +
                        "Opinion publica:la estrategia ha estado pésima lo que ha hecho que bajen su calidad de carreras, la gente está decepcionada y los jugadores también")

            }
            Team.McLaren -> {
                println("Team: McLaren\n" +
                        "Opinion publica:no han obtenido muchos podiums, han estado un poco lentos pero siguen motivados")

            }
            Team.AstonMartin -> {
                println("Team: Aston Martin\n" +
                        "Opinion publica:")

            }
            Team.Alpine -> {
                println("Team: Alpine\n" +
                        "Opinion publica:")

            }
            Team.AlphaTauri -> {
                println("Team: AlphaTauri\n" +
                        "Opinion publica:")

            }
            Team.AlfaRomeo -> {
                println("Team: Alfa Romeo\n" +
                        "Opinion publica:")

            }
            Team.Haas -> {
                println("Team: Haas\n" +
                        "Opinion publica:")

            }
            Team.Williams -> {
                println("Team: Williams\n" +
                        "Opinion publica:")

            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val team = Team.Mercedes // Sample team
        printTeamDetails(team)

        setContent {
            Laboratorio1Theme {
                Greeting("Android")
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
    Laboratorio1Theme {
        Greeting("Android")
    }
}