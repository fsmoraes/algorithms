package Recursion

fun main() {
    println(reverse("carro"))
}

fun reverse(word: String): String {
    if (word.isEmpty())
        return ""

    var newWord = word.substring(word.length - 1)

    return newWord.plus(reverse(word.substring(0, word.length - 1)))
}