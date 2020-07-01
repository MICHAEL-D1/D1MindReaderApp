fun main(args: Array<String>){
    println("WELCOME TO MY MIND READER APP\n")
    println("Think about a number between 1 to 1000.")
    println("Answer to 10 questions honestly!!\n")

    var min = 1
    var max = 1000
    var guess = 500
    var askQuestions = 0
    var guessed = true

    do {
        askQuestions++
        printProgress(askQuestions, 10)
        println("Is your number equal to $guess?")
        println("1) No, it is greater")
        println("2) Yes, exactly!")
        println("3) No, it is lower")

        val input = readLine()!!.toInt()
        if (input == 1){
            min = guess
            guess = (min + max)/2
        }else if (input == 3){
            max = guess
            guess = (min + max)/2
        }
        if (askQuestions == 10){
            guessed = false
            break
        }
    } while (input!=2)
    if (guessed)
        println("YESsssss.\n The number of your thought is correct   ")

}
fun printProgress(progress: Int, max: Int){
    for(i in 1..max){
        if (i < progress)
            print("ODI SHARP")
        else if(i == progress)
            print("JISIKE")
        else
            print("ODI MMA")
    }
    println()
}