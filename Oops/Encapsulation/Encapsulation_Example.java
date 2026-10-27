package Oops.Encapsulation;


class BankAccount {

  private String accHolderName;

   private double balance;

  // BankAccount(double balance){
  //   this.balance = balance;
  // }

  BankAccount( double balance,String accHolderName){
    this.balance = balance;
    this.accHolderName = accHolderName;
  }

  public  double getbalance(){
    return balance;
  }
  public void setbalance(double balance){
    this.balance = balance;
  }

  public String getAccHolderName(){
    return accHolderName;
  }

  //  public void setAccHolderName(){
  //   this.accHolderName = accHolderName;
  // }

  double deposit(double amount){
    if (amount <= 0) {
      System.out.println("Please enter valid amount!");
    }
    System.out.println("");
    return balance += amount;
  }

  double withdraw(double amount){
    if (amount > balance || balance == 0) {
      System.out.println("Balance is not sufficient!");
    }
    return balance -= amount;
  }
  
}


public class Encapsulation_Example {

  public static void main(String[] args) {
    
    BankAccount atharv = new BankAccount(1000,"Atharv");

     atharv.deposit(1000);
    System.out.println("account balance: " + atharv.getbalance());

    atharv.withdraw(200);
    System.out.println("account balance: " + atharv.getbalance());


    
  }
}