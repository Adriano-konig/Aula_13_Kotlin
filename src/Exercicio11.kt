//11. Escreva um algoritmo que leia 15 números do usuário. Ao final exiba a média dos 15 números.
// Utilize o comando de repetição Para (For)
fun main() {
    var soma: Double = 0.0
    var media: Double = 0.0
    println("Digite 15 numeros que deseja")
    for(i: Int in 1..15){
        println("Numero ${i}: ")
        var listaNumero = readln().toInt()
        soma = soma + listaNumero
    }
    media = soma / 15
    println("Media total numeros que foi digitados: $media")
}