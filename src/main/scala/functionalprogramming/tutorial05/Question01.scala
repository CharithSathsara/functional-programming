package functionalprogramming.tutorial05

object Question01 extends App {

  //Greatest common divisor recursion function
  def GCD(a:Int,b:Int):Int = b match{
    case 0 => a
    case x if x>a => GCD(x,a)
    case _ => GCD(b,a%b)
  }

  //Tail recursion function
  def prime(n:Int,d:Int=2):Boolean = d match {

    case d if(n==d) => true;
    case d if GCD(n,d) > 1 => false;
    case d => prime(n,d+1);

  }

  println(prime(5));
  println(prime(8));

}
