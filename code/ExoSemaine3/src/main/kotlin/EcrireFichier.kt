import java.io.File

fun main(args: Array<String>){
    var nomFichier = args[0]
    var fichier = File(nomFichier)
    if(!fichier.exists())
    {
        fichier.createNewFile()
        fichier.writeText(args[1])

    }



}