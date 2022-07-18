package functionalprogramming.tutorial03

object Question05 extends App {

  //Calculate running time for easy phase...
  def easy(km:Int):Int = km*8;

  //Calculate running time for tempo phase...
  def tempo(km:Int):Int = km*7;

  var total = easy(2) + tempo(3) + easy(2);
  printf("Total running time = %d minutes",  total);

}
