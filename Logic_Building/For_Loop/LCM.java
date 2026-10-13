

public class LCM {

  public static void main(String[] args) {

    int num1 = InputNumbers.inputNumbers();

    int num2 = InputNumbers.inputNumbers();

    
    for (int i = 1; i < num1; i++) {
      if (i % num1 == 0 && i % num2 == 0 ) {
        System.out.println(i);
      }
      System.out.println(i);
    }

  }

}
