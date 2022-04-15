// Faça um programa que permita que a pessoa usuária digite o nome de uma banda musical e insira o nome de 3 músicas dessa banda,
// as músicas deverão ser armazenadas e no final o programa deverá mostrar a seguinte mensagem:
//NomeDaBanda
//        Musica1
//        Musica2
//Musica3
fun main() {

    println("Nome de uma banda: ")
    var banda = readln()

    var vetorMusica = arrayOfNulls<String>(3)
    println("Digite 3 musicas dessa banda")
    for(i: Int in vetorMusica.indices){
        println("Musica ${i+1}: ")
        vetorMusica[i] = readln()
    }
    for(listaMusica: Int in 0..1){
        println("            ${vetorMusica[listaMusica]}")
    }
    println(vetorMusica[2])
}