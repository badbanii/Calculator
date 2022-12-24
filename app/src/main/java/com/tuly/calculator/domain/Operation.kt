package com.tuly.calculator.domain


enum class Operation(val symbol: Char) {
    ADD('+'),

    DIVIDE('/'),

    MULTIPLY('x'),

    PERCENT('%'),

    SUBTRACT('-'),

}

val operationSymbols = Operation.values().map { it.symbol }.joinToString("")

fun operationFromSymbol(symbol: Char): Operation {
    return Operation.values().find { it.symbol == symbol }
        ?: throw IllegalArgumentException("Invalid symbol")
}