import java.util.HashMap;

public class HashMapDemo {
  public static void main(String[] args) {
    HashMap <Integer, String> map = new HashMap<>();

    map.put(101,"Atharv");
    map.put(102,"Pranav");
    map.put(103,"Prasanjeet");
    map.put(104,"Sancheet");

    System.out.println(map.get(101));

    System.out.println(map.containsKey(103));


    System.out.println(map.remove(103));


    for (Integer key : map.keySet()) {
      System.out.println("key: "+ map.get(key));
    }

  }
}
