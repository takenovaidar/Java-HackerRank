import java.util.*;
import java.text.*;

public class Currency {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indiaLocale = new Locale("en", "IN");  // India
        Locale usLocale = new Locale("en", "US");     // United States
        Locale chinaLocale = Locale.CHINA;            // China
        Locale franceLocale = Locale.FRANCE;

        NumberFormat indiaCurrencyFormat = NumberFormat.getCurrencyInstance(indiaLocale);
        NumberFormat usCurrencyFormat = NumberFormat.getCurrencyInstance(usLocale);
        NumberFormat chinaCurrencyFormat = NumberFormat.getCurrencyInstance(chinaLocale);
        NumberFormat franceCurrencyFormat = NumberFormat.getCurrencyInstance(franceLocale);

        String india = indiaCurrencyFormat.format(payment);
        String us = usCurrencyFormat.format(payment);
        String china = chinaCurrencyFormat.format(payment);
        String france = franceCurrencyFormat.format(payment);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
