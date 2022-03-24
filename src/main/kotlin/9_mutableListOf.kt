fun main(args: Array<String>) {
    //Mutable list : bisa melakukan perubahan pada list.
    val numbers = mutableListOf(1, 2, 3, 4)
    numbers.add(5)
    numbers.removeAt(1)
    numbers[0] = 0
    numbers.shuffle()
    println(numbers)
    val numbersStr = mutableListOf("one", "two", "three", "four")
    numbersStr.add("five") // this is OK
    //numbersStr = mutableListOf("six", "seven") // compilation error
    println(numbersStr)
}
/*
A mutable interface adalah perluasan dari read-only interface yang berkorespodensi
dengan operasi : menambahkan, menghapus, dan mengubah elemen.
 */
