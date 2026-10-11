import java.util.Scanner;
//  9.Check whether the given number is a prime number.
public class CheckNumberIsPrime {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
  boolean isprime = true;

    System.out.println("Enter the number: ");
    int num = input.nextInt();

    for(int i = 2; i< num; i++){
      if((num % i) == 0){
        isprime = false;
        break;
      }
    }
    if (isprime) {
      System.out.println("the given number is prime.");
    }
    else{
      System.out.println("not a prime.");
    }
  }
  
}
