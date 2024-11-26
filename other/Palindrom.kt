package other

fun main(){
    println(isPalindrom("Hallo")) //false
    println(isPalindrom("madam")) //true
}

fun isPalindrom(i: String) : Boolean {
   return (reversed(i) == i)
}

fun reversed(Input: String) : String {
    /*var original = Input
    var reversed = original.reversed()*/
    return Input.reversed()
}