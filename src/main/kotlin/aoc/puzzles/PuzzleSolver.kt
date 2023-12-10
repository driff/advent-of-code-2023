package org.aoc.aoc.puzzles

import day02APuzzle
import day02BPuzzle
import org.aoc.aoc.puzzles.days.day01aPuzzle
import org.aoc.aoc.puzzles.days.day01bPuzzle

fun interface Puzzles {
    fun solve(lines: List<String>): Array<Int>
}

object PuzzleSolvers {

    fun day01Puzzle() = Puzzles {
        arrayOf(day01aPuzzle(it), day01bPuzzle(it))
    }

    fun day02Puzzle() = Puzzles {
        arrayOf(day02APuzzle(it), day02BPuzzle(it))
    }

}