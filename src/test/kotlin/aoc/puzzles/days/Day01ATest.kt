package aoc.puzzles.days

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.ints.shouldBeExactly
import org.aoc.aoc.puzzles.days.day01aPuzzle
import org.junit.jupiter.api.AfterEach
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

/**
 * The newly-improved calibration document consists of lines of text;
 * each line originally contained a specific calibration value that
 * the Elves now need to recover. On each line, the calibration value
 * can be found by combining the first digit and the last digit (in that order)
 * to form a single two-digit number.
 *
 *
 * For example:
 *
 * 1abc2
 * pqr3stu8vwx
 * a1b2c3d4e5f
 * treb7uchet
 * In this example, the calibration values of these four lines are 12, 38, 15, and 77.
 * Adding these together produces 142.
 *
 * --- Part Two ---
 * Your calculation isn't quite right. It looks like some of the digits are actually
 * spelled out with letters: one, two, three, four, five, six, seven, eight, and nine
 * also count as valid "digits".
 *
 * Equipped with this new information, you now need to find the real first and last
 * digit on each line. For example:
 *
 * two1nine
 * eightwothree
 * abcone2threexyz
 * xtwone3four
 * 4nineeightseven2
 * zoneight234
 * 7pqrstsixteen
 * In this example, the calibration values are 29, 83, 13, 24, 42, 14, and 76.
 * Adding these together produces 281.
 */

class Day01ATest: BehaviorSpec({

    given("day01aPuzzle is invoked") {
        and("text list instance") {
            lateinit var textList: List<String>
            When("list of text lines is empty") {
                textList = listOf<String>()
                then("it should return 0") {
                    day01aPuzzle(textList) shouldBeExactly 0
                }
            }

            When("list contains string with first number 1 and last number 4") {
                textList = listOf("as1df4f")
                then("it should return 14") {
                    day01aPuzzle(textList) shouldBeExactly 14
                }
            }

            When("list contains String with only one number 3") {
                textList = listOf("as3dfgf")
                then("it should return 33"){
                    day01aPuzzle(textList) shouldBeExactly 33
                }
            }
            When("list contains no digit numbers") {
                textList = listOf("asdasdasd")
                then("it should return 0") {
                    day01aPuzzle(textList) shouldBeExactly 0
                }
            }
            When("list contains multiple items") {
                textList = listOf( "1abc2","pqr3stu8vwx",
                        "a1b2c3d4e5f",
                        "treb7uchet" )
                then("it should sum the output of each line") {
                    day01aPuzzle(textList) shouldBeExactly 142
                }
            }

        }
    }

})