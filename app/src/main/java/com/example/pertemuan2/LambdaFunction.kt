package com.example.pertemuan2

// Lambda Fungtions
// Lambda Functions
// Lambda functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda functions menggunakan tanda panah => untuk memisahkan parameter dan body fungsi

fun uppercaseString(string: String): String {
    return string.uppercase()

}
// Dapat ditulis dalam ekspresi lambda sbb :
fun main() {
    uppercaseString("Hello")
    println({ string: String -> string.uppercase()} ("Hello"))
}