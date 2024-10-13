package com.example.pertemuan2

fun withoutParameter() {
    println("== withoutParameter ==")
    println("Hello, World!")

}
fun withParamter(name: String ) {
    println()
    println("== withoutParameter")
    println("hello, $name!")
}
//named argument
//named argument merupakan cara untuk memanggil fungsi dengan menyebutkan nama parameter
fun withnamedArgument(name: String, age:Int) {
    println()
    println("== withNamedArgument ==")
    println("Hello, $name You $age years old.")
}