//9. Escreva um algoritmo que leia dois números e apresente um menu com 4 opções:
//         1. 1) Somar os números;
//         2. 2) Subtrair os números;
//         3. 3) Multiplicar os números;
//         4. 4) Dividir os números. Leia a opção do usuário e execute a operação e apresente o resultado.
//         Caso a opção digitada seja inválida, apresente a mensagem de “Opção inválida” para o usuário
fun main() {
    var boolean = true
    println("Digite um numero: ")
    var num1 = readln().toInt()
    println("Digite outro numero: ")
    var num2 = readln().toInt()
    var soma = 0
    while(true){
        println("Escolhe menu para usar:\n" +
                " 1 => Somar os números;\n" +
                " 2 => Subtrair os números;\n" +
                " 3 => Multiplicar os números;\n" +
                " 4 => Dividir os números.")
        var menu = readln().toInt()
        when(menu){
            1 -> println("Soma: ${num1 + num2}")
            2 -> println("subtrair: ${num1 - num2}")
            3 -> println("Multiplicar: ${num1 * num2}")
            4 -> println("Dividir: ${num1 / num2}")
            else->{
                println("Opção inválida")
            }
        }
    }
}