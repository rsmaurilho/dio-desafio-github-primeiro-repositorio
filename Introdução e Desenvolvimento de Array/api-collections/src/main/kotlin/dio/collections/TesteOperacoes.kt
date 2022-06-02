package dio.collections

fun main() {
    val salarios = doubleArrayOf(1000.0, 2250.0, 4000.0)
    for (salario in salarios){
        println(salario)
    }
    println("-------------------")
    println("Maior salario: ${salarios.maxOrNull()}")
    println("Menor salario: ${salarios.minOrNull()}")
    println("Menor salario: ${salarios.average()}")

    val salarioMaiorQue2500 = salarios.filter{it > 2500.0}

    println("------------------------------")
    salarioMaiorQue2500.forEach{ println(it) }
    println("------------------------------")
    // contagem de elementos dentro do range
    println(salarios.count{ it in 2000.0..5000.0})
    println("------------------------------")
    //busca do elemento
    println(salarios.find{it == 2250.0})
    println(salarios.find{it == 5000.0})

    println("------------------------------")
    //procura se o elemento existe trazendo o valor verdadeiro ou falso
    println(salarios.any{it == 1000.0})
}