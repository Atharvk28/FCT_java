public class Sum_Of_Even {
  public static void main(String[] args) {
    System.out.println("Sum of first N even numbers.");
    int num = InputNumbers.inputNumbers();
    int sum = 0;
    for(int i = 0; i <= num; i+=2){
      sum += i;
    }
    System.out.println("the sum of first "+ num+" even numbers is " + sum);
  }
  
}
