import java.util.Scanner;

import Control_statement.Iteration_Statements.for_loop;

public class Star_Printing{
  public static void main(String[] args) {
    
    // 1.Print a single star(*)
    System.out.println("*");


    // 2.Print four stars(****)
    System.out.println("****");

    // 3.Print same stars on same line.
    Scanner input = new Scanner(System.in);
    int num = input.nextInt();
    for(int i = 1; i <= num; i++){
      System.out.print(" *");
    }

    // Print increasing Triangle of stars.
    System.out.print("Enter the number to print * triangle");
    int n1 = input.nextInt();
    for(int i = 1; i <= n1; i++){
      for(int j = 0; j < i; j++){
      System.out.print("* ");

      }
    }
  }
}