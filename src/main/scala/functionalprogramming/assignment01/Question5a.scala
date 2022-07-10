package functionalprogramming.assignment01

import scala.io.StdIn.readInt

object Question5a extends App {

  def wage(hours:Int):Int=hours*250; //calculate normal salary

  def ot(hours:Int):Int=hours*85; //calculate ot salary

  def income(n_hours:Int,ot_hours:Int):Int=wage(n_hours)+ot(ot_hours); //calculate total income

  def tax(income:Int):Double=income*.12; //calculate tax

  //calculate take home salary
  def takeHome(n_hours:Int,ot_hours:Int):Double=income(n_hours,ot_hours) - tax(income(n_hours,ot_hours));

  println("Enter Normal Working Hours : ");
  var n_hours = readInt();

  println("Enter OT Working Hours : ");
  var ot_hours = readInt();

  printf("Take Home Salary is = Rs %.2f", takeHome(n_hours,ot_hours));

}
