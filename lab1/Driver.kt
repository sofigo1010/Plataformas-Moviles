package com.example.lab1

//////se hizo todo aquí en vez de mandarlo a llamar a la main activity class porque Ana nos dijo que estaba mejor así

class Driver (var names: String, var teams: String, var countries: String, var numbers: Int){
    override fun toString(): String {
        return "Datos del driver:\n  -Nombre: $names\n" +
                "  -Equipo: $teams\n" +
                "  -Pais: $countries\n" +
                "  -Numero: $numbers\n" +
                "  "
    }
}

fun main (){
    // ejercicio 1
    val driver1 = Driver(names =  "Paquita la del Barrio", teams = "Mercedez Benz", countries = "Guatemala", numbers = 40)
    val driver2 = Driver(names =  "Amazonico Perico", teams = "RedBull", countries = "Brazil", numbers = 50)
    val driver3 = Driver(names =  "Martini Prosseco", teams = "BMW", countries = "Italia", numbers = 40)
    println ("EJERCICIO #1:\n\n Los datos del primer driver son: \n Nombre: ${driver1.names}\n Equipo: ${driver1.teams}\n Pais: ${driver1.countries}\n Numeros: ${driver1.numbers}\n\n")
    println ("Los datos del segundo driver son: \n Nombre: ${driver2.names}\n Equipo: ${driver2.teams}\n Pais: ${driver2.countries}\n Numeros: ${driver2.numbers}\n\n")
    println ("Los datos del tercer driver son: \n Nombre: ${driver3.names}\n Equipo: ${driver3.teams}\n Pais: ${driver3.countries}\n Numeros: ${driver3.numbers}\n\n")

    //ejercicio 2
    if (driver1.countries != driver2.countries && driver1.countries != driver3.countries){
        println("EJERCICIO #2:\n" +
                "\nEl corredor 1 sí puede correr porque nadie es del mismo país\n")
    }
    else{
        println("EJERCICIO #2:\n" +
                "\nEl corredor 1 no puede correr porque ya hay alguien de su país en la lista\n")
    }

    //ejercicio 3
    var drivercopy = driver1
    println("EJERCICIO #3:\n" +
            "\nEl nombre inicial de la copia del driver es: ${drivercopy.names}")
    drivercopy.names = "Camisón pedirri"
    println("El nuevo nombre de la copia es ${drivercopy.names}\n\n")

    // ejercicio 4

    val nombre = drivercopy.names
    val teams = drivercopy.teams
    val countries = drivercopy.countries
    val numbers = drivercopy.numbers
    println("EJERCICIO #4:\n" +
            "\nLos datos por separado son: \n"+nombre+ "\n" + teams+ "\n" + countries + "\n" +numbers+"\n\n")

    //ejercicio 5
    println("EJERCICIO #5:\n" +
            "\n"+drivercopy.toString())
}