package Exercises;

public class Exercise2 {
    public static void main(String[] args) {
       int a = Utils.input("Podaj pierwsza liczbe: ");
       int b = Utils.input("Podaj druga liczbe: ");
       int c = Utils.input("Podaj trzecia liczbe: ");

        // za pomoca biblioteki Math
        int max = getMax(a, b, c);
        int min = getMin(a, b, c);

        // za pomoca if do zrobienia mati


        showResult(min, max);

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

    private static void showResult(int min, int max) {
        System.out.println("Najmniejsza liczba to " + min);
        System.out.println("Największa liczba to " + max);
    }

    private static int getMin(int a, int b, int c) {
        int min= Math.min(Math.min(a, b), c);
        return min;
    }

    private static int getMax(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        return max;
    }


}

// wczytac od uzytkownika 3 liczby i wypisac na ekran najmniejsza i najwieksza z tych liczb
