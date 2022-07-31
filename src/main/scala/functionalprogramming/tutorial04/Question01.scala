package functionalprogramming.tutorial04

import scala.io.StdIn.readInt

object Question01 extends App{

  //calculate the actual amount of interest that the money earns in a year.
  def interest(depositAmount:Double):Double = depositAmount match{

    case amount if amount <= 20000 => amount*0.02;
    case amount if amount <= 200000 => amount*0.04;
    case amount if amount <= 2000000 => amount*0.035;
    case amount if amount > 2000000 => amount*0.065;

  }

  print("Please Enter You Deposit Amount : ");
  var deposit = readInt();

  printf("Interest for deposit amount Rs. %d is = Rs. %.2f",deposit,interest(deposit));

}
