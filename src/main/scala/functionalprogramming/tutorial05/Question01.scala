package functionalprogramming.tutorial05

object Question01 extends App {

  //Tail recursion function
  def prime(n:Int,d:Int=2):Boolean = d match {

    case d if(n==d) => true;
    case d if(n%d == 0) => false;
    case d => prime(n,d+1);

  }

  println(prime(5));
  println(prime(8));

}
