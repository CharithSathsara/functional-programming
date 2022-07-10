package functionalprogramming.assignment01

import scala.io.StdIn.readInt

object Question5b extends App {

  def attendees(ticketPrice:Int):Int = 120+(15-ticketPrice)/5*20;

  def revenue(ticketPrice:Int):Int = ticketPrice*attendees(ticketPrice);

  def cost(ticketPrice:Int):Int = 3*attendees(ticketPrice) + 500;

  def profit(ticketPrice:Int):Int = revenue(ticketPrice) - cost(ticketPrice);

  var bestPrice:Int = 0;

  println("Enter Maximum Ticket Price : ");
  var maxPrice = readInt();

  var profit:Int = 0;

  for(ticketPrice <- 5 to maxPrice;if ticketPrice%5 == 0){

    profit = if(profit < profit(ticketPrice)) {bestPrice = ticketPrice;profit(ticketPrice)} else profit(ticketPrice);
    printf("\nTicket Price = Rs. %d   Profit = %d", ticketPrice,profit);

  }

  printf("\n\nBest Ticket Price = Rs.%d    Profit = Rs. %d",bestPrice,profit(bestPrice));

}
