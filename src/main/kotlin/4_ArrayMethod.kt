fun main(args: Array<String>) {
//Array Methods
    val simpsonsA = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsA.sort()
    for (simpson in simpsonsA) {
        print(simpson + ' ')
    }
    print('\n')
    /*
    Jika method ini dipanggil tanpa argumen, elemen dari array akan diurutkan
    berdasarkan abjad. Jika elemen di dalam array bukan huruf, maka akan dikonversi
    sementara menjadi string, baru kemudian dilakukan proses pengurutan.
     */

    val simpsonsB: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpsons_sorted = simpsonsB.sortedArray()
    for (simpson in simpsons_sorted) {
        print(simpson + ' ')
    }
    print('\n')
    //Method Array.reverse() digunakan untuk membalikkan urutan dari elemen di dalam array.
    // Method ini akan mengubah array asal
    val simpsonsC: Array<String> = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    simpsonsC.sort()
    simpsonsC.reverse()
    for (simpson in simpsonsC) {
        print(simpson + ' ')
    }
    print('\n')
    val simpsonsD = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    val simpson = "Lisa"
    val position = simpsonsD.indexOf(simpson)
    if (position != -1) {
        println("Yeah, that's my number ${position + 1} Simpson!")
    } else {
        println("Hey that's not Simpson!")
    }
    val simpsonsE = arrayOf("Homer", "Marge", "Bart", "Lisa", "Meggie")
    println("simpsons size: " + simpsonsE.size)
    if(!simpsonsE.isEmpty())
        println("Array tidak kosong!")
    println("Min = "+ simpsonsE.minOrNull()) //elemen dengan nilaii terendah pada list. pada list string adalah berdasarkan urutan alphabet
    println("Max = "+ simpsonsE.maxOrNull()) //Elemen yang mempunyai nilai tertinggi
    println("First = " + simpsonsE.first()) //Elemen pertama pada list
    println("Last = " + simpsonsE.last()) //Elemen terakhir pada list
    println(simpsonsE.contains("Marge"))
}
