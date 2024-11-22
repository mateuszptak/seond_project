package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Execise1 {
    public static void main(String[] args) {
        System.out.println("Program służący do konwersji stopni Celcjusza na Farenhait");
        System.out.println("Podaj stopnie w Celcjuszach");

        boolean stopRunning = false;

        while (!stopRunning) {
            try {
                Scanner scanner = new Scanner(System.in);
                double celcious = scanner.nextDouble();
                scanner.close();
               final double DONE_FARRENHEIT = 1.8 * celcious + 32;

                System.out.println(celcious + " stopnie C to " + DONE_FARRENHEIT + " F");
                stopRunning = true;
            } catch (InputMismatchException e) {
                System.out.println("Podałeś litere zamiast cyfry. Spróbuj ponownie");

            }
        }
    }
}

// napisz program sluzacy do konwersji stopni celcjusza na farenhite 1.8 + stopnie celcjusza + 32