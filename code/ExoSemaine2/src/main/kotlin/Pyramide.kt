package org.nafile

fun main(args : Array<String>){
    for(arg : String in args)
    {
        val hauteur = arg.toInt()
        pyramide(hauteur)
    }


    

}
fun pyramide(hauteur : Int){

    var nbEtoiles = 1;
    var ligne = ""
    var nbEspaces = hauteur -1
    for(i in 1..hauteur)
    {
        ligne = " ".repeat(nbEspaces) + "*".repeat(nbEtoiles)
        nbEtoiles+= 2;
        nbEspaces -=1
        println(ligne)
    }
}


