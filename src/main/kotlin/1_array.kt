fun main(args: Array<String>) {
    //Array merupakan koleksu data yang sejenis. array dapat dibuat menggunakan fungsi arrayOf()
    /*selain itu ada juga alternative lain untuk membuat array dengan ukuran tertentu bisa
    dilakukan dengan fungsi arrayOf() unutk membuat
     */
    var arrA = arrayOf<Int>()
    arrA += 34
    println(arrA[0])
    var arrB = arrayOf<Int>()
    for (i in 1..10) {
        arrB += i
    }
    for (i in arrB) {
        print("$i ")
    }
}