package STRINGS;

import java.util.Scanner;

public class palindrome {

    public static boolean check(String str)
    {
        char[] arr= str.toCharArray();
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(arr[i]!=arr[j])
            {
                return false;
            }

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter your string:");
        String str=s.next();
       if(check(str))
       {
        System.out.println("String is palindrome");
       }
       else
       {
        System.out.println("String is not palindrome");
       }

    }
    
}
