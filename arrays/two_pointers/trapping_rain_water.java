package arrays.two_pointers;

import java.util.*;

public class trapping_rain_water {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] height = new int[n];
        for(int i=0;i<n;i++){
            height[i] = sc.nextInt();
        }

        int left = 0;
        int right = n-1;
        int leftmax = 0;
        int rightmax = 0;
        int ans = 0;

        while(left < right){
            if(height[left] < height[right]){
                if(height[left] >= leftmax){
                    leftmax = height[left];
                }else{
                    ans += leftmax - height[left];
                }
                left++;
            }
            else{
                if(height[right] >= rightmax){
                    rightmax = height[right];
                }else{
                    ans += rightmax - height[right];
                }
                right--;
            }
        }
        System.out.println(ans);
    }


        
    
}
