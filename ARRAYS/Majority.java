// Given an array arr[] and two elements x and y, return the element that occurs more frequently.
//  If both elements have the same frequency, return the smaller one.

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Majority {

    public int moreFrequent(List<Integer> arr, int x, int y) {

        int xcount = 0;
        int ycount = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == x) {
                xcount++;
            }
            if (arr.get(i) == y) {
                ycount++;
            }

        }

        if (xcount > ycount) {
            return x;
        } else if (ycount > xcount) {
            return y;
        } else
            return Math.min(x, y);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }

        System.out.print("Enter x: ");
        int x = sc.nextInt();

        System.out.print("Enter y: ");
        int y = sc.nextInt();

        Majority obj = new Majority();
        int result = obj.moreFrequent(arr, x, y);

        System.out.println("More frequent element is: " + result);
    }

}
