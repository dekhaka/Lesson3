fun main() {

    val moveString = "D2-D4;0"

    val parts = moveString.split(";")
    val moveCoordinats = parts[0]
    val moveNumber = parts[1].toInt()

    val coords = moveCoordinats.split("-")
    val from = coords[0]
    val to = coords[1]

    println("Откуда: $from")
    println("Куда: $to")
    println("Номер хода: $moveNumber")
}