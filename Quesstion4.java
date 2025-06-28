import java.util.HashMap;
import java.util.Scanner;
public class Quesstion4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <Integer,Integer> ans = new HashMap<>();
        int a = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < a; i++) {
            int b = sc.nextInt();
            int c = sc.nextInt();
            ans.put( b, c );
        }
        for(int i : ans.keySet()){
          for(int j = 0; j < ans.get(i); j++){
              System.out.println(i);
          }
        }
    }
}
