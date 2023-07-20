package com.example.lab1

class Exercise2 {

    fun watchthesunset (buildings: IntArray, direction : String): IntArray {
        val sunsetenjoyers = mutableListOf<Int>()
        if (direction == "EAST") {
            var highest = 0
            for (i in buildings.size - 1 downTo 0) {
                if (buildings[i] > highest) {
                    sunsetenjoyers.add(i)
                    highest = buildings[i]
                }
            }
        } else if (direction == "WEST") {
            var highest = 0
            for (i in 0 until buildings.size) {
                if (buildings[i] > highest) {
                    sunsetenjoyers.add(i)
                    highest = buildings[i]
                }
            }
        }
        return sunsetenjoyers.toIntArray().sortedArray()
    }
}

fun main() {
    val exercise2 = Exercise2()
    println("Lista de edificios que verán el atardecer según su orden de posición: "+ exercise2.watchthesunset(intArrayOf(3,5,4,4,3,1,3,2), "WEST").contentToString())

}