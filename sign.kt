fun main(){
    sign(10, 10)
}

fun sign(h :Int, w :Int){
    top(h, w)
    bottom(h, w)
}

fun top(h :Int, w :Int){
    for(i in 1..h/2){
        var output = ""
        var r = i
        while (r > 0){
            output += "*"
            r--
        }
        var g = w/2 -  i
        while (g > 0){
            output += " "
            g--
        }
        var m = w/2 -  i
        while (m > 0){
            output += " "
            m--
        }
        var k = i
        while (k > 0){
            output += "*"
            k--
        }
        println(output)
    }
}

fun bottom(h :Int, w :Int){
    for(i in h/2 downTo 1){
        var output = ""
        var r = i
        while (r > 0){
            output += "*"
            r--
        }
        var g = w/2 -  i
        while (g > 0){
            output += " "
            g--
        }
        var m = w/2 -  i
        while (m > 0){
            output += " "
            m--
        }
        var k = i
        while (k > 0){
            output += "*"
            k--
        }
        println(output)
    }

}

/*
*        *
**      **
***    ***
****  ****
**********
**********
****  ****
***    ***
**      **
*        *
 */