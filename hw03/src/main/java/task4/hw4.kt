package task4

fun showInfo(data: Any) {
    when (data) {
        // String: print its length
        is String -> println(data.length)
        // Int: print data * 2
        is Int -> println(data * 2)
        // Other: print "Unknown"
        else -> println("Unknown")
    }
}

fun main() {
    showInfo("Kotlin")
    showInfo(10)
    showInfo(true)
}
