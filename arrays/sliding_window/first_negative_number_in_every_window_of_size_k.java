package arrays.sliding_window;

import java.util.*;

public class first_negative_number_in_every_window_of_size_k {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int negative = 0;

        Deque <Integer> dq = new ArrayDeque<>();
        int left = 0;

       for(int right=0;right<n;right++){
        if(arr[right] < 0){
            dq.addLast(right);
        }

        if(right - left + 1 == k){
            while(!dq.isEmpty() && dq.peekFirst() < first){
                dq.removeFirst();
            }

            if(dq.isEmpty()){
                System.out.print("0 ");
            }
            else{
                System.out.print(arr[dq.peekFirst()] + " ");
            }
            left++;
        }

       }
        
       
        
        
    }
    
}
