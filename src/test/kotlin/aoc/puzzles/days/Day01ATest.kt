package aoc.puzzles.days

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
 * NOTES:
 * Need a file reader
 * in this one I need to read each line from the file
 * after, find first and last number in string
 * if theres only 1 number, repeat it
 * if theres no number skip it?
 */

class Day01ATest {

    @BeforeEach
    fun setUp() {
    }

    @AfterEach
    fun tearDown() {
    }

    @Test
    fun `GIVEN  WHEN THEN`() {

    }

}