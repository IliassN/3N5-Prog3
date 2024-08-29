package org.nafile

fun main(args : Array<String>){
    val chaine = args[0]
    try {
        if(args.isEmpty())
        {
            println("Veuillez fournir des informations en argument")
        }
        else{
           for(i in 0..chaine.length)
           {
               println(chaine[i])
           }
        }
    } catch (e: Exception) {

    }
}