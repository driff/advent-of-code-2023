package org.aoc.aoc.puzzles.days

fun day01aPuzzle(lines: List<String>): Int =
    lines.takeUnless { it.isEmpty() }?.fold(0) {acc, current ->
        return@fold acc + current.findDigitsInText()
    }?: 0

private fun String.findDigitsInText(): Int = fold(arrayOfNulls<Char>(2)) { acc, c ->
        return@fold c.takeIf(Char::isDigit)?.let {
            if(acc.isEmpty() || acc[0] == null) acc[0] = c
            else acc[1] = c
            return@fold acc
        }?: acc
    }.takeUnless {it[0] == null }?.let {
        if(it[1] == null) {
            it[1] = it[0]
        }
        "${it[0]}${it[1]}".toInt()
    }?: 0

enum class Digits {
    one,
    two,
    three,
    four,
    five,
    six,
    seven,
    eigth,
    nine,
    zero
}