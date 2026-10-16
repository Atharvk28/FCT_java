public class Square_Cube {
  public static void main(String[] args) {

    Square_Cube obj = new Square_Cube();

    obj.square_of_numbers();
    obj.cube_of_numbers();

  }
// ============================= Square of Numbers ========================== 
  void square_of_numbers() {
    System.out.println("To find the Square of Numbers ");
    int num = InputNumbers.inputNumbers();

    System.out.println("The square of numbers upto " + num + ": ");
    for (int i = 1; i <= num; i++) {

      System.out.print(i * i + ", ");
    }
  }
// =============================== Cube of Numbers ============================== 
  void cube_of_numbers() {

    System.out.println("To find the Cube of Numbers ");
    int numcube = InputNumbers.inputNumbers();

    System.out.println("\nThe cube of numbers upto" + numcube + ": ");

    for (int i = 1; i <= numcube; i++) {
      System.out.print(i * i * i + ", ");
    }
  }
}
