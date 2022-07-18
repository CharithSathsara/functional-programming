package functionalprogramming.tutorial03

object Question02 extends App {

  //Convert Celsius temperature into Fahrenheit temperature
  def celsiusToFahrenheit(celsius:Double):Double= celsius * 1.8000 + 32.00;

  var celsius = 35.00;
  printf("Fahrenheit temperature of Celsius temperature %.2f is = %.2f F", celsius, celsiusToFahrenheit(celsius));

}
