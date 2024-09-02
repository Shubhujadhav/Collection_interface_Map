import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    private static final String Map = null;

    public static void main(String[] args) {
        Map<String, Integer> hashMap=new HashMap<>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        
        System.out.println("Hashmap :"+hashMap);

        System.out.println("All keys :" +hashMap.keySet());
        System.out.println("All values are:" +hashMap.values());
        System.out.println("removing values :"+hashMap.remove("three"));
        System.out.println("after removing a value thre "+hashMap);
    }
    
}

