// 12. Escreva um algoritmo que leia o ano de nascimento de uma pessoa e apresente uma linha do tempo,
// mostrando cada ano de vida da pessoa e quantos anos ela tinha em cada ano até o ano atual.
fun main(){
    var contadorAno = 0
    var listaIdade: Int= 0
    println("Digite ano seu nascimento: ")
    var ano = readln().toInt()
    var soma: Int = 0
    var idade = 2022 - ano

    var vetorAno = arrayListOf<Int>(idade)

    while(contadorAno <= idade){
        println(contadorAno)
        contadorAno++
    }

}