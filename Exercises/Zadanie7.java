package Exercises;

import java.util.Scanner;

public class Zadanie7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dowolna liczbe calkowita dodatnia:");
        int n = scanner.nextInt();
        scanner.close();

        // Sprawdzamy, czy liczba jest dodatnia
        if (n > 0) {
            // Pętla wypisująca liczby nieparzyste nie większe od n
            for (int i = 1; i <= n; i += 2) {
                System.out.print(i + " ");
            }
        } else {
            System.out.println("Podana liczba nie jest dodatnia.");
        }
    }
}


// napisz program ktory pobiera od uzytkownika liczbe calkowita dodatnia, a nastepnie wyswietla
// na ekranie kolejno
// wszystkie liczby nieparzyste nie wieksze od podanej liczby
// przyklad - dla 15 program powinien wyswietlic 1, 3, 5, 7, 9, 11, 13, 15
