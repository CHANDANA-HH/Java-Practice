package STRINGS;

import java.util.Scanner;

public class anagram {
    public static boolean check_anagram(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
        int[] arr = new int[256];
        for(int i=0;i<s1.length();i++)
        {
            arr[s1.charAt(i)]++;
            arr[s2.charAt(i)]--;
        }

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                return false;
            }

            

        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1=sc.next();
        System.out.println("Enter the second string");
        String s2=sc.next();
        if(check_anagram(s1, s2))
        {
            System.out.println("Its a anagram");
        }
        else
        {
            System.out.println("Its not an anagram");
        }
    }
}
