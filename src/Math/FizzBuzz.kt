//Given an integer n, return a string array answer (1-indexed) where:
//
//answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
//answer[i] == "Fizz" if i is divisible by 3.
//answer[i] == "Buzz" if i is divisible by 5.
//answer[i] == i if non of the above conditions are true.

// Solution:
fun fizzBuzz(n: Int): List<String> {
    var listNumbers: MutableList<String> = mutableListOf<String>()
    for (i in 1..n) {
        when {
            i % 15 == 0 -> listNumbers.add("FizzBuzz")
            i % 5 == 0 -> listNumbers.add("Buzz")
            i % 3 == 0 -> listNumbers.add("Fizz")
            else -> listNumbers.add(element = i.toString())

        }


    }
    return listNumbers
}

