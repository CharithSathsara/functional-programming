package functionalprogramming.tutorial05

object Question04 extends App {

  //example for mutual recursion

  def isEven(num:Int):Boolean= num match{
    case 0 => true;
    case _ => isOdd(num-1);
  }

  def isOdd(num:Int):Boolean = !(isEven(num));

  println(isEven(5));
  println(isEven(6));
  println(isOdd(5));
  println(isOdd(6));

}
