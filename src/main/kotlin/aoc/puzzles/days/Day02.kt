private fun getEmptyArray() = arrayOf(0, 0, 0)

const val RED = 0
const val GREEN = 1
const val BLUE = 2

typealias CubeValues = Pair<Int, Array<Int>>
private fun maxValues() = arrayOf(12, 13, 14)
fun day02APuzzle(lines: List<String>): Int {
    val maxValues = maxValues()
    return lines.takeUnless { it.isEmpty() }?.fold(0) { acc, current ->
        current.parseInput().let { (gameNumber, cubeValues) ->
            if (cubeValues.isPossible(maxValues)) {
                println("Game $gameNumber is possible -> ${cubeValues.contentToString()}")
                acc + gameNumber
            } else {
//                println("Game $gameNumber is not possible -> ${cubeValues.contentToString()}")
                acc
            }
        }
    }?: 0

}

fun day02BPuzzle(lines: List<String>): Int {
    val maxValues = maxValues()
    return lines.takeUnless { it.isEmpty() }?.fold(0) { acc, current ->
        return@fold current.parseInput().let { (_, cubeValues) -> val (red, green, blue) = cubeValues
            return@let acc + (red * green * blue)
        }
    }?: 0

}

private fun Array<Int>.isPossible(maxValues: Array<Int>): Boolean =
    this[RED] <= maxValues[RED] && this[BLUE] <= maxValues[BLUE] && this[GREEN] <= maxValues[GREEN]

private fun String.getGameNumber() = split(" ").last().toInt()
private fun String.parseInput(): CubeValues = takeIf { it.isNotEmpty() }
    ?.split(":")
    ?.let { it[0].getGameNumber() to it[1].getCubeValues() }
    ?: (0 to getEmptyArray())

private fun String.getCubeValues(): Array<Int> =
    split(";").fold(getEmptyArray()) { acc, currentMatch ->
        currentMatch.split(",")
            .forEach { colorValues ->
                colorValues.trimStart().split(" ")
                    .let { (value, color) ->
                        val intValue = value.toInt()
                        when {
                            color.contains("blue") -> if (intValue > acc[BLUE]) acc[BLUE] = intValue
                            color.contains("red") -> if (intValue > acc[RED]) acc[RED] = intValue
                            color.contains("green") -> if (intValue > acc[GREEN]) acc[GREEN] = intValue
                        }

                    }
            }
            acc
        }

