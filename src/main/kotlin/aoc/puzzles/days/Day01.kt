package org.aoc.aoc.puzzles.days

fun day01aPuzzle(lines: List<String>): Int =
    lines.takeUnless { it.isEmpty() }?.fold(0) {acc, current ->
        val number = current.findDigitsInText()
        return@fold acc + number
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

enum class Digits(val number: Char) {
    one('1'),
    two('2'),
    three('3'),
    four('4'),
    five('5'),
    six('6'),
    seven('7'),
    eight('8'),
    nine('9')
}

fun day01bPuzzle(lines: List<String>): Int =
    lines.takeUnless { it.isEmpty() }?.fold(0) { acc, current ->
        val number = current.findNumbersInText()
        return@fold acc + number
    }?: 0

private fun String.findNumbersInText(): Int = fold(DigitData(arrayOfNulls(2), null)) { dataAcc, c ->
    val (acc) = dataAcc
    return@fold c.takeIf(Char::isDigit)?.let {
        return@fold DigitData(getUpdatedAccumulator(acc, c), null)
    }?: getDigitNameFromChar(c, dataAcc)
    ?: dataAcc.copy(second = null)
}.first.takeUnless { it[0] == null }
    ?.let {
        if(it[1] == null) {
            it[1] = it[0]
        }
        "${it[0]}${it[1]}".toInt()
    }?: 0

fun getUpdatedAccumulator(acc: Array<Char?>, current: Char): Array<Char?> {
    val newAcc = arrayOf(acc[0], acc[1])
    if(acc.isEmpty() || acc[0] == null) newAcc[0] = current
    else newAcc[1] = current
    return newAcc
}

private fun getDigitNameFromChar(current: Char, digitData: DigitData): DigitData? {
    val (acc, digits) = digitData
//    val currentIndex = index?.let { it + 1 }?: 0
    val currentDigits: MutableList<Pair<Digits, Int>> = digits?.toMutableList()?: mutableListOf()
    currentDigits.addAll(Digits.entries.map { it to 0 })
//    println("current char $current")
    return currentDigits.filter { (digit, currentIndex) -> digit.name[(currentIndex) ] == current }
        .takeIf { it.isNotEmpty() }
        ?.map { it.copy(second = it.second + 1) }
        ?.fold(acc to mutableListOf<Pair<Digits, Int>>()) { (globalAcc, globalList), (currentDigit, currentIndex) ->
            if (currentIndex == currentDigit.name.length) {
                return@fold getUpdatedAccumulator(globalAcc, currentDigit.number) to globalList
            } else {
                globalList.add(currentDigit to currentIndex)
                return@fold globalAcc to globalList
            }
        }
}

typealias DigitData = Pair<Array<Char?>, List<Pair<Digits, Int>>?>