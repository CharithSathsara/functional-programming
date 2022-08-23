package functionalprogramming.tutorial05

object Question05 extends App {

  def isEven(num:Int):Boolean= num match{
    case 0 => true;
    case _ => isOdd(num-1);
  }

  def isOdd(num:Int):Boolean = !(isEven(num));

  //Recursive function for find addition of even numbers less than n
  def addition(n:Int):Int = n match {

    case 0 => 0;
    case num if(isEven(num)) => num + addition(num-1);
    case num => addition(num-1);

  }

  print(addition(5));

}
