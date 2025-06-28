import java.util.HashMap;
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> emIds = new HashMap<>();
        emIds.put("John", 12345);
        emIds.put("Carl", 54321);
        emIds.put("Jerry", 67890);
        System.out.println(emIds);
        System.out.println(emIds.get("Carl"));
        System.out.println(emIds.get(12345));
        System.out.println(emIds.containsKey("John"));
        System.out.println(emIds.containsKey("Keshav"));
        System.out.println(emIds.containsValue(12345));
        System.out.println(emIds.containsValue(2345));
        emIds.put("John",98765);
        System.out.println(emIds);
        emIds.put("Keshav",23456);
        System.out.println(emIds);
        emIds.replace("Kramer",23456);
        System.out.println(emIds);
        emIds.replace("Keshav",1600);
        System.out.println(emIds);
        emIds.putIfAbsent("John",222);
        System.out.println(emIds);
        emIds.putIfAbsent("Steve",45678);
        System.out.println(emIds);
        emIds.remove("Steve");
        System.out.println(emIds);
        emIds.remove(1600);
        System.out.println(emIds);
        for (String Ids : emIds.keySet()) {
            System.out.println(Ids + ":" + emIds.get(Ids));
        }
    }
}