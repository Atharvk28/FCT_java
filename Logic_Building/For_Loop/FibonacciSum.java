public class FibonacciSum {

  public static void main(String[] args) {

    int num = InputNumbers.inputNumbers();
    int seriessum = 0;
    int num1 = 0;
    int num2 = 1;
    System.out.println(num1 + "\n" + num2);
    for (int i = 0; i <= num2; i++) {
      int j = num2;
      num2 += num1;
      num1 = j;
      seriessum += num1;
      
      if (num2 > num) {
        break;
      }
      System.out.println(num2);
    }
    System.out.println("The sum of fibonacci series is : "+seriessum);
  }
}