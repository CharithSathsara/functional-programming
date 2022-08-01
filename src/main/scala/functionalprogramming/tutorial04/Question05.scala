package functionalprogramming.tutorial04

object Question05 extends App {

  //Anonymous function that is used to covert the input to uppercase
  val toUpper = (input:String)=> input.toUpperCase();

  //Anonymous function that is used to covert the input to lowercase
  val toLower = (input:String)=> input.toLowerCase();

  //High Order Function that is used to convert the name into given format
  //val formatNames = (format:(String)=>String,name:String) => format(name);

  //High Order Function that is used to convert the name into given format
  //This is also a recursive function
  def formatNames(name:String,format:(String)=>String,indexSequence:Seq[Int]):String = {

    if(indexSequence.isEmpty){
      return name;
    }

    if(indexSequence.head < name.length()){

      var tempName = "";

      indexSequence.head match{
        case 0 => tempName = format(name.charAt(indexSequence.head).toString) + name.substring(indexSequence.head + 1);
        case _ => tempName = name.substring(0,indexSequence.head) + format(name.charAt(indexSequence.head).toString) + name.substring(indexSequence.head + 1);
      }

      formatNames(tempName,format, indexSequence.tail);

    }else{
       "Please Enter Valid Indexes of the name";
    }

  }

  printf("\nOutput :\n");
  printf(formatNames("Benny",toUpper,Seq(0,1,2,3,4)) + "\n");
  printf(formatNames("Niroshan",toUpper,Seq(0,1)) + "\n");
  printf(formatNames("Saman",toLower,Seq(0)) + "\n");
  printf(formatNames("Kumara",toUpper,Seq(0,5)) + "\n");

}
