import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwsza liczbe całkowita:");
        int a = scanner.nextInt();
        System.out.println("Podaj druga liczbe całkowita:");
        int b = scanner.nextInt();
        System.out.println("Podaj trzecia liczbe całkowita:");
        int c = scanner.nextInt();

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
}

// wczytac od uzytkownika 3 liczby i wypisac na ekran najmniejsza i najwieksza z tych liczb
