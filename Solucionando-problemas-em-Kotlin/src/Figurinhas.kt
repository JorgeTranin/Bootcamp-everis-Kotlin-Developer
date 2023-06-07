// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main(args: Array<String>) {
    val lista = mutableListOf<Int>()

    for (i in 1..readLine()!!.toInt()) {
        val input = readLine()!!.split(" ").map { it.toInt() }
        val f1 = input[0]
        val f2 = input[1]

        val maxStackSize = mdc(f1, f2)
        lista.add(maxStackSize)
    }

    for (maxStackSize in lista) {
        println(maxStackSize)
    }
}

// Função que calcula o máximo divisor comum (MDC) de dois números de forma recursiva
fun mdc(n1: Int, n2: Int): Int {
    return if (n2 == 0) {
        n1
    } else {
        mdc(n2, n1 % n2)
    }
}
