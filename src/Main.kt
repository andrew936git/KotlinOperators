
const val PI = 3.14
fun main() {
    var a = 5
    println("P = ${a * 4}")
    var side1 = 12
    var side2 = 4
    var d = 10
    println("S = ${side1 * side2} | P = ${2 * (side1 + side2)} | L = ${PI * d}")
    var l = 579
    var buf = l % 100
    println("Полных метров в L = ${(l - buf) / 100}")
    var num1 = 100
    var num2 = 12
    var num3 = num1 % num2
    println("Колличество отрезков В на отрезке А = ${(num1 - num3) / num2}")
}