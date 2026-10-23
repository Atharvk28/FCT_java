package Oops.Polymorphism;

/**
 * InnerPolymorphism_Example
 */
 class InnerPolymorphism_Example {

  
}
public class Polymorphism_Example {
  
  void add(int x, int y){
    System.out.println("addition : "+(x+y));
  }
  void add(int x, int y,int z){
    System.out.println("addition : "+(x+y+z));
  }
  void add(int x, int y, double z){
    System.out.println("addition : "+(x+y+z));
  }
  void add(int x, int y, float z){
    System.out.println("addition : "+(x+y+z));
  }
  public static void main(String[] args) {
    Polymorphism_Example obj = new Polymorphism_Example();

    obj.add(4,5);
    obj.add(4,5,5);
    obj.add(4,5,7);
    obj.add(4,5,1);

    
  }

}
