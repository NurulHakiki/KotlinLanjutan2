fun main(args: Array<String>) {
    // Membuat array string dengan 5 size dengan nilai-nilai ["0", "1", "4", "9", "16"]
    val asc = Array(5) {
            i -> (i * i).toString()
    }
    asc.forEach { println(it) }
}