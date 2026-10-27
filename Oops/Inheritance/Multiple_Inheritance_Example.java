package Oops.Inheritance;

public class Multiple_Inheritance_Example {

  public static void main(String[] args) {
  SmartAccount atharv = new SmartAccount("Atharv");

  atharv.deposit(1000);

  atharv.withdraw(200);

  atharv.applyLoan(3000);

  atharv.withdraw(350);
    
  }



}

/**
 * IAccountOperation
 */
interface IAccountOperation {

  double deposit(double amount);

  double withdraw(double amount);

}

/**
 * ILoanOperation
 */
interface ILoanOperation {
  void applyLoan(double amount);

}

/**
 * SmartAccount
 */
class SmartAccount implements IAccountOperation, ILoanOperation {
  String accHolderName;
  double balance;

  SmartAccount(String accholderName){
    this.accHolderName = accholderName;
  }

  @ Override
  public double deposit(double amount) {
    System.out.println("deposited amount:"+ amount + "\nAccount balance: " + (balance+amount));
    return balance += amount;
  }

  @Override 
  public double withdraw(double amount){
System.out.println("Withdrawed amount : " + amount + "\nAccount balance:" +(balance-amount));
return balance -= amount;
  }

  @Override 
  public void applyLoan(double amount){
    System.out.println("Your loan request of "+ amount + " is approved. \nYour new balance is "+ (balance += amount));
  }

}
