package functionalprogramming.tutorial03

import scala.math.Pi

object Question03 extends App {

  //Calculate the volume of a Sphere
  def volumeOfSphere(radius:Double):Double = (4/3) * Pi * (radius*radius*radius);

  var radius = 5.0;
  printf("Volume of the sphere with radius %.2f is = %.2f", radius, volumeOfSphere(radius));

}
