package com.example.pertemuan2
fun nullSafety() {
    //neverNull has String type
    var neverNull: String = "This can't be null"

    // Throws a compieler error
    // neverNull = null

    // nullable has nullable String type
    var nullable: String? = "You can keep a null here "
    // This is OK
    nullable = null

    // Check for null in conditions
    if (neverNull == null) {
        println("inferredNonNull is null")
    } else {
        println("inferredNonNull is not null")
    }

}

