object Main {
  def main(args: Array[String]): Unit = {

//     // Question 1
//     println("===========================================================")
//     println("Question 1")
//     println("===========================================================")

//     def absVal(x: Int): Int = {
//       if (x < 0) -x
//       else x
//     }
//     println("absVal(-10): " + absVal(-10))
//     println("absVal(10): " + absVal(10))

//     // Question 2
//     println();
//     println("===========================================================")
//     println("Question 2")
//     println("===========================================================")

//     def largeValFunc1(number1: Int, number2: Int): Int = {
//       if (number1 >= number2) {
//         return number1
//       } else {
//         return number2
//       }
//     }
//     println("large val 10, 20: " + largeValFunc1(10, 20))

// //    def largeValFunc2 (number1: Int, number2: Int):Int = {
// //      if number1 >= number2 ? number1 : number2; No ternary operator in Scala
// //    }

//     // Question 3
//     println();
//     println("===========================================================")
//     println("Question 3")
//     println("===========================================================")

//     def largeBalFunc13Val(number1: Int, number2: Int, number3: Int): Int = {
//       if (number1 >= number2) {
//         if (number1 >= number3) {
//           return number1;
//         }
//       }
//       if (number2 >= number3) {
//         return number2;
//       } else {
//         return number3;
//       }
//     }
//     println("large val 10, 20, 15: " + largeBalFunc13Val(10, 20, 15))

//     // Question 4
//     println();
//     println("===========================================================")
//     println("Question 4")
//     println("===========================================================")

//     def oddOrEven(number: Int): String = {
//       if (number % 2 == 0) {
//         return "even";
//       } else {
//         return "odd";
//       }
//     }
//     println("oddOrEven(10): " + oddOrEven(10))

//     // Question 5
//     println();
//     println("===========================================================")
//     println("Question 5")
//     println("===========================================================")

//     def question5(a: Int, b: Int) = {
//       if (a == 1) {
//         if (b == 1) {
//           System.out.println("***");
//         }
//         System.out.println("###");
//       }
//       System.out.println("===");
//     }

//     println("a=1, b=2");
//     question5(1, 2);
//     println("a=1, b=3");
//     question5(1, 3);
//     println("a=2, b=3");
//     question5(2, 3);
//     println("a=2, b=2");
//     question5(2, 2);

//     // Question 6
//     println();
//     println("===========================================================")
//     println("Question 6")
//     println("===========================================================")

//     def marks(mark1: Int, mark2: Int, mark3: Int): Unit = {
//       var average: Int = (mark1 + mark2 + mark3) / 3;

//       if (average <= 39) {
//         println("Fail");
//       } else if (average <= 54) {
//         println("Pass");
//       } else if (average <= 69) {
//         println("Good");
//       } else if (average > 69) {
//         println("Very Good")
//       }
//     }
//     marks(70, 50, 60);

//     // Question 7
//     println();
//     println("===========================================================")
//     println("Question 7")
//     println("===========================================================")

//     def monthsToSeason(): Unit = {
//       println("Please enter the month number: ");
//       val month = scala.io.StdIn.readInt();

//       if (month == 1 || month == 2 || month == 12) {
//         println("Winter");
//       } else if (month == 3 || month == 4 || month == 5) {
//         println("Spring");
//       } else if (month == 6 || month == 7 || month == 8) {
//         println("Summer");
//       } else if (month == 9 || month == 10 || month == 11) {
//         println("Fall");
//       } else {
//         println("Bogus month");
//       }
//     }
//     monthsToSeason();

//     // Question 8
//     println();
//     println("===========================================================")
//     println("Question 8")
//     println("===========================================================")

//     def tempChange(): Double = {
//       println("Please enter the correct number.");
//       println("1. Celsius to Fahrenheit");
//       println("2. Fahrenheit to Celsius");
//       var flag = scala.io.StdIn.readInt();

//       if (flag == 1) {
//         println("Please enter the Celsius temperature.");
//       } else {
//         println("Please enter the Fahrenheit temperature.");
//       }
//       var temp = scala.io.StdIn.readInt()

//       if (flag == 1) {
//         return (temp * 1.8 + 32);
//       } else {
//         return (temp - 32) / 1.8;
//       }
//     }
//     println(tempChange());

//     // Question 9
//     println();
//     println("===========================================================")
//     println("Question 9")
//     println("===========================================================")
//     def calculator(): Int = {
//       println("Please enter number 1");
//       var num1 = scala.io.StdIn.readInt();

//       println("Press correct symbol");
//       println("+ : Addition");
//       println("- : Subtraction");
//       println("* : Multiplication");
//       println("/ : Division");
//       var symbol = scala.io.StdIn.readChar();

//       println("Please enter number 2");
//       var num2 = scala.io.StdIn.readInt();

//       var answer: Int = 0

//       if (symbol == '+') {
//         answer = num1 + num2;
//       } else if (symbol == '-') {
//         answer = num1 - num2;
//       } else if (symbol == '*') {
//         answer = num1 * num2;
//       } else if (symbol == '/') {
//         answer = num1 / num2;
//       } else {
//         println("Please enter correct symbol");
//       }

//       println(answer)
//       return answer;
//     }

//     calculator();

    // Question 1
    println("Question 1");
    def areaPi(radius: Double): Double = {
      return 3.14 * radius * radius;
    }
    println("Area of circle with radius 5: " + areaPi(5));
    println();

    // Question 2
    println("Question 2");
    def tempToFara(temp: Double): Double = {
      return (temp * 1.8 + 32);
    }
    println("Fahrenheit: " + tempToFara(35));
    println();

    // Question 3
    println("Question 3");
    def volSphere(radius: Double): Double = {
      return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
    println("Volume of sphere with radius 5: " + volSphere(5));
    println();

    // Question 4
    println("Question 4");
    def wholeSaleCost(price: Double, quantity: Int): Double = {

      var deliveryCost: Double = 0;
      if (quantity <= 50) {
        deliveryCost = quantity * 3;
      } else {
        deliveryCost = (quantity - 50) * 0.75 + 50 * 3;
      }
      var totalCost = deliveryCost + price * quantity * 0.6;
      return totalCost;
    }
    println("Whole sale cost of 60 books: " + wholeSaleCost(24.95, 60));
    println();

    // Question 5
    println("Question 5");
    def runTime(easy: Int, tempo: Int, easy1: Int): Int = {
      return easy * 8 + tempo * 7 + easy1 * 8;
    }
    println("Run time: " + runTime(2, 3, 2));
  }
}
