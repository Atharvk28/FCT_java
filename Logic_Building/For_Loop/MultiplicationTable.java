import java.util.Scanner;

//5. Print the multiplication table of a given number.

public class MultiplicationTable {
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the Number to print the Table: ");
    int num = input.nextInt();

    for(int i =1;i<=10;i++){
      System.out.println(num+" * "+i+" = "+(num*i));
    }

    input.close();

  }
}
