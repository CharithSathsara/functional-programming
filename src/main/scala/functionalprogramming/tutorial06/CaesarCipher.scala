package functionalprogramming.tutorial06

import scala.io.StdIn.readLine

object CaesarCipher extends App {

  val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

  //Implementation of Encryption function
  val encryption = (character:Char,key:Int,alphabet:String) =>
    alphabet((alphabet.indexOf(character.toUpper)+key)%alphabet.size);

  //Implementation of Decryption function
  val decryption =(character:Char,key:Int,alphabet:String) =>
    alphabet((alphabet.indexOf(character.toUpper)-key)%alphabet.size);

  //implementation of Cipher function which takes Encryption and Decryption functions to process the data
  val cipher = ( algorithm:(Char, Int, String) => Char, source:String, key:Int, alphabet:String ) =>
    source.map(algorithm(_,key,alphabet));

  println("Enter a string source : ");
  val source = readLine();

  val cipherText = cipher(encryption, source, 1, alphabet);

  val plainText = cipher(decryption, cipherText, 1, alphabet);

  println(plainText);
  println(cipherText);

}
