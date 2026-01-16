package GREEDY;

import java.util.Arrays;
import java.util.Scanner;

public class Min_platform {

     public static int findPlatform(int[] arr, int[] dep, int n) {

        Arrays.sort(arr);
        Arrays.sort(dep);

        int platforms=1;
        int maxPlatforms=1;

        int i=1,j=0;

        while(i<n && j<n)
        {
            if(arr[i]<=dep[j])
            {
                platforms++;
                i++;
                maxPlatforms = Math.max(maxPlatforms, platforms);
            }

            else
            {
                platforms--;
                j++;
            }

            

        }

        return maxPlatforms;
     }


       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of trains: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int[] dep = new int[n];

        System.out.println("Enter arrival times:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter departure times:");
        for (int i = 0; i < n; i++) {
            dep[i] = sc.nextInt();
        }

        int result = findPlatform(arr, dep, n);
        System.out.println("Minimum number of platforms required: " + result);
    }
    
}
