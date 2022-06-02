package dio.collections

fun main() {
    val values = IntArray(5)

    values[0] = 1
    values[1] = 7
    values[2] = 6
    values[3] = 3
    values[4] = 2

    for (valor in values){
        println(valor)
    }
    println("--------------------")

    //valor substituido por it

    values.forEach {
        println(it)
    }
    println("--------------------")
    //pode ser usado a variavel porem não faz sentido

    values.forEach {valor->
        println(valor)
    }
    println("--------------------")
    //interando o valor sobre os indices

    for (index in values.indices){
        println(values[index])
    }
    println("--------------------")
    //sort ordenou por padrão do menor para o maior

    values.sort()
    for (valor in values){
        println(valor)
    }
}
