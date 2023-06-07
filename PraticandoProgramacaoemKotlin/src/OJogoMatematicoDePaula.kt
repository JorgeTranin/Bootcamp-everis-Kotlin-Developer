// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main(args: Array<String>) {

    val N = readLine()!!.toInt()
    for (i in 1..N) {
        val str = readLine()!!
        val N1: Int = str.substring(0, 1).toInt()
        val N2: Int = str.substring(2).toInt()
        val x: String = str.substring(1, 2)

//TODO: Complete os espaços em branco com uma possível solução para o desafio

        if (N1.equals(N2)) {
            println(N1 * N2)
        } else {
            if (x.toUpperCase() == x) {
                println(N2 - N1)
            } else {
                println(N1 + N2)
            }
        }
    }
}