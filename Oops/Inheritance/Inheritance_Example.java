package Oops.Inheritance;

public class Inheritance_Example {
  public static void main(String[] args) {
    SavingAccount userName = new SavingAccount();
    userName.deposite(1500);

    userName.accountHolderName = "Atharv Kamble";

    userName.interestRate = 5;
    userName.applyInterest();
   
    
  }
  
}
/**
 * InnerInheritance_Example
 */
 class Account {
  String accountHolderName;
  double balance;

  void deposite(double amount){
    balance += amount;

    System.out.println("Depositd " + amount +"in " + accountHolderName +"account. New balance is " + balance);
  }
}
/**
 * InnerInheritance_Example
 */
class SavingAccount extends Account  {
double interestRate;

void applyInterest(){
  double interest = balance * interestRate / 100;
  balance += interest;

  System.out.println("Deposited "+ interest + " in " + accountHolderName + "account. New balance is " + balance);
}
  
}
/**
 * InnerInheritance_Example
 */
 class Premium_SavingAccount {
  
  
}
