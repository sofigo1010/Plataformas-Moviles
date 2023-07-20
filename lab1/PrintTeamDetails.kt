package com.example.lab1

class PrintTeamDetails {
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

    fun pprintTeamDetails(team: Team) {

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
                        "Opinion publica:Fue el segundo mejor carro en Bahrein y Jeddah, y volvió a lograr el tercer podio del año en Australia peleando con Mercedes y Ferrari en ritmos iguales.")

            }
            Team.Alpine -> {
                println("Team: Alpine\n" +
                        "Opinion publica:  inicio de temporada no ha sido como esperaba, estructura francesa parece haber dado un paso atrás en cuanto a sus opciones de luchar por podios y estar cerca de los equipos punteros de la parrilla no solo por problemas de rendimiento, sino también de fiabilidad")

            }
            Team.AlphaTauri -> {
                println("Team: AlphaTauri\n" +
                        "Opinion publica: es el más bajo de la temporada, se incrementó la esperanza con Riccardo pero no han logrado sumar muchos puntos en esta temporada")

            }
            Team.AlfaRomeo -> {
                println("Team: Alfa Romeo\n" +
                        "Opinion publica: Bottas está positivo sobre las próximas carreras y cree que si tienen el potencial de hacerlo bien, han tenido buen puntaje y tuvieron una buena carrera")

            }
            Team.Haas -> {
                println("Team: Haas\n" +
                        "Opinion publica:  es el equipo más nuevo y pequeño pero real está viendo positivo la forma y estrategia del equipo")

            }
            Team.Williams -> {
                println("Team: Williams\n" +
                        "Opinion publica: firmó a un corredor estadounidense joven y le da esperanza para esta temporada")

            }
        }
    }
}

fun main (){

    val clase = PrintTeamDetails()
    clase.pprintTeamDetails(PrintTeamDetails.Team.Mercedes)


}