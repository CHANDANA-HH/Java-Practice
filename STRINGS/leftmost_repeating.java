package STRINGS;

import java.util.Scanner;

public class leftmost_repeating {
    public static char leftmost(String str)
    {
        boolean[] arr= new boolean[256];
        int res=-1;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(arr[str.charAt(i)])
            {
                res=i;
            }

            arr[str.charAt(i)]=true;
        }

        return str.charAt(res);

    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string");
        String str=sc.next();

        char c=leftmost(str);
        System.out.println(c);
    }
}
