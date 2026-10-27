package Oops.Abstraction;

public class Getter_Setter {
  public static void main(String[] args) {

    Student obj = new Student();

    obj.setName("Atharv");

    System.out.println("Student name is " + obj.getName() );
    
  }
  
}/**
* Student
 */
class Student {
private String name;

public void setName(String name){
  this.name = name;
}

public String getName(){
  return  name;
}
  
}

