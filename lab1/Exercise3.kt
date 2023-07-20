package com.example.lab1

class Exercise3 {
    fun getfirstnonrepeatingcharacter (letters: String): Int{
        for (i in letters.indices) {
            val char = letters[i]
            if (letters.indexOf(char) == letters.lastIndexOf(char)) {
                return i
            }
        }
        return -1
    }
}

fun main (){
    val ex3 = Exercise3()
    println("Índice de la primer letra no repetida: "+ex3.getfirstnonrepeatingcharacter("abcdcaf"))
}