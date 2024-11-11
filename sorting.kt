fun main(){
    val list = listOf(1, 6, 3, 4, 5, 7, 9, 0, 2, 8) // List in nem val weil ich die nicht bei bubbleSort(hier rein setzen kann weil keine Anhnung)
    println(bubbleSort(list))
}

fun bubbleSort(list: List<Int>): List<Int>{

    var mutableList = list.toMutableList() // Keine Ahnung war man Mutable Lists bearbeiten kann obwohl sie mUted sind aber okay

    for (i in 0 until mutableList.size - 1) { // Verstehe nicht genau warum das nicht mit .. und nur mutableList funktioniert aber well
        for (j in 0 until mutableList.size - i - 1) { //nimmt nen value aus der Liste und denn man vergleichen will
            if (mutableList[j] > mutableList[j + 1]) { // vergleicht denn value von oben mit dem nächsten (mutableList[j + 1] nimmt nicht denn j value und addiert 1 sonder nimmt j + 1 und sucht dann nach dem valueder einen über dem J ist weil J nur die position in der Liste representiert)
                val temp = mutableList[j] // macht nen temp value auf weil der Value der nach hinten geschoben werden soll erst irgenwo gespeichert werden muss.
                mutableList[j] = mutableList[j + 1] // setzt j auf denn Value der nächsten Zahl
                mutableList[j + 1] = temp // nimmt J aus dem Temp und speichert ihn im freigwordenen Value
            }
        }
    }
    return mutableList.toList()

}