package arrays.two_pointers;

import java.util.*;

public class squares_of_sorted_array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int [] res = new int[n];
        int k =n-1;
        int left = 0;
        int right = n-1;

        while(left <= right){
            if(Math.abs(arr[left]) < Math.abs(arr[right])){
                res[k] = arr[right] * arr[right];
                right--;
                k--;

            }else{
                res[k] = arr[left]*arr[left];
                left++;
                k--;
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(res[i] + " ");
        }
    }
    
}
