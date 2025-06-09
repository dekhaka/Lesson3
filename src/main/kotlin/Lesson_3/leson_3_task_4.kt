fun main() {

    var from = "E2"
    var to = "E4"
    var moveNumber = 1

    val moveOne = "[$from-$to;$moveNumber]"
    println(moveOne)

    from = "D2"
    to = "D3"
    moveNumber = 2

    val moveTwo = "[$from-$to;$moveNumber]"
    println(moveTwo)
}