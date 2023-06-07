fun main(args: Array<String>) {
    //continue a solução
    val n = readln().toInt()

    for (i in 1..n) {
        val x = readLine()!!.toInt() // lê o número a ser verificado

        if (isPrime(x)) {
            println("Prime")
        } else {
            println("Not Prime")
        }
    }
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }

    for (i in 2..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }

    return true
}