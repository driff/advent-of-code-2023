package org.aoc

import org.aoc.aoc.puzzles.PuzzleSolvers.day01Puzzle
import org.aoc.aoc.puzzles.PuzzleSolvers.day02Puzzle
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
    println("file: name -> $name / size -> ${length()/1024} kb")
    val result = when(name) {
        "day01.txt" -> String.format("$name\nPart1 Result: %d\nPart2 result: %d", *day01Puzzle().solve(readLines()))
        "day02.txt" -> String.format("$name\nPart1 Result: %d\nPart2 result: %d", *day02Puzzle().solve(readLines()))
        else -> "no puzzle found for file -> $name"
    }
    println(result)
    println("--------------------------------------------------")
}

