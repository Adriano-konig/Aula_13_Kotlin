//4. Faça um programa que receba 10 números inteiros informados pela pessoa usuária,
// armazene-os e verifique quais números são pares,
// e exiba para o usuário apenas os números pares da lista.
fun main() {
    var NumPares = 0
    var listaNumPares = ArrayList<Int>(10)
    for(i: Int in 1..10){
        println("Informe numero: ")
        NumPares = readln().toInt()
        when{
            NumPares % 2 == 0 -> listaNumPares += NumPares
        }
        //listaNumPares += NumPares
    }
    for(i: Int in listaNumPares){
       print("$i ,")
    }
    print("Esses numeros são pares")
}