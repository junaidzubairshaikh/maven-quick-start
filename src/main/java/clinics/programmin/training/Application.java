package clinic.programming.training;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.StringUtils;

public class Application {

   public int countWords(String sentence) {
       String[] words = StringUtils.split(sentence,' ');
       return words == null? 0: words.length;
   }


    public void greet() {
        List<String> newList = new ArrayList<>();
        newList.add("Hello world");
        for(String greet: newList) {
            System.out.println(greet);
        }
    }

    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
	    Application app = new Application();
        app.greet();
        int count = app.countWords("i have five words now");
        System.out.println("I have counted the that sentence "+ count);
    }
}