import java.util.Enumeration;
import java.util.Vector;

public class Vecotrs_ {
  public static void main(String[] args) {
    Vector<String> list = new Vector<>();

    list.add("Atharv");
    list.add("PJ");
    list.add("Pranav");
    list.add("Mansur");
    list.add("Ajhar");
    list.add("Ram");
    list.add("Lakhan");

    // Enumeration class to print the elements in line properly

    Enumeration<String> e = list.elements();
    System.out.println("Using Enumeration:");
    while (e.hasMoreElements()) {
      System.out.println(e.nextElement());
    }

    // System.out.println(list);
  }
}