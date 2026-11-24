class InnerThreading_class extends Thread {
      int a, b;

  InnerThreading_class(int a, int b){
        this.a = a;
        this.b = b;
  }

  @Override 
  public void run(){
    System.out.println("threading class running. name is : "+ Thread.currentThread().getName());
    sum();
  }

  public void sum(){
    System.out.println("the sum of two numbers is : "+ (a+b));
  }
  
}


public class Threading_class {
  public static void main(String[] args) {

    InnerThreading_class c1 = new InnerThreading_class(5 ,6);

    Thread t1 = new Thread(c1);
    Thread t2 = new Thread(c1);

    t1.start();
    t2.start();

  }
  
}