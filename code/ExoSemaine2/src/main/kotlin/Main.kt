package org.nafile

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val name = "Kotlin"

    val a = 1                                   // type est
    val aa = 1L                                 // type est
    val aaa = a * 25 + aa * 100                 // type est
    val b = 1.0                                 // type est
    val c = "1"                                 // type est
    val d = true                                // type est
    val laChose = c + b                         // type est
    val k = listOf("1", "2", "3")               // type est
    val l = mutableListOf(true, false, true)    // type est    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    println("Hello, " + name + "!")

    for (i in 1..5) {
        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
        println("i = $i")
    }
}