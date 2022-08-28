fun main() {
    val integerVar = 5              //Use val for variables that will not be modified
    val boolVar = true
    var stringVar = "Hello World!"   //Use var for variables that will be modified

    println(integerVar)
    println(boolVar)
    println(stringVar)
    stringVar = "Here's Kotlin!"
    println(stringVar)
}