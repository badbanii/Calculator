package com.tuly.calculator.domain

sealed interface ExpressionPart {
    data class Number(val number: Double) : ExpressionPart

    data class Op(val operation: Operation) : ExpressionPart

    data class Parentheses(val type: ParenthesesType) : ExpressionPart

}

sealed interface ParenthesesType {
    object Closing : ParenthesesType

    object Opening : ParenthesesType

}