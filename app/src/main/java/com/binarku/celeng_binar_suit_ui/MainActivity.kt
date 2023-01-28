package com.binarku.celeng_binar_suit_ui

fun main() {
    while (true) {
        println("================================================")
        println("           GAME SUIT TERMINAL VERSION           ")
        println("================================================")

        println("Masukkan input pemain 1 (gunting/batu/kertas):")
        val player1 = readLine()

        println("Masukkan input pemain 2 (gunting/batu/kertas):")
        val player2 = readLine()

        when {
            player1 == "gunting" && player2 == "batu" -> println("Pemain 1 menang!")
            player1 == "batu" && player2 == "gunting" -> println("Pemain 2 menang!")
            player1 == "gunting" && player2 == "kertas" -> println("Pemain 2 menang!")
            player1 == "kertas" && player2 == "gunting" -> println("Pemain 1 menang!")
            player1 == "batu" && player2 == "kertas" -> println("Pemain 1 menang!")
            player1 == "kertas" && player2 == "batu" -> println("Pemain 2 menang!")
            player1 == player2 -> println("Seri!")
            else -> println("Input tidak valid")
        }
    }
}
