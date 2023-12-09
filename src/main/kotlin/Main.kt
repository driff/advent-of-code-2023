package org.aoc

import org.aoc.aoc.utils.FileReader.listAllFiles

fun main() {
    println("Hello World!")
    listAllFiles()
        .onEach {
            println(it.name)
        }
}