package aoc.puzzles.days

import day02APuzzle
import day02BPuzzle
import io.kotest.core.spec.style.BehaviorSpec
import io.kotest.matchers.shouldBe

class Day02ATest : BehaviorSpec({
    given("day01aPuzzle") {
        When("input is Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green") {
            val input = listOf("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green")
            Then("result should be 1") {
                day02APuzzle(input) shouldBe 1
            }
        }
        When("input is Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue") {
            val input = listOf("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue")
            Then("result should be 2") {
                day02APuzzle(input) shouldBe 2
            }
        }
        // Game 2: 3 green, 8 red, 1 blue; 5 green, 6 blue; 4 green, 4 blue, 10 red; 2 green, 6 red, 4 blue; 8 red, 11 blue, 4 green; 10 red, 10 blue
        When("input is Game 2: 3 green, 8 red, 1 blue; 5 green, 6 blue; 4 green, 4 blue, 10 red; 2 green, 6 red, 4 blue; 8 red, 11 blue, 4 green; 10 red, 10 blue") {
            val input = listOf(
                "Game 2: 3 green, 8 red, 1 blue; 5 green, 6 blue; 4 green, 4 blue, 10 red; 2 green, 6 red, 4 blue; 8 red, 11 blue, 4 green; 10 red, 10 blue"
            )
            Then("result should be 2") {
                day02APuzzle(input) shouldBe 2
            }
        }
        When("Input has multiple valid items") {
            val input = listOf(
                "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
                "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
                "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
                "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green",
            )
            Then("result should be 8") {
                day02APuzzle(input) shouldBe 8
            }
        }
    }

    given("day02BPuzzle") {
        // Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green
        //Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue
        //Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red
        //Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red
        //Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green
        When("input is Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green") {
            val input = listOf("Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green")
            Then("result should be 48") {
                day02BPuzzle(input) shouldBe 48
            }
        }
        When("input is Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue") {
            val input = listOf("Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue")
            Then("result should be 12") {
                day02BPuzzle(input) shouldBe 12
            }
        }
        When("Input has multiple valid items") {
            val input = listOf(
                "Game 1: 3 blue, 4 red; 1 red, 2 green, 6 blue; 2 green",
                "Game 2: 1 blue, 2 green; 3 green, 4 blue, 1 red; 1 green, 1 blue",
                "Game 3: 8 green, 6 blue, 20 red; 5 blue, 4 red, 13 green; 5 green, 1 red",
                "Game 4: 1 green, 3 red, 6 blue; 3 green, 6 red; 3 green, 15 blue, 14 red",
                "Game 5: 6 red, 1 blue, 3 green; 2 blue, 1 red, 2 green",
            )
            Then("result should be 2286") {
                day02BPuzzle(input) shouldBe 2286
            }
        }
    }

})
