package DP;

import java.util.Scanner;

public class LCS {

    public static int longest_sub(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();

        int[][] dp=new int[n+1][m+1];

        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=m;j++)
            {
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else

                    {
                        dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                    }
            }
        }

        return dp[n][m];
    }


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1=sc.next();
        System.out.println("Enter the second string:");
        String s2= sc.next();

        System.out.println(longest_sub(s1,s2));

    }
    
}
