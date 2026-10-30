import java.util.StringTokenizer;

public class String_tokenizer {

  public static void main(String[] args) {

    String str = "Atharv,Kamble,Anurag,Rohan";

    StringTokenizer st = new StringTokenizer(str, ","); //delimiter passed in ","
    
    /*  here we have to give the delimiter to seperate the
 string if we don't give delimiter then default is space. */
    
    while (st.hasMoreTokens()) {
      System.out.println(st.nextToken());
    }

    
  }
  
}


