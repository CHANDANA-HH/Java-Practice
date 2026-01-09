package STRINGS;

import java.util.Scanner;

public class leftmost_nonrepeating {

    public static char nonrepeat(String str)
    {
        int[] arr = new int[256];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=-1;
        }
        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)]==-1)
            {
                arr[str.charAt(i)]=i;
            }
            else
            {
                arr[str.charAt(i)]=-2;
            }
        }

        int index=str.length();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0 && arr[i]<index)
            {
                index=arr[i];
            }
        }

        if(index==str.length())
        {
            return '$';

        }

        else
        {
            return str.charAt(index);
        }
    }

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your string:");
        String str=sc.next();
        char c = nonrepeat(str);
        System.out.println(c);
    }
    
}
