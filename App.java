import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        boolean stopRunning = false;

        while (!stopRunning) {
            try {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Podaj liczbe");
                int number = scanner.nextInt();
                for (int j = 0; j < number; j++) {
                    System.out.println();
                    for (int i = 1; i <= number; i++) {
                        if (i == number) {
                            System.out.print(i);
                        } else {
                            System.out.print(i + ",");
                        }
                        stopRunning = true;
                    }
                }

            } catch (Exception e) {
                System.out.println("Podales litere zamiast cyfry");

            }
        }
    }
}
