import java.util.Scanner;

public class Exam7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        long N = console.nextInt();
        int P = 1;
        boolean StanTurn = true;

        while (P < N) {
            int bestMultiplier = 9;
            for (int i = 2; i <= 9; i++) {
                if (P * i >= N) {
                    bestMultiplier = i;
                    break;
                }
                if(P * i > P * bestMultiplier) {
                    bestMultiplier = i;
                }
            }
            P *= bestMultiplier;

            if (P >= N) {
                if (StanTurn) {
                    System.out.println("Stan wins.");
                } else {
                    System.out.println("Ollie wins");
                }
                return;
            }
            StanTurn =! StanTurn;
        }
    }
}
