import java.util.Scanner;

public class FibonacciSeries {
  public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    System.out.print("Enter the number:");
    int num = input.nextInt();

    int num1 = 0;
    int num2 = 1;
    System.out.println(num1 +"\n"+num2);
    for(int i=0;i<=num2;i++){
      int j = num2;
      num2 += num1;
      num1 = j;
      if ( num2 > num ) {
        break;
      }
      System.out.println(num2);

    
    }
  }
  
}
