import java.util.*;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String normalizedString = A.replace(" ", "").toLowerCase();
        String reversedString = new StringBuilder(normalizedString).reverse().toString();
        if (normalizedString.equals(reversedString)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}

