package org.example

private const val A = 'A'

private const val WHITE_SPACE = " "

private const val JUMP_LINE = "\n"

class Diamond() {
    var result :String = ""
    var betweenLettersWhitespaces = 1

    constructor(letter: Char) : this() {
        UpDiamond(letter)
        middleDiamond(letter)
        downDiamond(letter)

    }


    private fun UpDiamond(letter: Char) {
        for (ch in A..letter - 1) {
            val numberOfWhiteSpaces = calculateTheNumberOfWhiteSpaces(letter, ch)
            result += WHITE_SPACE.repeat(numberOfWhiteSpaces) + ch
            if (ch > A) {
                result += WHITE_SPACE.repeat(betweenLettersWhitespaces) + ch
                betweenLettersWhitespaces += 2
            }
            result += JUMP_LINE
        }
    }
    private fun middleDiamond(letter: Char) {
        if (letter == A) {
            result += letter
        } else {
            result += letter + WHITE_SPACE.repeat(betweenLettersWhitespaces) + letter
        }
    }

    private fun downDiamond(letter: Char) {
        for (ch in letter - 1 downTo A) {
            betweenLettersWhitespaces -= 2
            val numberOfWhiteSpace = calculateTheNumberOfWhiteSpaces(letter, ch)
            result += JUMP_LINE + WHITE_SPACE.repeat(numberOfWhiteSpace) + ch
            if (ch > A) {
                result += WHITE_SPACE.repeat(betweenLettersWhitespaces) + ch
            }
        }
    }

    private fun calculateTheNumberOfWhiteSpaces(letter: Char, ch: Char): Int = letter.code - ch.code
}