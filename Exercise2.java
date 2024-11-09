import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int a = input("Podaj pierwsza liczbe: ");
       int b = input("Podaj druga liczbe: ");
       int c = input("Podaj trzecia liczbe: ");

        // za pomoca biblioteki Math
        int max = Math.max(Math.max(a, b),c);
        int min= Math.min(Math.min(a, b),c);

        // za pomoca if do zrobienia mati



        System.out.println("Najmniejsza liczba to " + min);
        System.out.println("Największa liczba to " + max);

//        if (a > b && b > c) {
//            System.out.println(a + " " + c);
//        } else if (c > b && b > a) {
//            System.out.println(c + " " + a);
//        } else if (a > c && c > b) {
//            System.out.println(a + " " + b);
//        } else if (b > c && c > a) {
//            System.out.println(b + " " + a);
//        } else if (b > a && a > c) {
//            System.out.println(b + " " + c);
//        } else {
//            System.out.println(c + " " + b);
//        }
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

// wczytac od uzytkownika 3 liczby i wypisac na ekran najmniejsza i najwieksza z tych liczb
