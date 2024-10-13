package com.example.pertemuan2
data class DataClass(
    val id: Int,
    var email: String
)
fun main() {
    val data= DataClass(1, "Iqbal@gmail.com")
    println(data)

    // Fungsi Equals
    val data2 = DataClass(2, "makan@gmail.com")
    println(data == data2)

    //Fungsi Copy
    val data3 = data.copy()
    println(data3)



}
