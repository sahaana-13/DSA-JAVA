package arrays;
import java.util.*;

public class secondlargest_element{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the array");

        int n = sc.nextInt();
        int[]arr = new int[n];
        int max = arr[0];
        int secondmax = Integer.MIN_VALUE;
        System.out.println("Enter the Elements");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if(arr[i]> max && arr[i] > secondmax){
                secondmax = max;
                max = arr[i];
            }
            if(arr[i]<max && arr[i] >secondmax){
                secondmax = arr[i];
            }
        }
        System.out.println("Second Largest Element:" + secondmax);

    }
}