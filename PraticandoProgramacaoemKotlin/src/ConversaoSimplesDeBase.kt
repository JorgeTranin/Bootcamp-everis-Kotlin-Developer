fun main(args: Array<String>) {
    var s: String
    val r = """0x.*""".toRegex()

    while (true) {
        s = readLine() ?: break // Lê a entrada do usuário
        if (s == "-1") {
            break // Encerra o programa quando o usuário digitar "-1"
        }
        if (s.toIntOrNull() != null) {
            println("0x" + Integer.toHexString(s.toInt()).toUpperCase())
        } else if (r.matches(s)) {
            println(s.substring(2).toLong(radix = 16))
        }
    }
}
