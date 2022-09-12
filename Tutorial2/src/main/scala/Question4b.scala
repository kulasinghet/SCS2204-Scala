@main
def main(): Unit = {

    def costFunction (attended: Int): Int = {
        return (500 + attended * 3)
    }

    def attendanceFunction (ticketPrice: Int): Int = {
        return (((-4)*ticketPrice) + 180)
    }

    def profitFunction (ticketPrice: Int): Int = {
        return (attendanceFunction(ticketPrice)*ticketPrice - costFunction(attendanceFunction(ticketPrice)))
    }

    var ticketPrice = 0 //max ticket price is 45
    var bestTicket = 0
    var profit = profitFunction(ticketPrice)

    while (ticketPrice < 45) {
        var temp = profitFunction(ticketPrice)
        if (temp > profit) {
            profit = temp
            bestTicket = ticketPrice
            ticketPrice = ticketPrice + 1
        } else {
            ticketPrice = ticketPrice + 1
        }
    }

    println("Best ticket price is " + bestTicket + " and profit is " + profit)




}
