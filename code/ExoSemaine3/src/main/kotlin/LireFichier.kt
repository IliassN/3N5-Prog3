import java.io.File

fun main(args: Array<String>){
    var nomFichier = args[0]
    var nomFichier2 = args[1]
    var fichier = File(nomFichier)
    var fichier2 = File(nomFichier2)
    if(fichier.exists())
    {
        var texte1 = fichier.readText()
        println(texte1)

    }
    else{
        println("Le fichier $nomFichier n'existe pas!")
    }

}