@main
def main(): Unit = {
    
    val a:Int = 2
    val b:Int = 3
    val c:Int = 4
    val d:Int = 5;
    val k:Float = 4.3;
    var g: Float = 4.0f;

    // println(--b*a+c*d--); Postfix increment operator is not allowed in Scala
    // println(a++); Postfix increment operator is not allowed in Scala
    println("-2*(g-k)+c = "+ (-2*(g-k)+c)); // -2*(g-k)+c = -2 * (4.0-4.3)+4 = (-2*(-0.3))+4 =-4.60000
    // println (c=c++); Postfix increment operator is not allowed in Scala
    // println (c=++c*a++); Postfix increment operator is not allowed in Scala

}