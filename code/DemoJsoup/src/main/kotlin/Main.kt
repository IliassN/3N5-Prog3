package org.nafile

import org.jsoup.Jsoup
import org.jsoup.nodes.Document

fun main() {
    val doc: Document = Jsoup.connect("https://en.wikipedia.org/").get()
    doc.select("div img").attr("src", "lien")
    println(doc)
}