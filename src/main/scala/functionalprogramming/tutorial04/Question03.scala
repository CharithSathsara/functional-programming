package functionalprogramming.tutorial04

object Question03 extends App {

  val cars = Array( Car("bmw 3 series",20000),
                    Car("bmw 5 series",50000),
                    Car("vw passat",10000),
                    Car("vw golf",12000),
                    Car("mazda 3",15000) );

  //Recursively printing all the items of cars array
  def printCars(cars:Array[Car]):Any=if(!cars.isEmpty){
    println(cars.head);
    printCars(cars.tail);
  }

  def printCarWithUUID(cars:Array[Car]):Any=if(!cars.isEmpty){
    println("Car UUID = " + CarUUID(cars.head).uuid());
    printCarWithUUID(cars.tail);
  }

  println("\nCar Sample:\n");
  printCars(cars);

  println("\n\nCar Sample with UUID:\n");
  printCarWithUUID(cars);
  //println(CarUUID(car).uuid());
}

case class Car(name:String, price:Double){
  override def toString: String = "- a " + this.name + " priced at " + this.price;
}

case class CarUUID(car:Car){
  def uuid():String = car.name + " - " + car.name.hashCode;
}
