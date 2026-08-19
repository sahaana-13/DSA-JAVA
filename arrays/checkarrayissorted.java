package arrays;
import java.util.*;

public class checkarrayissorted {

    public static boolean issorted() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the Elements");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(issorted());
    }
}