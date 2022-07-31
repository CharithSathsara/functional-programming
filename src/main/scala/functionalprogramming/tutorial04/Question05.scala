package functionalprogramming.tutorial04

object Question05 extends App {

  //Anonymous function that is used to covert the input to uppercase
  val toUpper = (input:String)=> input.toUpperCase();

  //Anonymous function that is used to covert the input to lowercase
  val toLower = (input:String)=> input.toLowerCase();

  //High Order Function that is used to convert the name into given format
  val formatNames = (format:(String)=>String,name:String) => format(name);

  printf("\nOutput :\n");
  printf(formatNames(toUpper,"Benny") + "\n");
  printf(formatNames(toUpper,"Niroshan") + "\n");
  printf(formatNames(toLower,"Saman") + "\n");
  printf(formatNames(toUpper,"Kumara") + "\n");

}
