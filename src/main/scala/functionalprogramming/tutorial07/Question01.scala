package functionalprogramming.tutorial07

object Question01 extends App {

  val p = new Rational(8,3);
  printf(" P =  %s\n",p.toString);

  val negP = p.neg;
  printf("-P = %s\n\n",negP.toString);

  val x = new Rational(8, 3);
  val y = new Rational(5, 7);
  val z = new Rational(7, 3);

  val result = x-y-z;

  printf("X = %s\n",x.toString);
  printf("Y = %s\n",y.toString);
  printf("Z = %s\n",z.toString);

  printf("\nResult of X-Y-Z = %s", result.toString);

}

class Rational(n:Int, d:Int){

  def numerator = n/gcd(n, d);
  def denominator = d/gcd(n, d);

  //Greatest Common Divisor Function
  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b);

  //plus method
  def +(r:Rational) = new Rational(this.numerator*r.denominator + this.denominator*r.numerator,
                                                                this.denominator*r.denominator)

  //neg method that is used like x.neg => evaluates to -x
  def neg = new Rational(-this.numerator,this.denominator);

  //minus method => x - y = x + (-y)
  def -(r:Rational) = this + r.neg;

  //overriding the toString method
  override def toString: String = numerator + "/" + denominator;

}
