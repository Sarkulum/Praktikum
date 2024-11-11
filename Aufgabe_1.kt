fun main() {
    println(sumOfDigits(123))
}

fun sumOfDigits(n: Int): Int {
    // if n is 0 stop so it's not an Infinite loop
    if (n == 0) {
        return 0
    }
    // get last digit and add it to the sum of remaining digits
    return (n % 10) + sumOfDigits(n / 10)
}
