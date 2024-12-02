import java.util.Scanner;

public class Exam4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        String input = console.nextLine();

        String[] parts = input.split("=");
        String leftSide = parts[0];
        int rightSide = Integer.parseInt(parts[1]);

        int result = 0;

        if (leftSide.contains("x")) {
            char operation = leftSide.contains("+") ? '+' : '-';
            if (leftSide.indexOf("x") == 0) {
                int number = Integer.parseInt(leftSide.substring(2));
                result = operation == '+' ? rightSide - number : rightSide + number;
            } else {
                int number = Integer.parseInt(leftSide.substring(0, 1));
                result = operation == '+' ? rightSide - number : number - rightSide;
            }
        } else {
            String rightExpr = parts[1];
            char operation = rightExpr.contains("+") ? '+' : '-';
            if (rightExpr.indexOf("x") == 0) {
                int number = Integer.parseInt(rightExpr.substring(2));
                result = operation == '+' ? Integer.parseInt(parts[0]) - number : Integer.parseInt(parts[0]) + number;
            } else {
                int number = Integer.parseInt(rightExpr.substring(0, 1));
                result = operation == '+' ? Integer.parseInt(parts[0]) - number : number - Integer.parseInt(parts[0]);
            }
        }
        System.out.println("x = " + result);
    }
}
