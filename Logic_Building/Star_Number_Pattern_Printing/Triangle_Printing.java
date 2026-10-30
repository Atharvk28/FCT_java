import java.util.Scanner;


public class Triangle_Printing {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of rows of triangle to print: ");
    int num = input.nextInt();

    for(int rows = 1; rows <= num; rows++){
      int col1;
      for( col1 = rows; col1 > 0; col1--){
        System.out.print(" ");
      }
      for(int col2 = 1; col2 <= col1; col2++){
        System.out.print("* ");
      }
      System.out.println();
    }
  }
}
