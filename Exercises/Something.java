package Exercises;

import java.util.Scanner;

public class Something {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 - 100.");

        int number = scanner.nextInt();
        // stała z przedrostkiem final + nazwa z drukowanych i spacja podkreslnikiem
        final int CONDITION_NUMBER = 10;

        if (number < CONDITION_NUMBER) {
            System.out.println("Liczba " + number + " jest mniejsza od " + CONDITION_NUMBER);
        } else if (number == CONDITION_NUMBER) {
            System.out.println("Liczba " + number + " jest równa " + CONDITION_NUMBER);
        } else {
            System.out.println("Liczba " + number + " wieksza od " + CONDITION_NUMBER);
        }
    }
}
