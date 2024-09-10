import java.io.File

fun main(args: Array<String>){
    var nomFichier = args[0]
    var fichier = File(nomFichier)
    if(!fichier.exists())
    {
        fichier.createNewFile()

    }
    var fichierParent = File("IliasNafile.txt")
    if(!fichierParent.exists())
    {
        fichierParent.createNewFile()
    }


}