fun main() {
    val a = 20.157898                              // Double type. Takes 64-bits of memory. Accurate result.
    val b = 8.0

    val x = 20.157898F                                // Appending F is for Float type. Takes only 32-bits of memory.
    val y = 8F

    println("$a divided $b is: ${a / b}")
    println("$x divided $y is: ${x / y}")
}