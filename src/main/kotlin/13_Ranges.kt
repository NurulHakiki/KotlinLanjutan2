/*
Sebuah Range di Kotlin adalah tipe unik yang mendefinisikan nilai awal dan nilai akhir.
 Dengan kata lain, ini adalah interval antara awal dan nilai akhir. Range di Kotlin
 ditutup, yang berarti bahwa nilai awal dan nilai akhir termasuk dalam range
 */
fun main(args: Array<String>) {
    //Ranges
    val i:Int = 2
    for (j in 1..4)
        print(j) // Mencetak "1,2,3,4"
    println()
    if (i in 1..10) {
        println("we found your number --"+i)
    }
}