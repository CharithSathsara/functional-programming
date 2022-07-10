package functionalprogramming.assignment01

object Question123 extends App {

  /* We can define multiple variables on one line, separated by commas, as long as
  all the variables are same type and have the same value */
  var k, j, i = 2;
  var m, n = 5;

  var f = 12.0f;
  var g = 4.0f;
  var c = 'X';

  println(k + 12*m);
  println(m/j);
  println(n%j);
  println(m/j*j);
  println(f + 10*5 +g);

  // We can not use the increment operator in Scala (++i * n). so, we have to use +=
  var x = {i += 1;i*n};
  println(x);

}
