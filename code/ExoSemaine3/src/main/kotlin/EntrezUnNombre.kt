fun main(){
    var question = "Veuillez entrer un nombre : "
    println(question)


    while(true){

        var reponse = readln()
        var nombre = reponse.toIntOrNull()
        if(nombre != null )
        {
            println("Merci, votre nombre est $nombre.")
            return
        }
        else{
            println("Ceci n'est pas un nombre, veuillez entrer un nombre :")
        }
    }



}