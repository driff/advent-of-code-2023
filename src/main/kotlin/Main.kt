package org.aoc

import org.aoc.aoc.puzzles.days.day01aPuzzle
import org.aoc.aoc.utils.FileReader.listAllFiles
import java.io.File

fun main() {
    println("Hello World!")
    listAllFiles("./assets")
        .forEach {file ->
            println("want to load ${file.name}? y/n")
            readlnOrNull()?.takeIf { it.uppercase() == "Y"}?.let {
                file.loadPuzzle()
            }
        }

    val fileName = readlnOrNull()
}

fun File.loadPuzzle() {
    println("file size -> ${length()/1024} kb")
    println("result =>> ${day01aPuzzle(readLines())}")
}

