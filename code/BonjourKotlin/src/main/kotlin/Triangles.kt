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
    for(n in 1..5)
    {
        print(triangle(4))
        print(triangle(8))
        print(triangle(10))
        print(triangle(100))

    }
}