import java.util.Scanner;
import java.time.LocalTime;
public class Exam1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int lessons = console.nextInt();
        LocalTime first_lesson = LocalTime.of(9, 00);
        LocalTime end = first_lesson;
        for (int i = 0; i < lessons; i++) {
            end = end.plusMinutes(45);
            if (i < lessons - 1) {
                if (i % 2 == 0) {
                end = end.plusMinutes(5);
                } else if (i % 2 != 0) {
                end = end.plusMinutes(15);
                }
            }
        } System.out.println(end);
    }
}
