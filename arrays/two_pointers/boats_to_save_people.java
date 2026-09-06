package arrays.two_pointers;
import java.util.*;

public class boats_to_save_people {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int val = sc.nextInt();

        Arrays.sort(arr);
        int left = 0;
        int right = n-1;
        int count = 0;

        while(left < right){
            if(arr[left] + arr[right] <= val){
                left++;
                right--;
                count++;
            } else {
                right--;
                count++;
            }
        }
        System.out.println(count);
    }
    
}
