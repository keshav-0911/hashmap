import java.util.HashMap;
import java.util.Scanner;
public class Question {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int a = sc.nextInt();
        System.out.println("Enter the elements of the array");
        int[] array = new int[a];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println("Enter the sum");
        int k = sc.nextInt();
        HashMap<Integer, Integer> sum = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            sum.put(array[i], i);
        }
        for (int i = 0; i < array.length; i++) {
            int b = k - array[i];
            if(sum.containsKey(b) && sum.get(b) != i){
                System.out.println(i+ " " +sum.get(b));
                break;
            }
        }

    }
}
