fun main(args: Array<String>){
    //menggabungkan beberapa array menjadi satu dengan mengenal array dua dimensi 2d
    var cinema = arrayOf<Array<Int>>()
    for (i in 0..4) {
        var array = arrayOf<Int>()
        for (j in 0..4) {
            array += 0
        }
        cinema += array
    }
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
    //Mingisi data dari variabel
    cinema[2][2] = 1
    for (i in 1..3) {
        cinema[3][i] = 1
    }
    for (i in 0..4) {
        cinema[4][i] = 1
    }
    println()
    for (array in cinema) {
        for (value in array) {
            print("$value ")
        }
        println()
    }
}