package aoc.puzzles.days

import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe
import org.aoc.aoc.puzzles.days.day01bPuzzle

class Day01BTest : BehaviorSpec({

    given("day01Puzzle") {
        and("text list instance") {
            lateinit var textList: List<String>
            When("list of text lines is empty") {
                textList = listOf()
                then("it should return 0") {
                    day01bPuzzle(textList) shouldBe 0
                }
            }
            When("list of text lines is 123") {
                textList = listOf("123")
                then("it should return 13") {
                    day01bPuzzle(textList) shouldBe 13
                }
            }
            When("list of text lines is three") {
                textList = listOf("three")
                then("it should return 33") {
                    day01bPuzzle(textList) shouldBe 33
                }
            }
            When("list of text lines is two1nine") {
                textList = listOf("two1nine")
                then("it should return 29") {
                    day01bPuzzle(textList) shouldBe 29
                }
            }
            When("list of text lines is eightwothree") {
                textList = listOf("eightwothree")
                then("it should return 83") {
                    day01bPuzzle(textList) shouldBe 83
                }
            }
            When("list of text lines is 4nineeightseven2") {
                textList = listOf("4nineeightseven2")
                then("it should return 42") {
                    day01bPuzzle(textList) shouldBe 42
                }
            }
            When("list of text lines is zoneight234") {
                textList = listOf("zoneight234")
                then("it should return 14") {
                    day01bPuzzle(textList) shouldBe 14
                }
            }
            When("list of text lines is 1spnthree59ninejjgjdlx") {
                textList = listOf("1spnthree59ninejjgjdlx")
                then("it should return 19") {
                    day01bPuzzle(textList) shouldBe 19
                }
            }
            When("list of text lines is fourfourthreehnbhkmscqxdfksg64bvpppznkh") {
                textList = listOf("fourfourthreehnbhkmscqxdfksg64bvpppznkh")
                then("it should return 44") {
                    day01bPuzzle(textList) shouldBe 44
                }
            }
            When("list of text lines is twone") {
                textList = listOf("twone")
                then("it should return 21") {
                    day01bPuzzle(textList) shouldBe 21
                }
            }
            When("list of text lines is oneightwone") {
                textList = listOf("oneightwone")
                then("it should return 11") {
                    day01bPuzzle(textList) shouldBe 11
                }
            }
            When("list of text lines has multiple items") {
                textList = listOf(
                    "two1nine",
                    "eightwothree",
                    "abcone2threexyz",
                    "xtwone3four",
                    "4nineeightseven2",
                    "zoneight234",
                    "7pqrstsixteen",
                )
                then("it should return 281") {
                    day01bPuzzle(textList) shouldBe 281
                }
            }
        }
    }
})
