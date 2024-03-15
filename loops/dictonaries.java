package loops;
import java.util.HashMap;
import java.util.Map;
public class dictonaries {
     public static void main(String[] args) {
          Map<String,String>engspanDictionary=new HashMap<String,String>();
          engspanDictionary.put("monday","lunes");
          engspanDictionary.put("tuesday","lunes");
          engspanDictionary.put("wednesday","lunes");
          engspanDictionary.put("thursday","lunes");
          engspanDictionary.put("friday","lunes");
          engspanDictionary.put("saturday","lunes");
          System.out.println(engspanDictionary.get(args[0]));
          System.out.println(engspanDictionary.get(args[1]));
          System.out.println(engspanDictionary.get(args[2]));
          System.out.println(engspanDictionary.get(args[3]));
          System.out.println(engspanDictionary.get(args[4]));
          System.out.println(engspanDictionary.get(args[5]));

     }
}
