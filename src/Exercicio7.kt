//7. Escreva um programa que pergunte para a pessoa usuária quantos alunos tem na sala dela. Em seguida, através de um laço while,
// pessa a pessoa usuária para que entre com as notas de todos os alunos da sala, um por vez. Por fim, o programa mostra a nota média da turma
//.
fun main() {

    println("Quantos tem alunos de sala?: ")
    var aluno = readln().toInt()
    var contadorLista : Int = 0
    var listaNotas = arrayOfNulls<Int>(aluno)
    var listaNotasAlunos = arrayOf(aluno)
    var soma: Int = 0
    var media: Int =0
    var notasAluno = 0

    while(contadorLista in listaNotas.indices ){
        print("nota aluno ${contadorLista+1}: ")
        notasAluno = readln().toInt()
        soma = soma + notasAluno
        media = soma / aluno
        contadorLista++
    }
    println("Media turma é $media")

}