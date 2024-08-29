package org.nafile

import kotlin.random.Random


fun main(){
    creeTableauAleatoire(2)
    creeSomme(creeTableauAleatoire(2))
}

fun creeTableauAleatoire(n:Int) : Array<Int>{

    val randomValues = List(n){ Random.nextInt(0,100)}
    println(randomValues)

    var array = arrayOf(n)
    return array
}

fun creeSomme(g:Array<Int>) : Int{


    var somme = g.sum()
    print(somme)

    return somme

}