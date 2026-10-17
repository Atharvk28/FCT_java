
public class SumOfNumbers_doWhile {
  public static void main(String[] args) {

    int i = 1;
    int sum = 0;
    do {

      int num = InputClass.inputNumber();
      sum += num;

      if (num == 0) {
        break;
      }
      i++;
    } while (i < i + 2);
    System.out.println("The sum of numbers is : " + sum);
  }

}