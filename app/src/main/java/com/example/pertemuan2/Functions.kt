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
// default parameter value
// default parameter value merupakan cara untuk memberikan nilai default pada parameter fungsi
fun withDefaultParameter(name: String = "Indra", age: Int) {
    println()
    println("== withDefaultParameter ==")
    println("Hello, $name! You are $age years old.")
}
