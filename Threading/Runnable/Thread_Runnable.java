
public class Thread_Runnable {
  public static void main(String[] args) {
    task1 t1 = new task1(1);
    task1 t2 = new task1(3);

    Thread th1 = new Thread(t1);
    Thread th2 = new Thread(t2);

    th1.start();
    th2.start();

  }
  
}

class task1 implements Runnable {

  int element;
  task1(int element){
    this.element = element;
  }
  @Override
  public void run() {
    System.out.println("This is runnable thread. element :" + element);
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'run'");
  }

  
}
