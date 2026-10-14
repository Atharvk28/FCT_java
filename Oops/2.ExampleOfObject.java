package com.Oops;

class  Dog{
  String dogName = "rocky";

   void bark() {
     System.out.println(dogName + " barks!!!!!!!");
   }
}

class ExampleOfObject {
  public static void main() {

    Dog d1 = new Dog();
    d1.bark();

    d1.dogName = "Tiger";
    d1.bark();
    }
}
