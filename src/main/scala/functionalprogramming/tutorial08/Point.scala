package functionalprogramming.tutorial08
import scala.math.{pow, sqrt};

object Question01 extends App{

  var point01 = Point(10,20);
  var point02 = Point(30,40);

  printf("Addition of %s and %s = %s\n\n", point01.toString, point02.toString, (point01 + point02).toString);

  printf("Before Moving a Point %s \n", point01.toString);
  point01 = point01.move(15,10);
  printf("After Moving a Point  %s \n\n", point01.toString);

  printf("Distance Between %s and %s = %.2f\n\n", point01.toString, point02.toString, point01.distance(point02));

  printf("Before Inverting a Point %s \n", point01.toString);
  point01 = point01.invert;
  printf("After Inverting a Point  %s \n\n", point01.toString);

}

case class Point(x:Int, y:Int){

  //add two points
  def +(p:Point): Point = Point(this.x + p.x, this.y + p.y);

  //move a point by a given distance dx and dy
  def move(dx:Int, dy:Int): Point = Point(this.x + dx, this.y + dy);

  //distance => sqrt((x1 - x2)^2 + (y1 - y2)^2)
  def distance(p:Point):Double = sqrt(pow((x - p.x),2) + pow((y - p.y),2));

  //switch the x and y coordinates
  def invert: Point = Point(this.y,this.x);

}
