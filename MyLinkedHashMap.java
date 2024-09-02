import java.util.Map;
import java.util.LinkedHashMap;

//A hashmap implementation that maintains a doubly linked list runing through all of its 
//entries priserving the intersection order.
public class MyLinkedHashMap {
public static void main(String[] args) {
    Map<String, Integer> linkedHashMap = new LinkedHashMap<>();

 
        linkedHashMap.put("A", 1);
        linkedHashMap.put("B", 2);
        linkedHashMap.put("C", 3);

        System.out.println(linkedHashMap);
    }

}
    


