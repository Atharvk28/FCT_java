import java.util.Scanner;
//6.Calculate and print the factorial of a given number.
public class FactorialNumber {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the number: ");
    int num = input.nextInt();

    for(int i = num-1 ;i > 0; i--){
      num *= i;

    }
    System.out.println("The factorial of given number is: "+ num);
    
    input.close();
  }
}
