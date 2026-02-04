//To find the maximum consecutive ones in an array

import java.util.Scanner;

public class Consecutive_one {

    public static int count(int[] arr)
    {
        int res=0;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==0)
            {
                count=0;
            }
            else{
                count++;
                res=Math.max(res, count);
            }
        }

        return res;
    } 


    public static void main(String[] args) {

         Scanner s= new Scanner(System.in);
        System.out.println("Enter the size of array:");
        int size=s.nextInt();
        int[] arr= new int[size];
        System.out.println("Enter the array elements:");
        for(int i=0;i<size;i++)
        {
            arr[i]=s.nextInt();
        }

        System.out.println(count(arr));
        
    }
}