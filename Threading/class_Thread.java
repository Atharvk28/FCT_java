
public class class_Thread {
  public static void main(String[] args) {
    task1 t1 = new task1();
    task2 t2 = new task2();

    t1.start();
    t2.start();
    

  }
  
}
class task1 extends Thread {
  
  public void run(){
    System.out.println("Thread first: ");
      for (int i = 1; i <= 50; i++) {
        System.out.println(i+ "Thread name: "+ Thread.currentThread().getName());
      }
      System.out.println();
  }

}

class task2 extends Thread {
  
  public void run(){
    System.out.println("Thread second: ");
      for (int i = 1; i <= 50; i++) {
         System.out.println(i+ "Thread name: "+ Thread.currentThread().getName());

      }
      System.out.println();
  }

}


