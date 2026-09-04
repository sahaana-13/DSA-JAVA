package arrays.two_pointers;

import java.util.*;

public class twosum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        int left = 0;
        int right = n-1;
        while(left<right){
            int sum = arr[left] + arr[right];
            if(sum == target){
                System.out.print("["+left+","+right+"]");
                break;
            }else if(sum < target){
                left++;
            }else{
                right--;
            }
        }
    }
    
}
