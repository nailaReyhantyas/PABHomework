package task3

fun main() {
    var studentName: String? =  "Ayu"

    // Write your code here
    println("Lenght: ${studentName?.length}")
    println("Name: ${studentName?: "Unknown"}")

    studentName?.let {
        println("Hello, $it!")
    }
}
