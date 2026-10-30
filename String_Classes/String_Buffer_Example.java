
public class String_Buffer_Example {
public static void main(String[] args) {
  StringBuffer sb = new StringBuffer();
  
  sb.append("Atharv ");
  // System.out.println(sb);

  sb.insert(6, " Kamble"); 
  // System.out.println(sb);
  
  sb.insert(0,"Hello");
  // System.out.println(sb);

  sb.delete(0, 5);
  // System.out.println(sb);

  // System.out.println(sb.length());
  // System.out.println(sb.reverse());
  // System.out.println(sb.capacity());

  // System.out.println(sb.charAt(4));
  

  sb.setCharAt(4,'R');
  // System.out.println(sb);

System.out.println(sb.capacity());
sb.ensureCapacity(50);                  //adding size(capacity) of String. 
System.out.println(sb.capacity());


// System.out.println(sb.capacity());
  sb.trimToSize();                      //Removes the extra space(size) of string. 
  System.out.println(sb.capacity());
}

  
}