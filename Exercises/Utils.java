package Exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Utils {
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

    public static boolean isParameterInvalid(double price, double rate) {
        return price < 100 || price > 10000 || rate < 6 || rate > 48;
    }

    static int inputIntStatic(String message){
        try {
            System.out.println(message);
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println(e);
        }
        return 0;
    }


    int inputINtObject(String message){
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
