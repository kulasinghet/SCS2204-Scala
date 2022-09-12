import scala.language.postfixOps
@main
def main(): Unit = {
    
    var k: Int = 2;
    var i: Int = 2;
    var j: Int = 2;
    var m: Int = 5;
    var n: Int = 5;
    var f: Float = 12.0;
    var g: Float = 4.0f;
    var c: Char = 'C';

    // ! ~ * / % + - << >> >>> & | ^

    println("k+12*m = "+(k+12*m)); // k+12*m = 2 + (12 * 5) = 62
    println("m/j = "+(m/j)); // m/j = 2
    println("n%j = "+(n%j)); // n%j = 1
    println("m/j*j = "+(m/j*j)); // m/j*j = (5 / 2) * 2 = 4
    println("f+10*5+g = "+(f+10*5+g)); // f+10*5+g = 12.0 + (10 * 5) + 4.0 = 66.0
    // println(i++*n); Postfix increment operator is not allowed in Scala

}