public class PrimeNumbers {

  //8.Print all prime numbers between 1 and 100.
  public static void main(String[] args) {
    boolean isprime ;
    
    for(int i = 2; i<=100; i++){
       isprime = true; //taken from gpt
      for(int j = 2; j < i; j++){
        if ((i % j )== 0) {
          isprime = false;
          break; // taken from gpt
        }
      }
       if (isprime) {
          System.out.println(i);
        }
    }
  }
  
}
