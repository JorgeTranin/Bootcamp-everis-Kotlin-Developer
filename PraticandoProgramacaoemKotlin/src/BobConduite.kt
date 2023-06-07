// Abaixo segue um exemplo de código que você pode ou não utilizar
fun main(args: Array<String>) {
    val nTestes = readLine()!!.toInt()
    var i = 0

//TODO: Complete os espaços em branco com uma possível solução para o desafio

    while (i < nTestes) {
        var cont = 0
        while (cont == 0) {
            val raios = readLine()
            val raiosArray: List<String> = raios!!.split(" ")
            val r1 = raiosArray[0].toInt()
            val r2 = raiosArray[1].toInt()
            println((r1 + r2).toString())
            cont++
        }
        i++
    }
}