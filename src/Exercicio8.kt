//8. Desenvolva um programa que leia um valor e apresente o número de Fibonacci correspondente a este valor lido.
// Lembre-se que os 2 primeiros elementos da série de Fibonacci são 0 e 1 e cada próximo termo é a soma dos 2 anteriores a ele.
// No final imprima a mensagem "Fib(N) = X",
// onde X é o N-ésimo termo da série de Fibonacci.
fun main() {
    var a: Int = 1
    var b: Int = 0
    var c: Int = 0

    for(i: Int in 0..30){
        println(a)
        c = a
        a = a + b
        b = c
    }
}