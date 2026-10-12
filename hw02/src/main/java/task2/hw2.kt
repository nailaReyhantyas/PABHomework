package task2

fun main() {
    val daysRemaining = 2
    // Use if, else if, and else.
    if (daysRemaining < 0)
        println("Overdue")
    else if(daysRemaining == 0)
        println("Due Today")
    else
        println("Upcoming")
}

