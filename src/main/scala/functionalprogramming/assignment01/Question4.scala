package functionalprogramming.assignment01
/*
Compare the Java and Scala programming languages.

1) Java is a general purpose object oriented language. Scala is functional programming language as well as OOP language.
2) Scala support operator overloading. Java does not support operator overloading
3) Scala variables are by default immutable type. Java variables are by default mutable type.

*/

object Question4 extends App {
  /*
  In java,

  int a = 2, b = 3, c = 4, d = 5;
  float k = 4.3f;
  */

  var a : Int = 2; var b : Int = 3; var c :Int = 4; var d :Int = 5;

  var k : Float = 4.3f; var g : Float = 4.0f;

  //println( --b*a + c*d--);
  println({b -= 1;var x = b*a + c*d;d -= 1;x});

  //println(a++);
  println({var x = a;a+=1;x});

  //println(-2 * (g – k) + c);
  println(-2*(g - k) + c);

  //println(c=c++);
  println({var x = c;c += 1; x});

  //println(c=++c*a++);
  println({c+=1;var x = c*a;a+=1;x});

}
