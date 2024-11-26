

fun main(){
    pyramid(5, Orientation.DOWN)
}

fun pyramid(height: Int, orientation: Orientation) {
    if (orientation == Orientation.DOWN) {
        for (i in height downTo 0) {
            var t = i
            var space = 0
            var space2 = height
            var output: String = ""
            while (space2-i > space) {
                print(" ")
                space++
            }
            while (t > 0) {
                output += "**"
                t--
            }
            println(output)
        }
    }else if (orientation == Orientation.UP) {
        for (i in 1 ..  height) {
            var t = i
            var space = 0
            var space2 = height
            var output: String = ""
            while (space2-i > space) {
                print(" ")
                space++
            }
            while (t > 0) {
                output += "**"
                t--
            }
            println(output)
        }
    }
}

enum class Orientation{
    UP, DOWN
}

/*
    ##
   ####
  ######
 ########
##########
 */