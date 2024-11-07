package org.example

fun main()
{
 val tableau = arrayOf("Un", "Deux", "Trois")

    try{
        val index = trouverue(tableau, tableau[1])
        println("L'élément " + tableau[1] + " a été trouvé à l'index " + index)

    } catch (e : ExceptionElement) {
        println(e.message)
    }

    try{
        val index = trouverue(tableau, "Huit")
        println("L'élément 'Huit' a été trouvé à l'index " + index)

    } catch (e : ExceptionElement) {
        println(e.message)
    }

}

fun trouverue(tableau: Array<String>, elementCherche:String) : Int
{
    for(i in 0.. tableau.size -1)
    {
        if(tableau[i] == elementCherche)
        {
            return i
        }
    }
    throw ExceptionElement("L'élément " + elementCherche + " n'a pas été trouvé dans le tableau")

}