package arrays;

import java.util.*;

public class removeduplicates {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        int count = 1;

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int current = arr[0];

        for (int i = 51; i < n; i++) {

            if (current != arr[i]) {
                count++;
                arr[count - 1] = arr[i];
                current = arr[i];
            }
        }

        System.out.println(count);
    }
}