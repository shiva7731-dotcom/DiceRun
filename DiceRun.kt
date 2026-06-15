fun main() {
    println("Welcome to the Dice Run!")
    println("Enter your Name ")
    val name = readLine()
    println("Hello! $name, Welcome to Dice Run...")
    while(true){
        println("Rolling the Dice!...")
        Thread.sleep(1000)
        val diceResult = (1..6).random()
        println("$name rolled $diceResult!!!")
        println("$name, wanna roll again, ")
        println("Type y for yes")
        println("Type n for stop")
        val again = readLine()
        if (again == "n") {
            println("Thank You!! $name, come again... ")
            break
        }
    }
}
