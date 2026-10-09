package Arrays;

public class InverseArr {
  public static void main(String[] args) {

    int arr[] = { 10, 20, 30, 40, 50, 60, 70, 80 };

    int i;
    int j = arr.length - 1;
    for (i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j--;
    }

    for (int x : arr) {
      System.out.println(x);
    }
  }
}
