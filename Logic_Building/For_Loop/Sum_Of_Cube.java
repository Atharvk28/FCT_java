public class Sum_Of_Cube {
  public static void main(String[] args) {
    
     System.out.println("Sum of first N odd numbers.");
    int num = InputNumbers.inputNumbers();
    int sum = 0;
    for(int i = 1; i <= num; i+=2){
      sum += i;
    }
    System.out.println("the sum of first "+ num+" odd numbers is " + sum);
  
  }
  
}
