package dio.collections

fun main() {
    val nomes = Array<String>(3){""}
    nomes[0] = "Maria"
    nomes[1] = "João"
    nomes[2] = "José"

    for (nome in nomes){
        println(nome)
    }
    println("-----------------")
        val nomes1 = Array<String>(3){""}
        nomes1[0] = "Maria"
        nomes1[1] = "Zazá"
        nomes1[2] = "José"

        for (nome1 in nomes1){
            println(nome1)


        }
    println("---------------")

    nomes1.sort()
    nomes1.forEach {println(it) }

    println("---------------")

    val nomes2 = arrayListOf("Maria","Zazá","Pedro")
    nomes2.sort()
    nomes2.forEach {println(it) }

}