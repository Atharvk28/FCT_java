package Logic_Building.Do_While_Loop;

public class MultiPlicationTable_DoWhile {
  public static void main(String[] args) {

    int num = InputClass.inputNumber();
    int i = 1;
    do {
      System.out.println(num + " * " + i + " = " + num * i);
      i++;
    } while (i <= 10);
  }
  
}
