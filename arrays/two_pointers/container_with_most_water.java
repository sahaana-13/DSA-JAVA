package arrays.two_pointers;

import java.util.*;

public class container_with_most_water {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int left = 0;
        int right = n-1;
        int max = 0;

        while(left < right){
            int width = right - left;
            int height = Math.min(arr[left],arr[right]);
            int area = width * height;
            max = Math.max(max,area);

            if(arr[left] <arr[right]){
                left++;
            }else{
                right--;
            }

        }
        System.out.println(max);
    }
    
}
