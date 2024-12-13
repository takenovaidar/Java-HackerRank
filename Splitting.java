import java.util.*;

public class Splitting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        scan.close();

        String[] tokens = s.split("[^A-Za-z]+");

        List<String> validTokens = new ArrayList<>();
        for (String token : tokens) {
            if (!token.isEmpty()) {
                validTokens.add(token);
            }
        }
        System.out.println(validTokens.size());

        for (String token : validTokens) {
            System.out.println(token);
        }
    }
}
