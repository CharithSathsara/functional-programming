package functionalprogramming.tutorial03

import scala.math.Pi

object Question01 extends App {

  //Calculate area of a disk using given radius
  def areaOfDisk(radius:Double):Double=radius*radius*Pi;

  printf("Area of disk with radius 5 is = %.2f", areaOfDisk(5));

}
