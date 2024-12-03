import java.util.*;

public class Exam5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int n2 = n * n;

        int[][] sudoku = new int[n2][n2];
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < n2; j++) {
                sudoku[i][j] = scanner.nextInt();
            }
        }

        if (checkRows(sudoku, n2) && checkColumns(sudoku, n2) && checkBlocks(sudoku, n, n2)) {
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }

    private static boolean checkRows(int[][] sudoku, int n2) {
        for (int i = 0; i < n2; i++) {
            if (!checkSet(sudoku[i], n2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkColumns(int[][] sudoku, int n2) {
        for (int j = 0; j < n2; j++) {
            int[] column = new int[n2];
            for (int i = 0; i < n2; i++) {
                column[i] = sudoku[i][j];
            }
            if (!checkSet(column, n2)) {
                return false;
            }
        }
        return true;
    }

    private static boolean checkBlocks(int[][] sudoku, int n, int n2) {
        for (int row = 0; row < n2; row += n) {
            for (int col = 0; col < n2; col += n) {
                if (!checkBlock(sudoku, row, col, n, n2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean checkBlock(int[][] sudoku, int startRow, int startCol, int n, int n2) {
        boolean[] seen = new boolean[n2 + 1];  // Отметки для чисел от 1 до n^2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int num = sudoku[startRow + i][startCol + j];
                if (num < 1 || num > n2 || seen[num]) {
                    return false;
                }
                seen[num] = true;
            }
        }
        return true;
    }

    private static boolean checkSet(int[] set, int n2) {
        boolean[] seen = new boolean[n2 + 1];  // Отметки для чисел от 1 до n^2
        for (int num : set) {
            if (num < 1 || num > n2 || seen[num]) {
                return false;
            }
            seen[num] = true;
        }
        return true;
    }
}
