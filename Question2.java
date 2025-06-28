import java.util.HashMap;
public class Question2 {
    public static void main(String[] args) {
        HashMap <String,Integer> name = new HashMap<>();
        name.put("Keshav" , 20);
        name.put("Kriti" , 26);
        name.put("Ashish",26);
        name.put("Bithika",21);
        System.out.println(name);
        for(String ans : name.keySet()){
            System.out.println(ans+" : "+name.get(ans));
        }
        System.out.println("Size of the Hashmap " + ":" + name.size());
        HashMap <String,Integer> age = new HashMap<>();
        age.put("Aditya",20);
        age.put("Daksh",21);
        age.put("Riya",21);
        age.put("Samriddhi",21);
        System.out.println(age);
        for(String ans : age.keySet()){
            System.out.println(ans+":"+age.get(ans));
        }
        System.out.println("Size of the Hashmap " + ":" + age.size());
        age.putAll(name);
        System.out.println("New HashMap: "+age);
        age.clear();
        System.out.println(age);
    }
}
