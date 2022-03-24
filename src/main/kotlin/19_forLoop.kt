fun main(args: Array<String>) {
    //The for loop
    for (i in 1..10) {
        print("$i ")
    }
    print('\n')
    print('\n')
    //nilai dari array
    val arrInt = arrayOf(1, 2, 3, 4)
    for (i in arrInt) println("values of the array " +i)
    print('\n')
    //nilai dari elemen, menggunakan index yaitu dimulai dari nol
    val listInt = listOf(1, 22, 83, 4)
    for ((index, value) in listInt.withIndex()) {
        println("the element at $index is $value")
    }
}