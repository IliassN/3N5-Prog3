package org.nafile

fun triangle(hauteur : Int) : String {
    val sb = StringBuilder();
    for (i in 1..hauteur)
    {
        for(o in 1.. i)
        {
            sb.append("*")
        }
        sb.append("\n")
    }

    return sb.toString()
}

fun main()
{
    print(triangle(5))
}