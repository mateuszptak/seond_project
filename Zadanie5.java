import java.util.Scanner;

public class Zadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę całkowitą wiekszą od 1:");
        int number1 = scanner.nextInt();
        System.out.println("Podaj liczbę całkowitą większą od poprzedniej");
        int number2 = scanner.nextInt();
        scanner.close();

        if (number1 >= number2) {
            System.out.println("Błąd: Liczba pierwsza musi być mniejsza od liczby drugiej.");
            return;
        }



        // Obliczanie sumy za pomocą pętli while
        int sumWhile = 0;
        int i = number1;
        while (i <= number2) {
            sumWhile += i;
            i++;
        }
        System.out.println("Suma za pomocą pętli while: " + sumWhile);

        // Obliczanie sumy za pomocą pętli do-while
        int sumDoWhile = 0;
        i = number1;
        do {
            sumDoWhile += i;
            i++;
        } while (i <= number2);
        System.out.println("Suma za pomocą pętli do-while: " + sumDoWhile);

        // Obliczanie sumy za pomocą pętli for
        int sumFor = 0;
        for (i = number1; i <= number2; i++) {
            sumFor += i;
        }
        System.out.println("Suma za pomocą pętli for: " + sumFor);
    }


    }

//Napisz program pobierajacy od uzytkownika dwie liczby calkowite A oraz B. A < B, a nastepnie wysznaczjacy sume ciagu
//liczb od A do B czyli sume ciagu. Obliczenia nalezy wykonac trzykrotnie stosujac petle while, do while, for
