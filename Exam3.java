import java.util.Scanner;

public class Exam3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int [] array = new int[N];
        int currentPosLength = 0;
        int currentNegLength = 0;
        int maxPosLength = 0;
        int maxNegLength = 0;
        for (int i = 0; i < array.length; i++) {
            int degree = console.nextInt();
            array[i] = degree;
            if (degree > 0) {
                currentPosLength++;
                maxNegLength = Math.max(maxNegLength, currentNegLength); // Update max for negative.
                currentNegLength = 0;
            } else if (degree < 0) {
                currentNegLength++;
                maxPosLength = Math.max(maxPosLength, currentPosLength); // Update max for positive.
                currentPosLength = 0;
            } else {
                maxPosLength = Math.max(maxPosLength, currentPosLength);
                maxNegLength = Math.max(maxNegLength, currentNegLength);
                currentPosLength = 0;
                currentNegLength = 0;
            }
        }

        maxPosLength = Math.max(maxPosLength, currentPosLength);
        maxNegLength = Math.max(maxNegLength, currentNegLength);

        if (maxPosLength <= 1 && maxNegLength <= 1) {
            System.out.println(0);
        } else {
            System.out.println(Math.max(maxPosLength, maxNegLength));
        }
    }
}
