import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbe");

        try {
            int number = scanner.nextInt();
            for (int j = 0; j < number; j++) {
                System.out.println();
                for (int i = 1; i <= number; i++) {
                    if (i == number) {
                        System.out.print(i);
                    } else {
                        System.out.print(i + ",");
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Podales litere zamiast cyfry");
        }




    }
}
