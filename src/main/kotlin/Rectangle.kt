class Phone(var screenPixels: Int, var batteryMah: Int){
    var consumption = screenPixels * (batteryMah * 0.3)
}

fun main() {
    val myPhone = Phone(10000, 300)
    println("This phone's consumption is ${myPhone.consumption}")
}