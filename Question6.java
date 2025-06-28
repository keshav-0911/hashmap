import java.util.HashMap;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap <Character,Integer> answer = new HashMap<>();
        System.out.println("Enter your String");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++){
            if(answer.containsKey(str.charAt(i))){
                answer.put(str.charAt(i),answer.get(str.charAt(i))+1);
            }
            else{
                answer.put(str.charAt(i),1);
            }
        }
        for(char i : answer.keySet()){
            for(int j = 0; j < answer.get(i); j++){
                System.out.print(i);
            }
        }
    }
}
