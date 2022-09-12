object Main {
  def main(args: Array[String]): Unit = {

    // Question 1
    def interest(deposit: Int): Double = {

      deposit match {
        case x if x < 0 => throw new IllegalArgumentException("Deposit must be positive")
        case x if x < 20000 => return deposit * 0.02;
        case x if x < 200000 => return deposit * 0.04;
        case x if x < 2000000 => return deposit * 0.035;
        case x if x >= 2000000 => return deposit * 0.065;
      }
    }
    println("Question 1")
    println(interest(100000))
    println()


    // Question 2
    def oddEvenorZero(number: Int) = {
      number match {
        case x if x < 0 => println("Negative");
        case x if x == 0 => println("Zero");
        case x if x % 2 == 0 => println("Even");
        case x if x % 2 != 0 => println("Odd");
      }
    }
    println("Question 2")
    oddEvenorZero(74)
    println()

    // Question 3
    def toUpper(string: String): String = {
      return string.toUpperCase
    }

    def toLower(string: String): String = {
      return string.toLowerCase
    }

    def formatName(name: String, func: String => String): String = {
      return func(name)
    }

//    def func1(name: String): String = {
//      return toUpper(name.substring(0,2) ) + name.substring(2).toLowerCase;
//    }

//    def func2(name: String): String = {
//      return (toUpper(name.substring(0,1))  + name.substring(1, name.length-1).toLowerCase + name.substring(name.length-1).toUpperCase)
//    }

    println("Question 3")

    println(formatName("BENNY", toUpper))

    println(formatName("Niroshan",
      (name: String) => {
        toUpper(name.substring(0,2)) +  toLower(name.substring(2))
      }))

    println(formatName("Saman", toLower))

    println(formatName("Kumara",
      (name: String) => {
         toUpper(name.substring(0,1))  + toLower(name.substring(1, name.length-1))  +toUpper(name.substring(name.length-1))
      }
    ))
  }
}