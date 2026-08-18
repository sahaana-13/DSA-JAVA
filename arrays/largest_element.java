package arrays;

import java.util.*;



public class largest_element{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the ar5ray");
        int n = sc.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the element");
            arr[i] = sc.nextInt();

        }

        int max = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.print("largest element:" + max);

    }
}