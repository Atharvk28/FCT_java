import java.util.Scanner;

public class FactorialOfNumbers {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);

    System.out.println("Enter the Number: ");
    int num = input.nextInt();

    for(int i = num; i> 0; i--){

int result = num;
       for(int j = i-1 ;j > 0; j--){
       result*= j;

    }
      num--;
      System.out.println("The factorial of "+i+" is = "+result);
    }
  }
  
}
