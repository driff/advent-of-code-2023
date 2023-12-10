package org.aoc

import org.aoc.aoc.puzzles.days.day01aPuzzle
import org.aoc.aoc.puzzles.days.day01bPuzzle
import org.aoc.aoc.utils.FileReader.listAllFiles
import java.io.File
import kotlin.system.exitProcess

fun main() {
    println("Hello World!")
    listAllFiles("./assets")
        .forEach {file ->
            println("calculating result from -> ${file.name} ")
            file.loadPuzzle()
        }
    exitProcess(0)
}

fun File.loadPuzzle() {
    println("file size -> ${length()/1024} kb")
    println("result =>> ${day01bPuzzle(readLines())}")
}

