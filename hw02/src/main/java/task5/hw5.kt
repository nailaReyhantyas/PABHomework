package task5

fun main() {
    print("Assignment score: ")
    val assignment = readln().toInt()

    // Read the exam score.
    print("Exam score: ")
    val examScore = readln().toInt()

    // Compute the average as a Double.
    val average = (assignment + examScore) / 2.0

    // Store the status with an if expression.
    val status = if (average >= 60) {
        "Pass"
    } else {
        "Needs improvement"
    }
    // Print the average and the status.
    println("Average: $average")
    println("Status: $status")
}
