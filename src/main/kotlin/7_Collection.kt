fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}
fun main(args: Array<String>) {
    val stringList = listOf("one", "two", "one") //List : adalah sebuah koleksi terurut yang dapat menyimpan elemen yang sama lebih darisatu kali.
    printAll(stringList)
    val stringSet = setOf("one", "two", "three") //Set : adalah koleksi yang memiliki elemen yang unik.
    printAll(stringSet)
}