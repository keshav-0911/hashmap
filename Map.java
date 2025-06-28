import java.util.HashMap;
import java.util.Scanner;
public class Map {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        HashMap<String, Integer> Ids = new HashMap<>();
//        Ids.put("John", 12345);
//        Ids.put("Carl", 54321);
//        Ids.put("Jerry", 67890);
//        System.out.println(Ids);
//        for(String key : Ids.keySet()){
//            //
//            Ids.put(key, Ids.get(key)+1);
//            System.out.println(key + ":" + Ids.get(key));
//        }
        System.out.println("Enter the size of the array");
        int a = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int [] array = new int [a];
        for(int i = 0; i < array.length; i++){
            array [i] = sc.nextInt();
        }
        HashMap <Integer,Integer> frequency = new HashMap<>();
        for(int i = 0; i < array.length; i++){
            if (frequency.containsKey(array[i])) {
            frequency.put(array[i],frequency.get(array[i])+1);}
            else{
                frequency.put(array[i],1);
            }
        }
        for(int key : frequency.keySet()){
            System.out.println(key+":"+frequency.get(key) );
        }
    }
}
