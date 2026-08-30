package string;
import java.util.*;

public class validanagram{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();

        if(str.length()!= str2.length()){
            System.out.println("False");
            return;
        
        }
        int[]freq = new int[26];

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }

        for(int i=0;i<str2.length();i++){
            char ch = str2.charAt(i);
            freq[ch-'a']--;
        }

        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println("False");
                return;
            }
            
        }
        System.out.println("True");

    }
}
