fun main(){
    quadrat(4,4)
}

fun quadrat(with: Int, height: Int) : String{
    for (i in height downTo 1){
        var output : String = ""
        var w = with
        while (w > 0){
            output += "#"
            w--
        }
        println(output)

    }
    return "pls work"
}