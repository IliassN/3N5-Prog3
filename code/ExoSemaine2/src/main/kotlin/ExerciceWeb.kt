package org.nafile

import org.jsoup.Jsoup;

fun main(args : Array<String>){
    if(args.isEmpty())
    {
        print("Veuillez ajouter un lien URL en argument")
        return
    }
    val url = args[0]
    try{
        val document = Jsoup.connect(url).get()
        val contenu = document.html()
        println(contenu)
    }
    catch(e: Exception){
        println("Erreur lors de la récupération de contenu")
    }


}
