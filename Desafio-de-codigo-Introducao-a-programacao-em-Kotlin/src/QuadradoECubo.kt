/*
Desafio
Você terá o desafio de escrever um programa que leia um valor inteiro
N (1 < N < 1000). Este N é a quantidade de linhas de saída que serão apresentadas na execução do programa.

Entrada
O arquivo de entrada contém um número inteiro positivo N.

Saída
Imprima a saída conforme o exemplo fornecido.
 */

fun main() {
    //insira as variaveis corretamente
    val n = readLine()!!.toInt()

    for (i in 1..n) {
        println("$i ${i * i} ${i * i * i}")
    }
}