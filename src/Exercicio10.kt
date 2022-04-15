// 10. Escreva um algoritmo que calcule a soma dos números de 1 a 15. Utilize o comando de repetição Do While
fun main() {
    var contador: Int = 1
    var soma: Int = 0

    while(contador <= 15){
        soma = soma + contador
        contador++
    }
    println("Somando numero 1 a 15: $soma")
}