import java.util.Scanner;

public class Substrings {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";

        // Initialize smallest and largest with the first substring of length k
        smallest = s.substring(0, k);
        largest = s.substring(0, k);

        // Iterate through all possible substrings of length k
        for (int i = 1; i <= s.length() - k; i++) {
            String substring = s.substring(i, i + k);

            // Update smallest and largest if necessary
            if (substring.compareTo(smallest) < 0) {
                smallest = substring;
            }
            if (substring.compareTo(largest) > 0) {
                largest = substring;
            }
        }

        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
