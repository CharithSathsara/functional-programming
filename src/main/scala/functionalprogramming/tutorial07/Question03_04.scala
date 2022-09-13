package functionalprogramming.tutorial07

object BankApp extends App{

  val bank:List[Account] = List(

    new Account("992711280V",20001673,10000.00),
    new Account("995866415V",20001675,20000.00),
    new Account("994877256V",20001685,40000.00),
    new Account("995811258V",20001453,-10000.00),
    new Account("992745782V",20001473,70000.00),
    new Account("998755692V",20001953,-1000.00),
    new Account("997855124V",20001753,5000.00),

  );

  val acc01 = bank(0);
  val acc02 = bank(1);

  //before transfer
  printf("Before Transfer\n");
  printf("Account 01 = %s\n",acc01.toString);
  printf("Account 02 = %s\n",acc02.toString);

  //transfer Example
  acc01.transfer(acc02,5000.00);

  //after Transfer
  printf("\nAfter Transfer\n");
  printf("Account 01 = %s\n",acc01.toString);
  printf("Account 02 = %s\n",acc02.toString);

  //accounts with negative balances
  val overdraft = (bank:List[Account]) => bank.filter(acc => acc.balance < 0);
  println("\nAccounts List with negative balances");
  overdraft(bank).foreach(acc => println(acc.toString));

  //Total of all account balances
  val sum = (bank:List[Account])=> bank.map(acc => acc.balance).reduce((x,y) => x + y);
  print("\nTotal of all account balances Rs: ");
  print(sum(bank));

  //If balance is positive deposit interest is 0.05
  //If balance is negative overdraft interest is 0.1
  val isNeg = (acc: Account) => acc.balance < 0;
  val interest = (bank:List[Account]) => bank.map((acc) => (acc.nic,acc.accountNumber,
                                                            if(isNeg(acc)) acc.deposit(acc.balance*0.1)
                                                            else acc.deposit(acc.balance*0.05)));

  //apply the interest
  interest(bank);

  println("\n\nAll Accounts after applying interests");
  bank.foreach(acc => println(acc.toString));

}

class Account(id:String,accNumber: Int, bal: Double) {

  val nic:String = id;
  val accountNumber: Int = accNumber;
  var balance: Double = bal;

  //withdraw method
  def withdraw(amount:Double) = this.balance = this.balance - amount;

  //deposit method
  def deposit(amount:Double) = this.balance = this.balance + amount;

  //transfer method
  def transfer(acc:Account,amount:Double) = {
    this.withdraw(amount);
    acc.deposit(amount);
  }

  override def toString = "{ " + nic + " : " + accountNumber + " : " + balance + " }";

}

