package sorting

fun sorting(list: List<Int>) : List<Int>{
    val listMute = list.toMutableList()
    for (i in 0 until listMute.size -1){
        for (j in 0 until listMute.size -i -1){
            var temp = i
            if (listMute[j] > listMute[j+1]){
                temp = j
                listMute[j] = listMute[j+1]
                listMute[j+1] = temp
            }
        }
    }
    return listMute
}

fun main() {
    var list = listOf(1,2,3,4,5)
    print(sorting(list))
}