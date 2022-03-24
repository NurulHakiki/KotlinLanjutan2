/*
   Penerapan For-Loop dalam Kalkulator Eksponensial yaitu
   kalkulator yang mencari nilai perpangkatan.
    */
fun main(args: Array<String>) {
    println("Exponent calculator")
    println("===================")
    println("Enter the base: ")
    val a = readLine()!!.toInt() // penginputan nilai yaitu nilai integer
    println("Enter the exponent: ")
    val n = readLine()!!.toInt() //penginputan nilai pangkat
    var result = a
    for (i in 1..n-1) {
        result = result * a
    }
    println("Result: $result")
    println("Thank you for using our exponent calculator")
}