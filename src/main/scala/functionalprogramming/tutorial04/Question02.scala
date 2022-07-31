package functionalprogramming.tutorial04

object Question02 extends App{

  val cart = Array( Item("Vanilla Ice Cream",3.99,13), Item("Chocolate Biscuits",4,6), Item("Cupcakes",7.77,7));

  //Recursively printing all the items of cart array
  def printItems(cart:Array[Item]):Any=if(!cart.isEmpty){
    println(cart.head);
    printItems(cart.tail);
  }

  def printOnlyVanilla(cart:Array[Item]):Any=if(!cart.isEmpty){

    cart.head match{
      case Item("Vanilla Ice Cream",_,_) => println(cart.head);
      case _ => println("Found another item");
    }

    printOnlyVanilla(cart.tail);
  }

  println("\nPrinting ALl Cart Items :\n");
  printItems(cart);

  println("\n\nPrinting only Vanilla Ice Cream Items:\n");
  printOnlyVanilla(cart);

}

//This Item case class automatically have variables as name, price and qty
case class Item(name:String, price:Double, qty:Int){

  override def toString: String = this.qty + " " + this.name + " at Rs. " + this.price + " each";

}


