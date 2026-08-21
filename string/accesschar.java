package string;
import java.util.*;

public class accesschar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String str2 = "java is very easy";
        String num = "100";
        StringBuilder sb = new StringBuilder();
        StringBuffer sd = new StringBuffer();
        String str3 = "    wtf    ";
        String str4 = "bro";
        

        String str1 = sc.nextLine();
        System.out.println(str);
        System.out.println(str1);
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" " );
            System.out.print(Character.isUpperCase(str.charAt(i))+ " ");
            
        }
        System.out.println(str1.charAt(2));
        System.out.println(Character.isUpperCase(str.charAt(3)));
        System.out.println(Character.isLowerCase(str.charAt(3)));
        System.out.println(Character.isDigit(str.charAt(5)));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));

        char [] arr = str.toCharArray();
        System.out.println(arr[2]);
        System.out.println(arr[4]);

        for(char ch : arr){
            System.out.print(ch + " ");
        }
        String [] arrr = str2.split(" ");

        for(String word: arrr){
            System.out.println(word + " ");
        }
        int n = Integer.parseInt(num);
        System.out.println(n+50);

        sb.append("java");
        sb.append(" ");
        sb.append("is easy");
        System.out.println(sb);
        sb.append(" Hello");
        System.out.println(sb);
        sb.delete(1,3);
        System.out.println(sb);
        sd.append("no");
        sd.append("where");
        System.out.println(sd);
        System.out.println(str3.trim());
        System.out.println(str3.concat("").concat(str4));
        String result = str2.replace('a','d');
        System.out.println(result);
        String str5 = sb.toString();
        System.out.println(str5);
        String str6 = str2.join(" ", str,str2);
        System.out.println(str6);
    }

    
}
