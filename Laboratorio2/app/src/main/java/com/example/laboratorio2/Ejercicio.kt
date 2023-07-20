package com.example.laboratorio2

class Ejercicio {

    fun calcularpromedio (numbers : List<Int>){
        var suma = numbers.reduce { acc, num ->  acc + num }/numbers.size
        println("El promedio de la lista de los numeros es: "+ suma)
    }

    fun separarlosimpares (numbers : List<Int>){
        val numerosImpares = numbers.filter { it % 2 != 0 }
        println("Los numeros impares de la lista son: " + numerosImpares)
    }

    fun isPalindrome(input: String) {
        val cleanedInput = input.replace("\\W".toRegex(), "").lowercase()
        if (cleanedInput.reversed() == cleanedInput){
            println("Sí es Palindromo")
        }
        else{
            println("No es Palindromo")
        }
    }

    fun saludarnombres (nombres : List<String>){
        val saludos = nombres.map { "¡Hola, $it!" }
        saludos.forEach { println(it) }
    }

    fun performOperation(a: Int, b: Int, operacion: (Int, Int) -> Int) {
        println("Resultado de la operación: " + operacion(a, b))
    }

    data class Person(val name: String, val age: Int, val gender: String)
    data class Student(val name: String, val age: Int, val gender: String, val studentId: String)

    fun mapToStudent(personList: List<Person>) {
        personList.forEach { person ->
            val student = Student(person.name, person.age, person.gender, "ID-${person.name.hashCode()}")
            println("El Estudiante ${student.name} tiene ${student.age} años.")
        }
    }

}

fun main (){
    val lab = Ejercicio()
    lab.calcularpromedio(listOf(1,2,3,4,5))
    lab.separarlosimpares(listOf(1,2,3,4,5))
    lab.isPalindrome("ojo")
    lab.isPalindrome("macaco")
    lab.saludarnombres(listOf("Paco", "Masha","Santi"))
    lab.performOperation(5, 3) { x, y -> x + y }
    lab.performOperation(10, 4) { x, y -> x - y }

    val personas = listOf(
        Ejercicio.Person("Alice", 25, "F"),
        Ejercicio.Person("Bob", 21, "M"),
        Ejercicio.Person("Eve", 22, "F")
    )

    lab.mapToStudent(personas)
}














