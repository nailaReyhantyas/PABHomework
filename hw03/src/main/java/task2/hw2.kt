package task2

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
    /* class SmartLightDevice(name: String) : SmartDevice(name) {
    var brightness = 50
    override fun turnOn() {
        super.turnOn()
        println("Brigntness: " + "$brightness%.")
    }
}
*/

class SmartTvDevice(name: String) : SmartDevice(name) {
    var speakerVolume = 5
    var channelNumber = 1

    override fun turnOn() {
        super.turnOn()
        println("Tv: display on")
    }

    fun increaseVolume() {
        if (speakerVolume < 100)
            speakerVolume++
        println("Volume: $speakerVolume")
    }

    fun nextChannel() {
        channelNumber++
        println("Channel: $channelNumber")
    }
}

fun main() {
    // TODO
    val smartTV = SmartTvDevice("Living Room TV")
    smartTV.turnOn()
    smartTV.increaseVolume()
    smartTV.nextChannel()
    smartTV.turnOff()
}