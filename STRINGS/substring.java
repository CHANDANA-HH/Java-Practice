package STRINGS;

import java.util.Scanner;

//To check whether the second string is a subsequence of first
//Here the second string should appear in the same order as first string

public class substring {

    public static boolean subsequence(String s1, String s2,int i,int j)
    {
        char[] arr1=s1.toCharArray();
        char[] arr2 =s2.toCharArray();
        if(i==0)
        {
            return false;
        }
        if(j==0)
        {
            return true;
        }

        if(arr1[i]==arr2[j])
        {
            return subsequence(s1, s2, i-1, j-1);
        }
        else
        {
             return subsequence(s1, s2, i-1, j);
        }

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the main string:");
        String str1=sc.next();
        System.out.println("Enter the subsequence:");
        String str2=sc.next();
        int i=str1.length()-1;
        int j=str2.length()-1;
        if(subsequence(str1, str2, i, j))
        {
            System.out.println("Second string is a subsequence of first string");
        }
        else
        {
            System.out.println("Second string is not a subsequence of first string");
        }
    }
    
}
