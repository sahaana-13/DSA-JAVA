package arrays.two_pointers;

import java.util.*;

public class threesum_closest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        Arrays.sort(arr);
        int closestsum = arr[0] + arr[1] + arr[2];
       

        for(int i=0;i<n-2;i++){
            int left = i+1;
            int right = n-1;

            while(left < right){
                int sum = arr[i] + arr[left] + arr[right];
                if(Math.abs(sum - target) < Math.abs(closestsum - target)){
                    closestsum = sum;
                }
                if(sum < target){
                    left++;
                } else {
                    right--;
                }
            }
        }
        System.out.println(closestsum);
    }
    
}
