
import java.util.HashMap;
import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
    }

    public static void printKeys(HashMap<String, String> hashmap) {
        for (String key : hashmap.keySet()) {
            System.out.println(key);
        }
    }
    
    public static void printKeysWhere(HashMap<String,String> hashmap, String text) {
        text = sanitizedString(text);               
        
        for(String key : hashmap.keySet()) {
            if(!key.contains(text)) {
                continue;
            }
            System.out.println(key);
        }
    }
    
    public static void printValuesOfKeysWhere(HashMap<String,String> hashmap, String text) {
        text = sanitizedString(text);
        
        for(String key : hashmap.keySet()) {
            if(!key.contains(text)) {
                continue;
            }
            
            System.out.println(hashmap.get(key));
        }
    }
    
    public static String sanitizedString(String string) {
        if(string == null) {
            return "";
        }
        
        string = string.toLowerCase();
        return string.trim();
    }

}
