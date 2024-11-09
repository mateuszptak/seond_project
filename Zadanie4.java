import java.util.InputMismatchException;
import java.util.Scanner;

public class Zadanie4 {
    public static void main(String[] args) {
        System.out.println("PROSTY KALKULATOR");
        Scanner scanner = new Scanner(System.in);

        String signMethod = calcSign("Jakie działanie arytmetyczne chcesz dokonać? (+, -, *, /)");

        int num1 = input("Podaj pierwsza liczbę: ");
        int num2 = input("Podaj druga liczbę: ");

        scanner.close();

        int result;

        switchStatement(signMethod, num1, num2);
    }

    private static void switchStatement(String signMethod, int num1, int num2) {
        int result;
        switch (signMethod) {
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

    static String calcSign(String message) {
        try {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.next();
        } catch (InputMismatchException error) {
            System.out.println(error);
        }
        return "";
    }

    static int input(String message){
        try {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        return 0;
    }


}


// program relaizujacy funkcje latwego kalkulattora, dodawanie, odejmowanie, mnozenie, dzielenie.
// program ma identyfikowac sytuacje wprowadzenia blednego symbolu dzialania oraz probe dzielenia przez 0
// zastosowac instrukcje switch do wykonania odpowiedniago dzialania w zaleznosci od wprowadzonego symboli operacji.
// scenariuch dzialania
// wczytuje liczbe
// wczytuje symbol
// wczytuje druga liczbe

