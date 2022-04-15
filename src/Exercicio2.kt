//2. Escreva um algoritmo que leia um número inteiro
// (de 1 a 7) representando o dia da semana e informe o nome do dia correspondente.
fun main() {
    println("Digite numero 1 a 7 para apresenta qual é dia de semana: ")
    var semana = readln().toInt()
        when{
            semana == 1 -> println("Domigo")
            semana == 2 -> println("Segunda")
            semana == 3 -> println("Terça")
            semana == 4 -> println("Quarta")
            semana == 5-> println("Quinta")
            semana == 6 -> println("Sexta")
            semana == 7 -> println("Sabado")
           else ->{
               println("Esse numero não existe")
        }
    }
}