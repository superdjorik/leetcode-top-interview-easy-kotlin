//Given an integer n, return the number of prime numbers that are strictly less than n.
//
//Example 1:
////Input: n = 10
//Output: 4
//Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
//
// Example 2:
////Input: n = 0
//Output: 0
//
// Example 3:
////Input: n = 1
//Output: 0
//
//Constraints:
//
//0 <= n <= 5 * 106
//
//      First version(too long)
// fun countPrimes(n: Int): Int {
//
//    var count = 0
//    for (i in 1..n-1){
//        if (isPrime(i) == true) {
//            count++
//        }
//    }
//    return count
//}
//
//
//fun isPrime(n: Int): Boolean {
//    if (n < 2) return false
//    for (m in 2..n - 1) {
//        if (n % m == 0) return false
//    }
//    return true
//}

//      Second version
fun countPrimes(n: Int): Int {
    val isPrime = BooleanArray(n)
    for (i in 2 until n) {
        isPrime[i] = true
    }
    // Loop's ending condition is i * i < n instead of i < sqrt(n)
    // to avoid repeatedly calling an expensive function sqrt().
    run {
        var i = 2
        while (i * i < n) {
            if (!isPrime[i]) {
                i++
                continue
            }
            var j = i * i
            while (j < n) {
                isPrime[j] = false
                j += i
            }
            i++
        }
    }
    var count = 0
    for (i in 2 until n) {
        if (isPrime[i]) count++
    }
    return count
}

fun main() {
    println(countPrimes(10))
}