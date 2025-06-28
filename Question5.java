import java.util.HashMap;
import java.util.Scanner;
public class Question5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] nums = new int[x];
        for(int i = 0; i < x; i++){
            nums [i] = sc.nextInt();
        }
        int target = sc.nextInt();
        HashMap<Integer, Integer> ans = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            ans.put(nums[i], i);
        }
        for (int i = 0; i < nums.length; i++) {
            int a = target - nums[i];
            if (ans.containsKey(a) && ans.get(a) != i) {
                System.out.println(i + " : " + ans.get(a));
                break;
            }
            else{
                System.out.println("Not Found");
                break;
            }
        }
    }
}
