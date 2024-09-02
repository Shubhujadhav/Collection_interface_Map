import java.util.HashSet;
import java.util.Set;

public class SetTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        System.out.println(set+ "is set is empty?"+set.isEmpty());
        set.add("A");
        set.add("B");
        set.add("C");
        set.add("D");
        set.add("E");
        set.add("A");

        System.out.println("after adding :"+set);
        System.out.println((set+"is contains\"A\"?"+set.contains("A")));

        
    }
    
}
