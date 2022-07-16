package leetcode._1603

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)

    print("Number of slots for big cars: ")
    val big = scanner.nextInt()

    print("Number of slots for medium cars: ")
    val medium = scanner.nextInt()

    print("Number of slots for small cars: ")

    val small = scanner.nextInt()

    val parkingSystem = ParkingSystem(big, medium, small)
    var loop = true

    while (loop) {
        print("1. addCar()\n2. Exit\nEnter your choice: ")
        when (scanner.nextInt()) {
            1 -> {
                print("Enter the car type: ")
                val carType = scanner.nextInt()
                if (parkingSystem.addCar(carType)) {
                    println("Car of type $carType has been parked")
                } else {
                    println("Parking lot is full for cars of type $carType")
                }
            }
            2 -> {
                println("Exiting...")
                loop = false
            }
            else -> {
                println("Exiting...")
                loop = false
            }
        }
    }
}