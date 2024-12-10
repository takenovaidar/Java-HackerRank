import java.io.*;
import java.util.*;

public class Strings {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        int num = A.length();
        int num2 =B.length();
        System.out.println(num+num2);

        int result = A.compareTo(B);
        if (result < 0) {
            System.out.println("No");
        } else if (result > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        String capitalize_A = A.substring(0,1).toUpperCase() + A.substring(1);
        String capitalize_B = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(capitalize_A+" "+capitalize_B);
    }
}

