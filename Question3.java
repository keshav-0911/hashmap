import java.util.HashMap;
import java.util.Scanner;
public class Question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> name = new HashMap<>();
        int a = sc.nextInt();
        sc.nextLine();
        for(int i = 0;i<a;i++){
            String key = sc.next();
            int value = sc.nextInt();
            name.put(key,value);
            sc.nextLine();
        }
        System.out.println(name);
        HashMap<String,Integer> age = new HashMap<>();
        for(String key : name.keySet()){
            age.put(key,name.get(key));
        }
        System.out.println(age);
    }
}
