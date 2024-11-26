package sorting

fun bubbleSorting(list: MutableList<Int>) : List<Int>{
    // need .size because otherwise you get syntax error because it makes it into a number and not a list
    for (i in 0 until list.size -1){
        // in the worst case you need the amount of numbers -1 of runes to sort
        for (j in 0 until list.size -i -1){
            //[j + 1] j does not represent the number instead it represents the location of the nummber in the list
            if (list[j] > list[j + 1]){
                //temp because we are going to override j in case j+1 is smaller
                val temp = list[j]
                list[j] = list[j+1]
                list[j+1] = temp
            }
        }
    }
    return list
}

fun main() {
    //cant directly input a list because idfk but you cant so you need a var (in this case val does not work because it gets edited, I trued)
    var list = mutableListOf(5,2,3,4,1,0)
    print(bubbleSorting(list))
}