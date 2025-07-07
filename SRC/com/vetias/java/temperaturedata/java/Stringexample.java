
import java.util.Arrays;

public class Stringexample {
   public static void main(String[] args) {
      String firstname = "Raja";
      String shortname = "Raja";
      String buddyname = new String ( "Raja");
      System.out.println(firstname == shortname);
      System.out.println(firstname == buddyname); 
      

      String sentence = "this program shows how can we split a string into multiple string";
      String words[] = sentence.split(" "); 
      System.out.println(words.length);
      System.out.println(Arrays.toString(words));
}
} 