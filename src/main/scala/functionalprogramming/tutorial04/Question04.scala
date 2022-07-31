package functionalprogramming.tutorial04

import scala.io.StdIn.readInt

object Question04 extends App{

  println("Enter a Integer: ");
  val input = readInt();

  input match{
    case x if(x <= 0) => println("Negative/Zero");
    case x if(x%2 == 0) => println("Even Number");
    case x if(x%2 != 0) => println("Odd Number");
  }

}
