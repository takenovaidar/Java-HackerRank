import java.util.Scanner;

public class Exam6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];

        for (int i = 0; i < N; i++) {
            x[i] = console.nextInt();
            y[i] = console.nextInt();
        }

        int minDistancePair1 = -1, minDistancePair2 = -1;
        int maxDistancePair1 = -1, maxDistancePair2 = -1;
        double minDistance = Double.MAX_VALUE;
        double maxDistance = Double.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                double distance = Math.sqrt(Math.pow(x[j] - x[i], 2) + Math.pow(y[j] - y[i], 2));

                if (distance < minDistance) {
                    minDistance = distance;
                    minDistancePair1 = i + 1;
                    minDistancePair2 = j + 1;
                }

                if (distance > maxDistance) {
                    maxDistance = distance;
                    maxDistancePair1 = i + 1;
                    maxDistancePair2 = j + 1;
                }
            }
        }

        System.out.println(minDistancePair1 + " " + minDistancePair2);
        System.out.println(maxDistancePair1 + " " + maxDistancePair2);
    }
}


