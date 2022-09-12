package functionalprogramming.tutorial07

object Question02 extends App {

  val x = new Rational(1, 2);
  val y = new Rational(1, 4);
  val z = new Rational(1, 8);

  val result = x-y-z;

  printf("X = %s\n",x.toString);
  printf("Y = %s\n",y.toString);
  printf("Z = %s\n",z.toString);

  printf("\nResult of X-Y-Z = %s", result.toString);

}




