import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "ramu");
        map.put(2, "Sita");
        map.put(1, "cherry");

        System.out.println(map);
    }
}
