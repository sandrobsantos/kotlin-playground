package com.example.basic

// while and do/while are the same as in Java

fun fizzBuzz(i: Int): String = when {
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun genFizzBuzz(n: Int): ArrayList<String> {
    val result = arrayListOf<String>()

    for (i in 1..n) {
        result.add(fizzBuzz(i))
    }

    return result;
}

fun genReverseFizzBuzzStepping2(n: Int): ArrayList<String> {
    val result = arrayListOf<String>()

    for (i in n downTo 1 step 2) {
        result.add(fizzBuzz(i))
    }

    return result;
}