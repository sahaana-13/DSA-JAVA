package arrays.two_pointers;

import java.util.*;

public class backspace_string_compare {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String t = sc.nextLine();
        int i = s.length()-1;
        int j = t.length()-1;
        int skipS = 0;
        int skipT = 0;

        while(i >= 0 || j >= 0){
            while( i>=0){
                if(s.charAt(i) == '#'){
                    skipS++;
                    i--;
                }else if(skipS>0){
                    skipS--;
                    i--;
                }else{
                    break;
                }


            }
             while( j>=0){
                if(t.charAt(j) == '#'){
                    skipT++;
                    j--;
                }else if(skipT>0){
                    skipT--;
                    j--;
                }else{
                    break;
                }
                

            }
            if(i >= 0 && j>=0){ 
                if(s.charAt(i) != t.charAt(j)){
                    System.out.println(false);
                    return;
                }else{
                    i--;
                    j--;
                }
            }
            else if(i >= 0 || j >= 0){
                System.out.println(false);
                return;
            }


        }
        System.out.print("true");

    }
    
}
