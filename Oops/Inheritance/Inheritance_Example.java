package Oops.Inheritance;

public class Inheritance_Example {
  public static void main(String[] args) {
    CurrentAccount ca_user = new CurrentAccount(); //object 1
    ca_user.balance = 5000;
    ca_user.accountHolderName = "Atharv Kamble";
    // ca_user.deposite(1000);
    ca_user.withdraw(2000);
    // System.out.println(ca_user.balance);

    Premium_SavingAccount sa_user = new Premium_SavingAccount(); //object 2
    sa_user.deposite(1000);
    System.out.println(sa_user.balance);
    sa_user.interestRate = 5;
    sa_user.applyInterest();

    // sa_user.
    



  }

}

/**
 * InnerInheritance_Example
 */
class Account {
  String accountHolderName;
  double balance;

  void deposite(double amount) {
    balance += amount;

    System.out.println("Depositd " + amount + "in " + accountHolderName + "account. New balance is " + balance);
  }
}

/**
 * InnerInheritance_Example
 */
class SavingAccount extends Account {
  double interestRate;

  void applyInterest() {
    double interest = balance * interestRate / 100;
    balance += interest;

    System.out.println("Deposited " + interest + " in " + accountHolderName + "account. New balance is " + balance);
  }

}

/**
 * InnerInheritance_Example
 */
class Premium_SavingAccount extends SavingAccount {
  double cashbackRate;

  void applyCashBack() {

    double cashback = balance * cashbackRate / 100;
    balance += cashback;

    System.out.println("Deposited " + cashback + " in " + accountHolderName + " account. New balance is " + balance);
  }

}
class CurrentAccount extends Account {
   double overdraftLimit;

   void withdraw(double amount){
     if(amount <= overdraftLimit + balance){
      balance -= amount;
      System.out.println(accountHolderName + "account. New balance is " + balance);
   }
   else{
    System.out.println("Withdrawal amount is out  your overdraft limit");
   }

   }
  
}

