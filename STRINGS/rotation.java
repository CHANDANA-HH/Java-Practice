import java.util.Scanner;

public class rotation {

    public static boolean areRotation(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        {
            return false;
        }
       return (s1 + s1).contains(s2);

    }

    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first string:");
        String s1= sc.next();
        System.out.println("Enter the next string:");
        String s2=sc.next();
        if(areRotation(s1, s2))
        {
            System.out.println("Its a rotational string");
        }

        else{
            System.out.println("Its a non rotational string");
        }
    }
    
}
