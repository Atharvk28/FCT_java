package Logic_Building.Do_While_Loop;

import java.util.Scanner;

public class InputClass {
  
  static int inputNumber(){

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Number : ");
    int num = input.nextInt();
    return num;
  }
}
