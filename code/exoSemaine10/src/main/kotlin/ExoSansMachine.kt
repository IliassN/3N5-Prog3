package org.example

import java.io.File
import java.io.FileNotFoundException
import javax.imageio.ImageIO.read

fun main() {
    println(lireDesFichiersForTry())
    println(lireDesFichiersTryFor())
}

fun lireDesFichiersForTry() {
    for (i in 1 until 10) {
        try {
            lireFichier("$i.txt")
        } catch (e: FileNotFoundException) {
            println("fichier n'existe pas")
        }
    }
}

fun lireDesFichiersTryFor() {
    try {
        for (i in 1 until 10) {
            lireFichier("$i.txt")
        }
    } catch (e: FileNotFoundException) {
        println("fichier n'existe pas")
    }
}
fun lireFichier(nomFichier: String) {
    val fichier = File(nomFichier)

    if (fichier.exists()) {
        // Si le fichier existe, on peut lire son contenu
        val contenu = fichier.readText()
        println(contenu)
    } else {
        // Si le fichier n'existe pas, on lève une exception (FileNotFoundException)
        throw FileNotFoundException("Le fichier '$nomFichier' n'a pas été trouvé.")
    }
}

//La différence entre les deux fonctions, c'est que celle du haut va faire des for jusqu'a dix pour avoir 10 fichiers,
//Le deuxième fichier réalise sa fonction for jusqu'à avoir son fichier 1 et s'arrête 
