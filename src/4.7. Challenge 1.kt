
// Refactor getOutput() to use a when expression|
//fun getOutput(input: Any?): String = when (input) {
//    null -> "Input was null"
//    is Int -> "Input was an Int"
//    is Number -> "Input was a non-Int Number"
//    is String -> "Input was a String with length ${input.length}"
//    else -> "Input didn't match target inputs"
//}
//
//fun main() {
//    println(getOutput(null))
//    println(getOutput(4))
//    println(getOutput(3.2))
//    println(getOutput("Hello Kotlin"))
//}
//Rewrite above using when
