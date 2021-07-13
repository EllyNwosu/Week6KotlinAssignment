fun main() {
    println(mylove(4, 4))
    println(mylove(3, 11))
    println(mylove(22, 17))
}
fun mylove(love1: Int, love2: Int): Boolean {
    return love1 % 2 !== love2 % 2;
}