package Recursion

fun main() {
    println(isPalindrome("awesome"))
    println(isPalindrome("tacocat"))
    println(isPalindrome("amanaplanacanalpanama"))
}

fun isPalindrome(word: String): Boolean {

    if (word.length == 1) return true
    if (word.length == 2) return word.first() == word.last()
    if (word.first() == word.last()) return isPalindrome(word.substring(1, word.length - 1))

    return false
}

