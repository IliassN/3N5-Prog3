fun main(args: Array<String>)
{

}

fun liste(nombres : List<Int>){

    var newList : MutableList<String> = mutableListOf()

        for (nombre in nombres)
        {
            newList.add("${nombres * 2}")
        }
        newList.add("\n")
    fichier.append(newList.joinToString(" ---- "))
}