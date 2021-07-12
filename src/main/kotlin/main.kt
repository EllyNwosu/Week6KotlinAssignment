fun main() {
    println(mylover(4, 4))
    println(mylover(3, 11))
    println(mylover(22, 17))

}

fun mylover(luv1: Int, luv2: Int): Boolean {
    return luv1 % 2 !== luv2 % 2;
}