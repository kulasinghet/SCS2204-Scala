@main
def main(): Unit = {

  //Question 4 a
  def takeHomeSalary(normalHours: Double, OTHours: Double): Double = {

    var salary: Double = 250 * normalHours + 85 * OTHours;
    return salary * (1 - 0.12); // Tax

  }

  println("Take home salary = "+takeHomeSalary(40, 30));


  //Question 4 b

}