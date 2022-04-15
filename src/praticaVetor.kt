fun main() {
    //Exemplo de declaração e adição de valores para o vetor
    var listaNomes = arrayOf("jessica", "João", "Bruno")
//    var listanumero = intArrayOf(1,2,3,4)


    //exemplo de declaração determinando o tamanho
//    var listaFrutas = ArrayList<String>(10)
//    var vetorNumero = IntArray(4)
//    var listaSalario = DoubleArray(12)

   // -------------------------------------------------------
    var nomesUsuario = arrayOfNulls<String>(3)

    print("por favor digite o nome 1 - ")
    nomesUsuario[0] = readln()

    print("por favor digite o nome 2 - ")
    nomesUsuario[1] = readln()

    println("O tamanho do array é de ${nomesUsuario.size}")
    println("O nome 1 é ${nomesUsuario[0]}")
    println("O nome 2 é ${nomesUsuario[1]}")

    //----------------------------------------------------------
    // Exemplo pegando dados do usuário arrayOf()

    print("Digite a quantidade de nomes: ")
    val quantidadeNomes = readln().toInt()

    println("O array vai ter a capacidade de: $quantidadeNomes")

    var nomesUsuario2 = arrayOfNulls<String>(quantidadeNomes)

    print("por favor digite o nome 1 - ")
    nomesUsuario2[0] = readln()

    print("por favor digite o nome 2 - ")
    nomesUsuario2[1] = readln()

    println("O tamanho do array é de ${nomesUsuario2.size}")

    println("O nome 1 é ${nomesUsuario2[0]}")
    println("O nome 2 é ${nomesUsuario2[1]}")

    //Exemplo de for percorrendo um vetor
    for (nomePosicaoArray: String in listaNomes){
        println(nomePosicaoArray)
    }

    for (i: Int in listaNomes.indices){
        println(listaNomes[i])
    }

    // Exemplo de for e forEach
    for (nomePosicaoArray: String in listaNomes){
        println(nomePosicaoArray)
    }

    listaNomes.forEach { nome -> println(nome) }

    listaNomes.forEach { nome ->
        val resultado = 2 + 2
        println("Nome no vetor: $nome e resultado da soma: $resultado")
    }

}
