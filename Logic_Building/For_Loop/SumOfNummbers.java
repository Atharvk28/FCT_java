public class SumOfNummbers {
  public static void main(String[] args) {
    System.out.println("Sum the N natural numbers.");
    int num = InputNumbers.inputNumbers();

    int sum = 0;
    for(int i = 1; i <= num; i++){
      sum += i; 
    }
    System.out.println("the sum of first "+ num+ " natural numbers is : "+sum);
  }
  
}
