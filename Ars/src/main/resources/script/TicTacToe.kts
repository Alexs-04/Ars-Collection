#!/usr/bin/env kotlin

package script

fun checkWin(){
    println("Win")
}


println("**************Bienvenido al juego de Tic Tac Toe**************")
print("A continuación se elige el símbolo con el que se va a jugar, X o O: ")
val player : String = readlnOrNull() ?: "X"
