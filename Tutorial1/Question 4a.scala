object MainObject {

  def takeHomeSalary(normalHours: Double, OTHours: Double): Double = {

    var salary: Double = 250 * normalHours + 85 * OTHours;
    return salary * (1 - 0.12);

  }

  println(takeHomeSalary(40, 30));

}
