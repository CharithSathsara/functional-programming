package functionalprogramming.tutorial05

object Question03 extends App {

  //Recursive function for find addition of numbers from 1 to n
  def sum(n:Int):Int = {

    n match {
      case 1 => 1;
      case _ => n + sum(n-1);
    }

  }

  println(sum(5));

}
