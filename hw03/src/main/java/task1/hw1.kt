package task1

// Step 1: Parent
open class SmartDevice(val name: String) {
    var status = "off"

    open fun turnOn() {
        // TODO
        status = "on"
        println("$name is ON")
        println("Status: $status")
    }

    // TODO: turnOff()
    open fun turnOff() {
        status = "off"
        println("$name is OFF")
    }
}

// Step 2: Child
// class SmartLightDevice(name: String) : SmartDevice(name) { ... }
class SmartLightDevice(name: String) : SmartDevice(name) {
    var brightness = 50
    override fun turnOn() {
        super.turnOn()
        println("Brigntness:  + $brightness%.")
    }
}

fun main() {
    // TODO
    val desklamp = SmartLightDevice("Desklamp")
    desklamp.turnOn()
    desklamp.turnOff()
}
