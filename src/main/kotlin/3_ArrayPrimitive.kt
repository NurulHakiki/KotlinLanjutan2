fun main(args: Array<String>) {
    val x: IntArray = intArrayOf(1, 2, 3)
    x[0] = x[1] + x[2]
    x.forEach { print(it.toString() + ' ') }
    print('\n')
    // Array dengan tipe data Integer yang memiliki ukuran 5 dengan nilai yang diberikan [ 0,0,0,0,0]
    val byteArray = ByteArray(5)
    byteArray.forEach { print(it.toString() + ' ') }
    print('\n')
/*
Menginisialisasi nilai-nilai dalam array dengan konstanta dengan ukuran 5.
array int dengan nilai [42,42,42,42,42]
 */
    val shortArray = ShortArray(5) { 42 }
    shortArray.forEach { print(it.toString() + ' ') }
    print('\n')
/*
memisalkan nilai-nilai array dengan menggunakan lambda. array dengan tipe int
memiliki ukuran 5 dengan nilai [0,1,2,3,4] (Nilai diinisialisasi ke nilai indeksnya)
 */
    var intArray = IntArray(5) { it * 1 }
    intArray.forEach { print(it.toString() + ' ') }
    print('\n')
}