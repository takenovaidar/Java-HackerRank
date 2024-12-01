import java.util.Scanner;

public class Exam2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int X1 = console.nextInt();
        int Y1 = console.nextInt();
        int X2 = console.nextInt();
        int Y2 = console.nextInt();
        if (X1-1 <= X2 && X2 <= X1+1 && Y1-1 <= Y2 && Y2 <= Y1+1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
