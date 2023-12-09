package org.aoc.aoc.utils

import java.io.File

object FileReader {

    fun listAllFiles(directoryName: String = "."): List<File> =
        File(directoryName).listFiles { file ->
            file.isDirectory
        }.toList()

}