import java.math.BigDecimal;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("PROSTY KALKULATOR");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Jakie działanie arytmetyczne chcesz dokonać? (+, -, *, /)");
        // .next przyjmuje ciag znakow czyli wszystko
        String sign = scanner.next();

        System.out.println("Podaj pierwsza liczbe");
        int num1 = scanner.nextInt();

        System.out.println("Podaj drugą liczbę");
        int num2 = scanner.nextInt();
        scanner.close();

        int result;

        switch (sign) {
            case "+":
               result = num1 + num2;
                System.out.println(result);
                break;
            case "-":
                result = num1 - num2;
                System.out.println(result);
                break;
            case "*":
                result = num1 * num2;
                System.out.println(result);
                break;
            case "/":
                result = num1 / num2;
                System.out.println(result);
                break;
            default:
                System.out.println("Błędcny znak");
        }
    }
}


// program relaizujacy funkcje latwego kalkulattora, dodawanie, odejmowanie, mnozenie, dzielenie.
// program ma identyfikowac sytuacje wprowadzenia blednego symbolu dzialania oraz probe dzielenia przez 0
// zastosowac instrukcje switch do wykonania odpowiedniago dzialania w zaleznosci od wprowadzonego symboli operacji.
// scenariuch dzialania
// wczytuje liczbe
// wczytuje symbol
// wczytuje druga liczbe

