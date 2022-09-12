package functionalprogramming.tutorial07

object Question01 extends App {

  val x = new Rational(8,3);
  printf(" X =  %s\n",x.toString);

  val negX = x.neg;
  printf("-X = %s\n",negX.toString);

}

class Rational(n:Int, d:Int){

  def numerator = n/gcd(n, d);
  def denominator = d/gcd(n, d);

  //Greatest Common Divisor Function
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b);

  //neg method that is used like x.neg => evaluates to -x
  def neg = new Rational(-this.numerator,this.denominator);

  //overriding the toString method
  override def toString: String = numerator + "/" + denominator;

}
