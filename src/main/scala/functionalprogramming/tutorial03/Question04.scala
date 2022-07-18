package functionalprogramming.tutorial03

object Question04 extends App {

  //Total amount for books
  def booksPrice(books:Int):Double = books*24.95;

  //Calculate the discount
  def discount(amount:Double):Double = amount*0.4;

  //Calculate the shipping cost
  def shippingCost(books:Int):Double = books match {

    case books if books <= 50 => books*3;
    case books if books > 50 => 50*3 + (books - 50)*0.75;

  }

  //Calculate wholesale cost
  def wholesaleCost(books:Int):Double = booksPrice(books) - discount(booksPrice(books)) + shippingCost(books);

  var books = 60;
  printf("Total wholesale cost for %d books = Rs %.2f", books, wholesaleCost(books));

}
