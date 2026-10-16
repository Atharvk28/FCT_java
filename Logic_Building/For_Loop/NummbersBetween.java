public class NummbersBetween {
  public static void main(String[] args) {
    
    System.out.println("print the numbers between A and B divisible by '7'. ");

    int a = InputNumbers.inputNumbers();
    int b = InputNumbers.inputNumbers();

    for(int i = 0; a <= b; a++){
      
      if (a % 7 == 0 ) {
        System.out.println(a);
      }
    }
  }
  
}
