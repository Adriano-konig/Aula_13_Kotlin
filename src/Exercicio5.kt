// 5. Faça um programa que receba de lista de compras sendo que a pessoa usuária irá inserir a quantidade de itens
// que quer adicionar na lista de compras e após inserir a quantidade o programa deverá permitir que o usuário insira
// os produtos nessa lista. Exiba a lista completa para o usuário.
fun main() {

    println("informe numeros itens oque gostaria fazer compras: ")
    var itens = readln().toInt()

    var ListaCompra = arrayOfNulls<String>(itens)

    for(i: Int in ListaCompra.indices){
        println("Compras ${i+1}: ")
        ListaCompra[i]= readln()

    }
    for(itensCompras: Int in  ListaCompra.indices){
       println("${ListaCompra[itensCompras]}")
    }
    println("Compras chego limite")
    println("Encerrando com sucesso e volte sempre =)")

}