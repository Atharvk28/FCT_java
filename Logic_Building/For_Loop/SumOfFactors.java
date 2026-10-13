import java.util.Scanner;

public class SumOfFactors {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number: ");
    int num = input.nextInt();
    int sum = 0;
    System.out.print("Factors of the given number are: ");

    for(int i =1; i <= num; i++ ){

      if (num % i == 0 ) {
        sum += i; 
        System.out.print(i+", ");
      }
    }
    System.out.println("\nSum of factors of "+ num+ " = "+ sum);
  }
  
}
