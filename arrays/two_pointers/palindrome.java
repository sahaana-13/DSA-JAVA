package arrays.two_pointers;

import java.util.*;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;

            }else{
                System.out.println("False");
                return;
            }
        }
        System.out.println("True");
    }
    
}
