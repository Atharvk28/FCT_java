import java.util.Scanner;

public class HCF {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the first number: ");
    int num1 = input.nextInt();

    System.out.print("Enter the second number: ");
    int num2 = input.nextInt();
int hcf = (num1 > num2)? num2 : num1;
    for(int i = 1; i<=hcf;i++){
    if(num1 % i == 0 && num2 %  i == 0 ){

      hcf = i;
    } 
    }
    System.out.println("The HCF of given numbers is: "+hcf);

  }
  
}
